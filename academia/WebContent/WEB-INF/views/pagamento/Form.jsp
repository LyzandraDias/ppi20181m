<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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
<h1>Novo pagamento</h1>
	<form action="executarPagamento" method="post">
		<input type="hidden" >
		
		<div>
		<select id="ok2" name="aluno.id">
			<option value="">Aluno</option>
			<c:forEach var="aluno" items="${alunos}">
				<option value="${aluno.id}">${aluno.nome}</option>
			</c:forEach>
		</select>
			
		</div>
		
		<div>
		<select id="ok2" name="treinos.id">
			<option value="">Treinos</option>
			<c:forEach var="treino" items="${treinos}">
				<option value="${treino.id}">${treino.nome}</option>
			</c:forEach>
		</select>
			
		</div>
		
		
		<div>
			<label>Data do pagamento: </label> 
			<input type="text" name="dataPagamento">
		</div>
		<div>
			<button type="submit">Adicionar</button>
		</div>
	</form>
</article>
</body>
</html>