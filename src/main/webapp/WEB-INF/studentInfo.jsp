<%@page import="com.jbedu.test.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	
		Student student = new Student("홍길동",27,3);
		String name = student.getName();
		int age = student.getAge();
		int grade = student.getGrade();
	
	
	%>
	학생이름 : <%=name %><br>
	학생나이 : <%=age %><br>
	학생학년: <%=grade %><br>
	
</body>
</html>