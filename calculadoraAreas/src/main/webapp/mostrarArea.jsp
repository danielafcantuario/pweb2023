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
<h1> Calculadora de Areas</h1>
<%
	String base = request.getParameter("base");
	String Altura = request.getParameter("Altura");
	
	if(base.isEmpty() || Altura.isEmpty ()){
		
%>
<div class="alert alert-danger" role="alert">
  <p> Para que o calculo seja realizado sao necessarios valores validos!</p>
</div>

<%}else{ 
	Float vlrbase = Float.parseFloat(base);
	Float vlrAltura = Float.parseFloat(Altura);
	
	Float vlrArea = vlrbase * vlrAltura / 2;
			
	%>
	<p> A area do triangulo de base <%=base %> e altura <%=Altura %> é <%=vlrArea %> centrimetros quadrados. </p>
<%} %>
	<a href="index.jsp">voltar</a>

</body>
</html>