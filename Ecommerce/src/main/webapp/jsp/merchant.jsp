<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is MERCHANT PAGE</h1>

	<form>
		<fieldset>
			<legend>Login Here,</legend>
			<table>
				<tr>
					<th>Email:</th>
					<th><input type="email" name="email" required="required"></th>
				</tr>
				<tr>
					<th>Password:</th>
					<th><input type="password" name="password" required="required"></th>
				</tr>
				<tr>
					<th><button>Login</button></th>
					<th><button type="reset">Cancel</button></th>
				</tr>
				<tr>
				<th	 colspan="2"><a href="">New? Click here to Create Account</a></th>
				</tr>
			</table>
		</fieldset>
	</form>
	<br>
	<a href="/"><button>Back</button></a>
	</body>
</html>
</body>
</html>