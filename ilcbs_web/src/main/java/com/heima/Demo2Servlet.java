package com.heima;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo2Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		super.doGet(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("2022/2/28");
		System.out.println("2022/2/28/1");
		System.out.println("2022测试3");
		System.out.println("2024测试3");
		System.out.println("2024测试31111111111111111111111111111111111111111111");
		System.out.println("2024测试33333333333333333333333333333333333333333333333");
        System.out.println("2022");
        System.out.println("2023");
		System.out.println("2024测试31111111111111111111111111111111111111111111");
		System.out.println("2024测试33333333333333333333333333333333333333333333333");
        System.out.println("2022");
        System.out.println("2023");

		System.out.println("2023测试3");

		super.doPost(req, resp);
	}
	
	

}
