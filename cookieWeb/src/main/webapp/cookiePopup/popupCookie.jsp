<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String chkVal = request.getParameter("notopenToday");		//"notopenToday" 매개변수 값 얻기
	
	if(chkVal != null && chkVal.equals("1")) {//값이 "1"이고 체크한 상태이면 => 쿠키 생성해 응답 헤더 추가
		Cookie cookie = new Cookie("PopupClose", "off");
		cookie.setPath(request.getContextPath());				//
		cookie.setMaxAge(60);									//
		response.addCookie(cookie);								//
		out.println("쿠키 : 1분 동안 열지 않음");						//
	}
%>
