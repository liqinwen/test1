package com.cy.cookie;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//cookie原理实现
public class TestCookie extends HttpServlet {

	private static final long serialVersionUID = -8905355612882309354L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		//解决乱码
		response.setContentType("text/html;charset=utf-8");
		//返回页面上一次的访问时间
		Date date = new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String d=sdf.format(date);
		System.out.println(d);
	}
}
	
