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
<%
	String p = request.getParameter("primeiro");
	String s = request.getParameter("segundo");
	String t = request.getParameter("terceiro");
	
	Float vlrP = Float.parseFloat(p);
	Float vlrS = Float.parseFloat(s);
	Float vlrT = Float.parseFloat(t);
	
	Float vlrMedia = (vlrP + vlrS + vlrT) / 3;
	
	if(vlrMedia >= 6){
%>	
		<p>O valor da média com as notas <%=vlrP %>, <%=vlrS %> e <%=vlrT %> é igual a <%=vlrMedia %> e ele está aprovado!</p>
	<%} else{ %>
		<p>Não está aprovado!</p>
	<%} %>

<a href="index.jsp" class="btn btn-primary" role="button">Voltar</a>
</body>
</html>