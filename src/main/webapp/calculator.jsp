<%--
  Created by IntelliJ IDEA.
  User: pesto
  Date: 23.09.2022
  Time: 13:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h1><%= "Calculator" %></h1>
<br/>
    <form action="CalculatorServlet" method="post" >
        <input type="text" name="number1" value="${number1}">
        <select name="operator">
            <option value="+"> + </option>
            <option value="-"> - </option>
            <option value="/"> / </option>
            <option value="^"> ^ </option>
            <option value="%"> % </option>
        </select>
        <input type="text" name="number2" value="${number2}">
        =
        <input type="text" name="result" disabled value="${result}">
        <button>
            calculate
        </button>
        <br>
        <a href="${pageContext.request.contextPath}/index.jsp">Go back</a>
    </form>
    <jsp:include page="./templates/footer.jsp"/>
</body>
</html>
