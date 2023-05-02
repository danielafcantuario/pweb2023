<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Calculadora de Areas</title>
</head>
<body>
<form action="mostrarArea.jsp">
	<h1>Calculadora de Areas</h1>
	<label>Valor da base</label>
	<input type="text" name= "base"> <br>

	<label>Valor da Altura</label>
	<input type="text" name= "Altura"> <br>
	<input type="submit" value= "calcular">

</form>

</body>
</html>