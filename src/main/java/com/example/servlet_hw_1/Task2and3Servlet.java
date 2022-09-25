package com.example.servlet_hw_1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Task2and3Servlet", value = "/Task2and3Servlet")
public class Task2and3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //  double num1 = 0,num2 = 0,num3 = 0;
        String choice = "";

        double num1 = Double.parseDouble(request.getParameter("num1"));
        double num2 = Double.parseDouble(request.getParameter("num2"));
        double num3 = Double.parseDouble(request.getParameter("num3"));

        choice = request.getParameter("choice");

        double resultTask2 = 0;

        switch (choice){
            case "max":
                double res = Math.max(num1, num2);
                resultTask2 = Math.max(res,num3);
                break;
            case "min":
                res = Math.min(num1, num2);
                resultTask2 = Math.min(res,num3);
                break;
            case "avg":
                resultTask2 = (num1 + num2 + num3)/3;
                break;
        }
        HttpSession session = request.getSession();
        session.setAttribute("resultTask2", resultTask2);
        session.setAttribute("num1", num1);
        session.setAttribute("num2", num2);
        session.setAttribute("num3", num3);
        //session.setAttribute("choice", choice);

        response.sendRedirect(request.getContextPath() + "/maxMinAVG.jsp");
    }
}
