<%@page import="java.text.SimpleDateFormat"%>
<%@page import="academia.models.Aluno"%>
<%@page import="java.util.List"%>
<%@page import="academia.daos.AlunoDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

	body {
                margin:0px;
                padding:0px;
                background-image: url("https://img1.madeiramadeira.com.br/product/images/66644555-papel-de-parede-academia-exercicio-musculacao-fitness-gg558prdoxxzc7909866y-179-1-800x561.jpg");
            }
            
      article{
              float:left;
              width:30%;
              height:;
              margin-top:80px;
              margin-left:35%;
              background-color:rgba(255, 255, 255, 0.9);
              border-radius:10px;
              padding:20px;
              
            }

</style>
</head>

<body>

	<c:import url="../menuacademia.jsp"></c:import>
	<article>
	<h1>Lista de alunos da academia:</h1>

	<table border="2">
	<thead>
		<tr>
			<th>Nome</th>
			<th>CPF</th>
			<th>Nascimento</th>
			<th>Endereço</th>

		</tr>
	</thead>
	<tbody>
		<c:forEach var="aluno" items="${alunos}">
			<tr>
				<td>${aluno.nome }</td>
				<td>${aluno.cpf }</td>
				<td><fmt:formatDate value="${aluno.dataNascimento.time }" pattern="dd/MM/yyy"/></td>
				<td>${aluno.endereco }</td>
				
				<td><a href="/academia/aluno/remover?id=${aluno.id }">Remover</a></td>
	
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</article>
</body>
</html>