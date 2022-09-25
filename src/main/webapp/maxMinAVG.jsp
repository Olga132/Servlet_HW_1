<%--
  Created by IntelliJ IDEA.
  User: pesto
  Date: 23.09.2022
  Time: 14:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        ul {
            list-style: none;
            margin: 0;
            padding: 0;
        }
        li {
            padding: 0.2em;
        }
        form {
            width: 300px;
            font-family: Verdana, sans-serif;
            font-size: 15px;
            padding: 1em;
            border: 1px solid #000;
            border-radius: 1em;
        }
        input {
            font: 1em sans-serif;
            width: 150px;
            box-sizing: border-box;
            border: 1px solid #777;
        }
        input:focus {
            border-color: rgb(25, 11, 100);
        }
        input[type="radio"] {
            width: auto;
        }
        input[id="submitBtn"] {
            display: block;
            width: 120px;
            margin-left: auto;
            margin-right: auto;
            margin-top: 10px;
        }
        label span {
            width: 90px;
            text-align: right;
            display: inline-block;
        }
    </style>
    <title>Search max, min and average </title>
</head>
<body>
<h3>Please provide value</h3>
<form action="Task2and3Servlet" method="post">
    <ul>
        <li>
            <label>
                <span>Number 1:</span>
                <input type="text" id="num1" name="num1" value="${num1}">
            </label>
        </li>
        <li>
            <label>
                <span>Number 2:</span>
                <input type="text" id="num2" name="num2" value="${num2}">
            </label>
        </li>
        <li>
            <label>
                <span>Number 3:</span>
                <input type="text" id="num3" name="num3" value="${num3}">
            </label>
        </li>
        <li>
            <p>Choice value:</p>
            <input type="radio" name="choice" value="max" id="max" checked>
            <label for="max">Max</label>
            <input type="radio" name="choice" value="min" id="min"/>
            <label for="min">Min</label>
            <input type="radio" name="choice" value="avg" id="avg"/>
            <label for="avg">AVG</label>
        </li>
        <li id="buttons">
            <input id="submitBtn" type="submit" value="Search">
        </li>
        <li>
            <label>
                <span>Result:</span>
                <input type="text" id="resultTask2" name="resultTask2" value="${resultTask2}" disabled/>
            </label>
        </li>
    </ul>
</form>
<br>
<a href="${pageContext.request.contextPath}/index.jsp">Go back</a>
<jsp:include page="./templates/footer.jsp"/>
</body>
</html>
