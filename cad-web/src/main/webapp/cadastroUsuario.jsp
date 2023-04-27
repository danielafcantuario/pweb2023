<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Cadastro usuario</title>
</head>
<body>
<%
	String nome = request.getParameter("nome");
	if(nome == null) {
		nome ="";
	}
	String email = request.getParameter("email");
	if(email == null) {
		email ="";
	}
%>
<div class="container-fluid">
<form action="cad" method="post">
	<h1> Cadastro Usuario</h1>
	<label for="nome" >nome:</label>
	<input type="text" name="nome" id="nome" value="${param.nome}"> <br> <br>
	
	<label for="email" >email:</label>
	<input type="text" name="email" id="email" value="${param.email}"> <br> <br>
	
	<label for="senha1" >senha:</label>
	<input type="password" name="senha1" id="senha1"> <br> <br>
	
	<label for="senha2" >senha:</label>
	<input type="password" name="senha2" id="senha2"> <br> <br>
	
	<input type="submit" value="entrar" class="btn btn-primary">
</form>
<% 
	String senha1 = request.getParameter("senha1");
	String senha2 = request.getParameter("senha2");
	if(senha1 != senha2){%>
	<hr>
	<div class="alert alert-danger" role="alert">
  		<%=nome %><span>, algo esta vazio /ou senhas nao estao corretas .</span>
	</div>
<%}%>

</div>
</body>
</html>