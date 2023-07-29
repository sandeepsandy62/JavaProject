<%@ page language="java" contentType=" text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div align=center>
<h1>Create Account</h1>

<form action="userServlet" method="post">
<table>

<tr>
<td>User Email</td>
<td><input type="text" name="email"/></td>
</tr>

<tr>
<td>New Password</td>
<td><input type="password" name="newPassword"/></td>
</tr>

<tr>
<td>Confirm Password</td>
<td><input type="password" name="confirmPassword"/></td>
</tr>

<tr>
<td><input type="submit" value="Signup" /></td>
</tr>

</table>
</form>

</div>



</body>
</html>