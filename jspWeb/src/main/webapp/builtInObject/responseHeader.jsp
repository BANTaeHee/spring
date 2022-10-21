<%@page import="java.util.Collection"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	
	
	
<!DOCTYPE html>
<html>
<head>
	<%
		// 응답 헤더에 추가할 값 준비
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		// 1970년 1월 1일 0시0분 0초부터 현재까지의 시간을 밀리초 단위로 환산한 값	
		long add_date = s.parse(request.getParameter("add_date")).getTime();
		int add_int = Integer.parseInt(request.getParameter("add_int"));
		String add_str = request.getParameter("add_str");
		
		response.addDateHeader("today", add_date);
		response.addIntHeader("mygoal", add_int);
		response.addIntHeader("mygoal", 0112);
		response.addHeader("myname", add_str);
		response.addHeader("myname", "이도");
	%>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>내장 객체 - response</title>
</head>
<body>
	<h2>응답 헤더 정보 출력하기</h2>
	<%
		Collection<String> headerNames = response.getHeaderNames();
		for(String hName : headerNames) {
			String hValue = response.getHeader(hName);
	%>
			<li><%= hName %> : <%=hValue %></li>
	<%
		}
	%>
</body>
</html>