<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container-fluid">
	<h1>Calcular IMC</h1>
	<form action="mostrarImc.jsp">
		<label>Peso:</label>
		<input type="text" name="peso">
		<label>Altura:</label>
		<input type="text" name="altura">
		<input type="submit" value="Calcular!">
	</form>
</div>
</body>
</html>