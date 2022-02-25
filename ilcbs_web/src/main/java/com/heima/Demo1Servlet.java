package com.heima;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Demo1Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("hello world ,你好哈！！！");
        resp.getWriter().write("hello git ");
		resp.getWriter().write("right!!!!!");
		resp.getWriter().write("left！！！！");
        resp.getWriter().write("hot_fix分支");
        resp.getWriter().write("完成版本回退");
        
        System.out.println("-----------------------");
        resp.getWriter().write("new feature1");
        resp.getWriter().write("new feature2");
        resp.getWriter().write("new feature3");
	System.out.println("2022测试1");
        resp.getWriter().write("new feature4");
        resp.getWriter().write("new feature5");
        resp.getWriter().write("new feature6");
        System.out.println("master分支更新");
        resp.getWriter().write("master分支更新");
        resp.getWriter().write("master分支更新");
        resp.getWriter().write("master分支更新");
        resp.getWriter().write("master分支更新");
        System.out.println("---------------");
        System.out.println("dev分支更新");
        System.out.println("2022测试5");

	System.out.println("2022测试2");
        System.out.println("dev分支更新");
        System.out.println("2022测试6");
	System.out.println("2022测试7");

	    System.out.println("2022测试2");
        System.out.println("dev分支更新");
        System.out.println("2022测试6");
        System.out.println("2022测试8");
        System.out.println("2024测试8");
    }

    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req,resp);
    }
}
