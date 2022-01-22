<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fecha actual</title>
</head>
<body>
<center>

<h1>FECHA ACTUAL</h1>

<h2>
<c:out value="${fecha}"/>
</h2>

<br></br>

<h1 Style="color: blue;">
<c:out value="${fechaactual}"/>
</h1>


</center>
</body>
</html>