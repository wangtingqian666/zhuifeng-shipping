$(function() {
    $("#register").click(function(){
        var uname=$("#uname").val();
        if(null==uname||""==uname){
            alert("用户名不能为空");
            return;
        }
        var upass=$("#upass").val();
        if(null==upass||""==upass){
            alert("密码不能为空");
            return;
        }
        var repass=$("#repass").val();
        if(upass!=repass){
            alert("两次密码不一致");
            return;
        }
        var uemail=$("#uemail").val();
        if(null==uemail||""==uemail){
            alert("邮箱不能为空");
            return;
        }
        var flg= $("#checkbox").prop('checked');
        if (flg){
            $("#form").submit();
        }else{
            alert("请勾选我同意");
        }
    })
})