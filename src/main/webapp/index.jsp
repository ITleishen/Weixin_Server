<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>尚康阳光</title>
<script type="text/javascript" src="static/jquery-3.2.0.js"></script>
<script>
	$(function(){
		/* $.ajax({
			type: "POST",
	        url: "/user/register/agent",
	        data: {username:'jerry', password: 'duyu2008', mobile: '15828645446', pid: '002'},
	        dataType: "json",
	        //contentType : 'application/json;charset=utf-8',
	        success: function(data){
	          console.log(data);          
	        }
		})  */
		
	})
</script>
</head>
<body>
	<h2>欢迎来到尚康阳光！</h2>
	<form action="/user/register/agent" method="post" enctype="multipart/form-data">
		<div>
			用户名:<input type="text" name="username" value="徐耀会"/>
		</div>
		<div>
			密码:<input type="text" name="password" value="123456"/>
		</div>
		<div>
			电话:<input type="text" name="mobile" value="13857894781"/>
		</div>
		<div>
			父级电话/编码:<input type="text" name="pid" value="002"/>
		</div>
		<div>
			头像：<input type="file" name="file" />  
		</div>
		<input type="submit" value="注册个人代理商" /> 
	</form>
</body>
</html>