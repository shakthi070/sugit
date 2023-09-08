<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
<h1>This is ADMIN PAGE</h1>
<form>
<fieldset>
<legend>login here,</legend>

<table>
<tr>
    <th>Email:</th>
    <th><input type="email" name="email" required="required"></th>
</tr>

<tr>
    <th>password:</th>
    <th><input type="password" name="passeord" required="required"></th>
</tr>
<tr>
<th><button>Login</button></th>
<th><button type="reset">Cancel</button></th>
</tr>
</table>
</fieldset>

</form>
<br>
<a href="/"><button>Back</button></a>
</body>
</html>