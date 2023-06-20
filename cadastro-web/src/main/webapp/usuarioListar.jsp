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
<div class="container">
<h1>Lista de Usuarios</h1>

<table border = "1" class="table">
<thead>
	<tr>
		<th>ID</th>
		<th>Nome</th>
		<th>Email</th>
	</tr>
</thead>
<tbody>
	<c:forEach var = "usuario" items = "${usuarios}" varStatus = "id">
		<tr class="${id.count % 2 == 0 ? 'table-primary' :  'table-secondary'}">
			<td>${usuario.id}</td>
			<td>${usuario.nome}</td>
			<td><a href="mailto:${usuario.email}">${usuario.email}</a></td>
		</tr>
	</c:forEach>
</tbody>
</table>

<a href="usuarioCadrasto.jsp" class="btn btn-primary">Clique aqui para se cadastrar!</a>
</div>
</body>
</html>