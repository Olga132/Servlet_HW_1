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
    <title>Quote</title>
</head>
<body>
    <form>
        <p>Bad programmers worry about the code. Good programmers
            worry about data structures and their relationships</p>
        <p>Linus Torvalds</p>

        <a href="${pageContext.request.contextPath}/index.jsp">Go back</a>
    </form>

    <jsp:include page="./templates/footer.jsp"/>
</body>
</html>
