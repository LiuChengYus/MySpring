<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false" %>
<%
    String path = request.getContextPath();
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <title>Ajax</title>
</head>
<html>
<script src="js/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
   /* var  data={"id":"1","name":"小红","age":"12"}
    alert(data.id+data.name+data.age);*/
    /*  var data=[{"id":"1","name":"小红","age":"12"},{"id":"2","name":"小明","age":"22"}]
      $.each(data,function(i,dom){
          alert(dom.id+"\r\n"+dom.name+"\r\n"+dom.age);
      })*/

    $(function(){
        $("[name=action]").blur(function(){
            //Post请求
          /*  $.post("/servlet/FirstServlet",{"action":$("[name=action]").val()},function(data){
                $("#msg").html(data);
            });*/
          //get请求
           $.get("/servlet/FirstServlet",{"action":$("[name=action]").val()},function(data){
                $("#msg").html(data);
            });
            //Getjson请求
           /* $.getJSON("/servlet/FirstServlet",{"action":$("[name=action]").val()},function(data){
                $("#msg").html(data);
            });*/
           //load
           // $("#msg").load("/servlet/FirstServlet",{"action":$("[name=action]").val()});
            //serialize
           /* var data=$("#form").serialize();
            alert(data);*/
            //serializeArray
          /*  var data=$.param($("#form").serializeArray());
            alert(data);*/
        });


    });
    function newAjax(){
      $("[name=action]").blur(function(){
          $.ajax(
              {
                  url:"/servlet/FirstServlet",
                  type:"POST",
                  data:{"action":$("[name=action]").val()},
                  async:true,
                  success:function(data){
                      $("#msg").html(data);
                  }
              }
          );
      });
    }
    function oldAjax(){
        $("[name=action]").blur(function(){
            //1.发送ajax请求
            var xhr=null;
            if(window.XMLHttpRequest){//非IE浏览器(版本比较高的IE)
                xhr=new XMLHttpRequest();
            }else{
                //code  execute  here 说明是IE
                xhr=new ActiveXObject("Microsoft.XMLHTTP");
            }
            //01.能准备发送请求的  方式  目标地址  是否异步  true  异步
            xhr.open("POST","/servlet/FirstServlet",true)
            xhr.onreadystatechange=function(){
                if(xhr.readyState==4 && xhr.status==200){  //认为请求已经发送成功
                    //一个系统对象的属性，获取到响应回来的文本
                    var data=xhr.responseText;
                    //alert(data)
                    $("#msg").html(data);
                }
            }
            //请求头必须有Content-Type
            xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded")
            xhr.send("action="+$("[name=action]").val());


        });
    }
</script>


      <body>
            <form id="form" name="form">
                <input  name="action"/><span id="msg"></span>
                <input  name="upwd" value="111"/></span>
                <input  name="uaddress" value="北京"/></span>
            </form>
     </body>


</html>
