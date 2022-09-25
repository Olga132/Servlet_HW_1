<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Home work Servlet 1</title>
    <link rel="stylesheet" href="templates/css/common.css">
</head>
<body>
<h1>Home work Servlet 1</h1>
<h3>Task menu</h3>
    <ol>
        <li><a href="${pageContext.request.contextPath}/quote.jsp">Quote</a></li>
        <li><a href="${pageContext.request.contextPath}/maxMinAVG.jsp">Max, min and average</a></li>
        <li><a href="${pageContext.request.contextPath}/textAnalysis.jsp">Text analysis</a></li>
        <li><a href="${pageContext.request.contextPath}/calculator.jsp">Calculator</a></li>
    </ol>
<jsp:include page="./templates/footer.jsp"/>
</body>
</html>