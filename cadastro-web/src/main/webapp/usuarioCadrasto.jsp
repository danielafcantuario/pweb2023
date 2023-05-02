<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>Cadastro De Usuario</title>
  </head>
<body>
	<%
		String nome = request.getParameter("nome");
		if(nome == null){
			nome = "";
		}
		String email = request.getParameter("email");
		if(email == null){
			email = "";
		}
	%>
	

	<div class="container-fluid">
  <form method = "post" action = "cadastroUsuario">
	 	<h1>cadasto de usario</h1>
	 	
	 	<label type for="nome">Nome:</label>
	 	<input type="text" name="nome" id="nome" value="<% out.println(nome); %>">
	 	
        <label for="email">E-mail:</label>
        <input type="text" name="email" id="email" value="<%=email %>">
        </br></br>
        
        <label for="senha1">Senha:</label>
        <input type="password" name="senha1" id="senha1">
        
  		<label for="senha2">Confirmar senha:</label>
        <input type="password" name="senha2" id="senha2">
        </br></br>
       
        <input type="submit" value="Entrar"  class="btn btn-secundary">  
        <a class="btn btn-primary" href="cadastroUsuario" role="button">Listra Usuarios</a> 
        <a class="btn btn-primary" href="index.html" role="button">Voltar</a>
    </form>
</div>
	<c:if test="${not empty param.nome }">
	<hr>
			<div class="alert alert-danger" role="alert">
			${param.nome}<span>, as senhas ou as informaçoes nao sao iguais</span>
			</div>
	</c:if>

</body>
	
</html>