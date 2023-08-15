<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alteraçao de Usuario</title>
</head>
 <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<body>

<h1>Alteraçao de Usuario</h1>

<form action="usuarioAlterar" method="post">
	<input type="hidden" name="id" value="${usuario.id}"> 
			<label for="nome">Nome:</label>
			<input type="text" name="nome" value="${usuario.nome}">
			<label for="email">E-mail:</label>
			
			<input type="text" name="email" value="${usuario.email}"><br><br>
			<label for="senha1">Senha:</label>
			<input type="password" name="senha1" >
			
			<label for="senha2">Senha confirmada:</label>
			<input type="password" name="senha2"><br><br>
			
			<a class="btn btn-secondary" href="CadastroUsuario" role="button">Voltar</a>
			
			<input type="submit" value="salvar" class="btn btn-primary"> 
</form>

</body>
</html>