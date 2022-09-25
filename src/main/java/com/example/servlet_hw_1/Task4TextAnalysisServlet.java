package com.example.servlet_hw_1;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@WebServlet(name = "Task4TextAnalysisServlet", value = "/Task4TextAnalysisServlet")
public class Task4TextAnalysisServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputText = request.getParameter("input_text");
        String result;

        if(inputText != null){

            TextAnalyzer textAnalyzer = new TextAnalyzer();

            result = textAnalyzer.getAnalyzer(inputText);

        } else {
            result = "error field is empty";
        }

        response.setContentType("text/html");

        try (PrintWriter writer = response.getWriter()) {
            writer.println("<b>Entered text :</b>");
            writer.println(inputText + "<br>");
            writer.println(result + "<br>");
            writer.println();
            writer.println("<a href=http://localhost:8080/Servlet_HW_1_war_exploded/textAnalysis.jsp>Go back</a>");
        }
    }
}
