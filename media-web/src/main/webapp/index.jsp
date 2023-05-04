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
  <form action="mostraMedia.jsp">
	<h1>Calcular média</h1>
	<label>1 trimestre</label>
	<input type = "text" name = "primeiro">
	<br><br>
	<label>2 trimestre</label>
	<input type = "text" name = "segundo">
	<br><br>
	<label>3 trimestre</label>
	<input type = "text" name = "terceiro">
	<br><br>
	
	<input type = "submit" value = "Calcular!" class="btn btn-primary" >
</form>
</div>
</body>
</html>