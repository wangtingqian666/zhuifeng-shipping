$(function() {
    $("#login").click(function(){
        var uname=$("#uname").val();
        var upass=$("#upass").val();
        if (null==uname||""==uname){
            $("#msg").html("对不起,用户名不能为空");
            return;
        }
        if (null==upass||""==upass){
            $("#msg").html("对不起,密码不能为空");
            return;
        }
        $("#form").submit();
        /*$.ajax({
            url:"login",
            type:"post",
            data:{"uname":uname,"upass":upass},
            dataType:"json",
            success:function(data){
                if (data.code=="250"){
                    $("#msg").html(data.message);
                }else{
                    alert(data.message)
                   location.href="/jumphelpin"
                    // $.get("jumphelpin",function(data){})
                }
            }
        })*/
    })
})