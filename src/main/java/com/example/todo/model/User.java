package com.example.todo.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, length = 100)
	private String userid;
	
	@Column(nullable = false, length = 100)
	private String userpassword;

	@Column(nullable = false, length = 100)
	private String username;

	@Enumerated(EnumType.STRING)
	private RoleType role;

	private String usernickname;

	public void update(String userpassword, String usernickname){
		this.userpassword = userpassword;
		this.usernickname = usernickname;
	}
}