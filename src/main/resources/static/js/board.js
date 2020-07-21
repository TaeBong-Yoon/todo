let index = {
	init:function(){
		$("#btn-save").on("click",()=>{
			this.save();
        });
        $("#btn-delete").on("click",()=>{
			this.deleteById();
		});
	},
	save:function(){
		let data = {
			title:$("#title").val(),
		};
        console.log(data)
        $.ajax({
            type:"POST",
            url:"/api/boards",
            data:JSON.stringify(data),
            contentType:"application/json; charset=utf-8",
            dataType:"json"
        }).done(function(resp){
            alert('Write Success.');
            location.href = "/boards";
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    },
    deleteById:function(){

        var checkArr = [];
        $("input[name='boardList']:checked").each(function(i){ 
            checkArr.push(Number($(this).val()));
            console.log(typeof $(this).val())
            console.log(typeof Number($(this).val()))
        })
        $.ajax({
            type:"DELETE",
            url:"/test",
            data:JSON.stringify(checkArr),
            dataType:"json"
        }).done(function(resp){
            alert('Delete Success.');
            location.href = "/boards";
        }).fail(function(error){
            alert(JSON.stringify(error));
        });
    }
}
index.init();