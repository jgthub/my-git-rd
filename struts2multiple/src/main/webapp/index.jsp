<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>

<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Name Page</title>
</head>

<body>
  <s:form action="addEntry">
    <s:textfield label="First Name:" name="fname" />
    <s:textfield label="Last Name" name="lname" />
    <s:submit value="ADD" />
    <s:token />
  </s:form>
</body>

</html>