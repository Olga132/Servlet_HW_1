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
    <title>Text Analysis</title>
</head>
<body>
<h3>Please provide text</h3>
<form action="Task4TextAnalysisServlet" method="post">
    <h5>Enter any text</h5>
    <p><label>
        <textarea name="input_text"></textarea>
    </label></p>
    <p><input type="submit" value="Analysis"></p>

</form>


<a href="${pageContext.request.contextPath}/index.jsp">Go back</a>

<jsp:include page="./templates/footer.jsp"/>
</body>
</html>
