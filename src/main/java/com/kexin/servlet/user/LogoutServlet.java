package com.kexin.servlet.user;

import com.kexin.util.Constants;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 移除用户的Session
        req.getSession().removeAttribute(Constants.USER_SESSION);
        System.out.println("req.getContextPath():"+ req.getContextPath());
        resp.sendRedirect(req.getContextPath() + "/smbms/login.jsp");   // 返回登陆页面
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}