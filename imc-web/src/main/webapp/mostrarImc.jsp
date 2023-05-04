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
<h1>Calcular IMC</h1>
<%
	String peso = request.getParameter("peso");
	String altura = request.getParameter("altura");
	
	if(peso.isEmpty() || altura.isEmpty()){ %>
		<div class="alert alert-danger" role="alert">
  			<p>Para que o cálculo seja realizado são necessários valores válidos.</p>
		</div>
<%} else{
		Float vlrPeso = Float.parseFloat(peso);
		Float vlrAltura = Float.parseFloat(altura);
		
		Float vlrIMC = vlrPeso / (vlrAltura * vlrAltura);
%>	
	
 <p>O valor do imc de peso igual a <%=vlrPeso %> e altura igual a <%=vlrAltura %> é de <%=vlrIMC %>.</p>
  
<%} %>

<a href="index.jsp">Voltar</a>
</body>
</html>