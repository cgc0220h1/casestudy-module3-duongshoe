<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/05/2020
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body onload="search();">
<form action="/home" method="get" id="home">
</form>
<script>
    function search() {
        document.forms["home"].submit();
    }
</script>
</body>
</html>
