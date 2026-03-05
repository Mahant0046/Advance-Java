<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome User JSP</title>
<s:head/>
<s:actionerror/>
<s:actionmessage/>
</head>
<body>
   <s:form action="welcomeUser" method="post">
      <s:textfield name="username" label="Username"/>
      <s:textfield name="email" label="email"/>
      <s:password name="password" label="password"/>
      <s:submit />
   </s:form>
</body>
</html>