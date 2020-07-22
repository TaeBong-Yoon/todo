package com.example.todo.config;

import com.example.todo.config.auth.PrincipalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true) // 특정 주소로 접근을 하면 권한 및 인증을 미리 체크하겠다는 뜻
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private PrincipalDetailService principalDetailService;

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    @Bean
    public BCryptPasswordEncoder encodePWD() { // 고정길이의 문자열로 바꿔준다. (비밀번호 해시)
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(principalDetailService).passwordEncoder(encodePWD());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "/auth/**", "/js/**", "/css/**", "/image/**") // auth 경로는
                .permitAll() // 누구나 들어올 수 있다.
                .anyRequest() // 그걸 제외한 모든 요청은
                .authenticated() // 인증이 되야한다.
                .and()
                .formLogin() // localhost://8000 로 접근하면 자동으로
                .loginPage("/auth/loginForm") // /auth/loginForm을 띄어준다
                // 스프링 시큐리티가 해당 주소로 요청오는 로그인을 가로채고, 대신 로그인을 진행한다.
                .loginProcessingUrl("/auth/loginProc")
                .defaultSuccessUrl("/"); // 성공했을때의 기본 url을 "/"로 지정한다.

    }


}

