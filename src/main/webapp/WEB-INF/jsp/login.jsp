<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>南师大租户信息数据管理系统</title>
    <link rel="stylesheet" type="text/css" href="css/login.css">
    <script type="text/javascript" src="jquery-easyui-1.3.3/jquery.min.js"></script>
    <script type="text/javascript">
        function login(){
            var userName=$("#userName").val();
            var password=$("#password").val();
            var roleName=$("#roleName").val();
            if(userName==null||userName==""){
                alert("用户名不能为空！");
                return;
            }
            if(password==null||password==""){
                alert("密码不能为空！");
                return;
            }

            $("#adminlogin").submit();

        }
    </script>
    <script type=text/javascript>
        if('${errorMsg}'!=''){
            alert('${errorMsg}');
        }
    </script>
</head>
<body>
<div class="login_box">
    <div class="login_l_img"><img src="images/login-img.png" /></div>
    <div class="login">
        <div class="login_logo"><a href="#"><img src="images/login_logo.png" /></a></div>
        <div class="login_name">
            <p>租户信息数据管理系统</p>
        </div>
        <form id=adminlogin  method=post
              name=adminlogin action="<c:url value = "/login"/>"  >
            <div><input type="text"  name="userid" id="userName"  placeholder="用户名"></div>

            <input name="password" type="password" id="password"  placeholder="密码"/>

            <c:if test="${!empty error}"><font color="red"><c:out value="${error}"/></font></c:if>
            <input value="登录" onclick="javascript:login();return false;" style="width:100%;" type="submit">
        </form>
    </div>
    <div class="copyright">南师大科技园   &nbsp;&nbsp;版权所有 &nbsp;&nbsp; ©2017-2018 &nbsp;&nbsp;&nbsp; 技术支持：南京大学/南京师范大学</div>
</div>


</body>
</html>
