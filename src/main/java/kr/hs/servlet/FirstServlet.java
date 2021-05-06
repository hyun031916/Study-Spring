package kr.hs.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi")
//http://localhost:8090/ServletPrj/hi
public class FirstServlet extends HttpServlet{

	@Override
	public void init() throws ServletException {
		System.out.println("init()호출");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service()호출");
	}
	
	
	
	

}
