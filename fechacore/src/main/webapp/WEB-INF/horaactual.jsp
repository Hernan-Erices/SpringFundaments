<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hora actual</title>
</head>
<body>
<center>

<h1>HORA ACTUAL</h1>

<h2>
<c:out value="${hora}"/>
</h2>

<br></br>

<h1 style="color: red;">

<c:out value="${horaactual}"/>

</h1>


</center>
</body>
</html>