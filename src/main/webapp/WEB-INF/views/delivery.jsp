<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="delivery-request" method="post">
	배송받을사람(이름): <input type="text" name = customer_name><br>
	배송지(주소): <input type="text" name = customer_addres><br>
	연락처: <input type="tel" name = customer_phone><br>
	택배기사님께 요청사항: <input type="text" name = customer_etc><br>
	<input type="submit" value="전송">
	</form>

</body>
</html>