<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contador</title>
</head>
<body>
<center>

<h2>Contador</h2>

<h2>
You have visited <a href="http://localhost:8080/you_server">http://your_server</a> <c:out value="${count}"/>  times
</h2>

<br></br>

<h2><a href="http://localhost:8080/you_server">test another visit?</a></h2>

</center>
</body>
</html>