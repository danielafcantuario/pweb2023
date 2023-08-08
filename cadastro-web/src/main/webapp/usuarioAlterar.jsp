<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Alterar Usuario</h1>
<form action="usuarioAlterar" method="post">
	<label for="nome">Nome:</label>
			<input type="text" name="nome" value="${nome}">
			<label for="email">E-mail:</label>
			<input type="text" name="email" value="${email}"><br><br>
			<label for="senha1">Senha:</label>
			<input type="password" name="senha1" >
			<input type="submit" value="salvar" class="btn btn-primary"> 
</form>

</body>
</html>