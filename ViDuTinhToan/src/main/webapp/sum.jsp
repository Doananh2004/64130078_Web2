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
		//Lấy tham số từ URL
		//http://localhost:8888/ViDuTinhToan/sum.jsp?a=5&b=6
		String strA = request.getParameter("a");
		int valueA = Integer.parseInt(strA);
		String strB = request.getParameter("b");
		int valueB = Integer.parseInt(strB);
		out.print("Tổng của ");
		out.print(valueA);
		out.print(" và ");
		out.print(valueB);
		out.print(" là ");
		out.print(valueA + valueB);
	%>
</body>
</html>