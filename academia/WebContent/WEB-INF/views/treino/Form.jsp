<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
              margin-left:30%;
              background-color:rgba(255, 255, 255, 0.9);
              border-radius:10px;
              padding:20px;
            }
            

</style>
</head>
<body>
<c:import url="../menuacademia.jsp"></c:import>

<article>
<h1>Adicionar Treino</h1>
	<form action="/academia/treino" method="post">
		<input type="hidden" name="comando" value="AdicionarTreino">
		<div>
			<label>Nome: </label> 
			<input type="text" name="nome">
		</div>
		<div>
			<label>valor: </label> 
			<input type="text" name="valor">
		</div>
		
		<div>
			<button type="submit">Adicionar</button>
		</div>
	</form>
</article>


</body>
</html>