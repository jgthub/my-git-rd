<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Enumeration keys = session.getAttributeNames();
out.println(keys.hasMoreElements());
	while (keys.hasMoreElements()){
	   String key = (String)keys.nextElement();
	   out.println(key + ": " + session.getValue(key) + "<br>");
	}
%>
  <h1>Your details are submitted successfully</h1>
</body>
</html>