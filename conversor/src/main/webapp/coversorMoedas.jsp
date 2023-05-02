<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Conversor de Moedas</title>
</head>
<body>
<%
	String cotacao = request.getParameter("cotacao");
	String reais = request.getParameter("reais");
	if(cotacao.isEmpty() || reais.isEmpty()){
		
%>
	<p> Para que a conversao seja realizada sao necessarios valores validos</p>
<% }else{
	Float vlrcotacao = Float.parseFloat(cotacao);
	Float vlreais = Float.parseFloat(reais);
	
	Float vlrdolares = vlreais / vlrcotacao;

%>

	<p> O valor R$ <%=vlreais %> equivale a R$ <%=vlrdolares%> na cotacao do dolar</p>
<% } %>
<a href="index.jsp"> voltar</a>
</body>
</html>