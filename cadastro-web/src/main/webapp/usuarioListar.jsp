<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
<h1>Lista de Usuarios</h1>
<table border=1>
	<c:forEach var ="usuario" items= "${usuarios}" varStatus="id">
		<tr>
			<td> ${usuario.id}</td>
			 <td>${usuario.nome}</td> 
			 <td>${usuario.email}</td>
		</tr>
	</c:forEach>
</table>
 <a class="btn btn-primary" href="index.html" role="button">Voltar</a>
</body>
</html>