let index = {
	init:function(){
		$("#btn-save").on("click",()=>{ // this를 바인딩하기 위해 ()=>{}사용
			this.save();
		});
		$("#btn-update").on("click",()=>{
			this.update();
		});
	},
	save:function(){
		let data = {
			userid:$("#userid").val(),
			userpassword:$("#userpassword").val(),
			username:$("#username").val()
		};
        $.ajax({
            type:"POST",
            url:"/auth/joinProc",
            data:JSON.stringify(data),
            contentType:"application/json; charset=utf-8",
            dataType:"json"
        }).done(function(resp){
            alert('Sign Up Success.');
            console.log(resp);
            location.href = "/";
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    },
}

index.init();