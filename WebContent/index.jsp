<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Login Form</h1>
<br/>
<s:form action="loginAction" method="post">
<s:textfield label="Enter UserName" name="userid" />
<s:password label="Enter Pasword" name="password" />
<s:submit/>
<s:reset/>
</s:form>
<s:a href="registration.html">Register Here</s:a>
</body>
</html>