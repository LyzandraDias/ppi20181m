<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style>
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
	<h1>Lista dos treinos:</h1>
	
		<table border="2">
		<thead>
		<tr>
			<th>Nome </th>
			<th>Valor</th>
						
		</tr>
		</thead>
		
	<tbody>
		<c:forEach var="treinos" items="${treino }" >
		
		<tr>
			<td>${treinos.nome }</td>
			<td>${treinos.valor }</td>
			
			
			<td><a href = "/academia/treinos/remove?id=${treinos.id }">Remover.</a></td>
			<td><a href = "/academia/treinos/altera?id=${treinos.id }">Alterar.</a></td>
				
		</tr>
		</c:forEach>
		</tbody>
	</table>
	</article>
</body>
</html>