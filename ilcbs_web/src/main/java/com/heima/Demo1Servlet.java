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
        
        System.out.println("master分支更新");
        resp.getWriter().write("master分支更新");
        resp.getWriter().write("master分支更新");
        resp.getWriter().write("master分支更新");
        resp.getWriter().write("master分支更新");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req,resp);
    }
}
