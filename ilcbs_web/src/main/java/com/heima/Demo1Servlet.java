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
        resp.getWriter().write("hello git1111 ");
        resp.getWriter().write("hello git1 ");
        resp.getWriter().write("hello git111111111111111111111111111111111 ");
        resp.getWriter().write("hello world ");
        resp.getWriter().write("hello world ,你好哈！！！");
        resp.getWriter().write("hello git ");
        resp.getWriter().write("hello git1111 ");
        resp.getWriter().write("hello git2 ");
        resp.getWriter().write("hello git2 master ");
        resp.getWriter().write("hello git2  prod");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       this.doGet(req,resp);
    }
}
