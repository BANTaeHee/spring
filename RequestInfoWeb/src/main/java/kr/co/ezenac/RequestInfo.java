package kr.co.ezenac;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestInfo
 */
@WebServlet("/req") // 1. ���� ȣ�Ⱑ���� ���α׷����� 
public class RequestInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Ŭ���̾�Ʈ�� ��û�� �Ķ���� ������ ���ڵ� ���ִ� �ڵ�
		request.setCharacterEncoding("utf-8");
		
		System.out.println("request.getCharacterEncoding() : " + request.getCharacterEncoding());
		System.out.println("request.getMethod() : " + request.getMethod());
		System.out.println("request.getProtocol() : " + request.getProtocol());
		System.out.println("request.getServerName() : " + request.getServerName());
		System.out.println("request.getServerPort() : " + request.getServerPort());
		System.out.println("request.getRequestURL() : " + request.getRequestURL());
		System.out.println("request.getRequestURI() : " + request.getRequestURI());
		System.out.println("request.getContextPath() : " + request.getContextPath());
		System.out.println("request.getServletPath() : " + request.getServletPath());
		
		System.out.println("�ڹ� �� ���ø����̼�");
	}

}
