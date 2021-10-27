<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert title here</title>
<body>
	<form action="insert-data" method="post">
	아이디: <input type="text" name="user_id"> <br>
	비밀번호: <input type="password" name="user_password"> <br> 
	이름: <input type="text" name="user_name"> <br>
	연락처: <input type="tel" name="user_phone"> <br>
	<input type="submit" value="전송">
	</form>
</body>
</html>