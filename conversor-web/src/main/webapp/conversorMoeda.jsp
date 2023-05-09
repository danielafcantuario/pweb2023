<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Conversor de Moedas</title>
</head>
<body>

	<c:choose>
		<c:when test="${empty param.cotacao or empty param.reais}">
		
		<p>Para que a conversão seja realizada são necessários valores válidos.</p>
		
		</c:when>
		<c:otherwise>
			<p>O valor R$ ${param.reais} equivale a ${param.reais / param.cotacao} na contação atual do dólar.</p>
		</c:otherwise>
	</c:choose>
		
	
	<a href="index.jsp" >Voltar</a>
</body>
</html>