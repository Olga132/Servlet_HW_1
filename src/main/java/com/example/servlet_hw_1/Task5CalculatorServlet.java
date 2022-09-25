package com.example.servlet_hw_1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "Task5CalculatorServlet", value = "/CalculatorServlet")
public class Task5CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double number1 = Double.parseDouble(request.getParameter("number1"));
        double number2 = Double.parseDouble(request.getParameter("number2"));
        String operator = request.getParameter("operator");

        double result = 0.0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            case "^":
                result = Math.pow(number1, number2);
                break;
            case "%":
                result = (number1 * number2) / 100;
                break;
        }

        HttpSession session = request.getSession();
        session.setAttribute("result", result);
        session.setAttribute("number1", number1);
        session.setAttribute("number2", number2);

        response.sendRedirect(request.getContextPath() + "/calculator.jsp");

    }
}
