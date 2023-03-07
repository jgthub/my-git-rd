<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Contact Details</title>
</head>

<body>
  <s:form action="addContact">
    <s:textfield label="Mobile number:" name="mobileNum" />
    <s:textfield label="E-mail Id:" name="emailId" />
    <s:submit value="ADD" />
    <s:token />
  </s:form>
</body>

</html>