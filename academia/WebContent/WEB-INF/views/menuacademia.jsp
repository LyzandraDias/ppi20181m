<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8"> 
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <style> 
		 ul {
			list-style-type: none;
			margin: 0;
			padding: 0;
			overflow: hidden;
			background-color:#4B0082;
		}
        body {
            margin:0px;
            padding:0px;
            background-color:#000000;
        }
        li {
	float: left;
			}
			
			li a, .dropbtn {
				display: inline-block;
				color: white;
				text-align: center;
				padding: 14px 16px;
				text-decoration: none;
			}
			li a:hover, .dropdown:hover .dropbtn {
				background-color:#9932CC;
			}
			li.dropdown {
				display: inline-block;
			}
			.dropdown-content {
				display: none;
				position: absolute;
				background-color:#DDA0DD;
				min-width: 140px;
				box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
				z-index: 1;
			}
			.dropdown-content a {
				padding: 12px 16px;
				text-decoration: none;
				display: block;
				text-align: left;
			}
			.dropdown-content a:hover {
				background-color:;
			}
			.dropdown:hover .dropdown-content {
				display: block;
			}
    
        
            
           
  </style>
      </head>  
       <body> 

   
   <ul>
	<li class="dropdown"><a href="javascript:void(0)" class="dropbtn">Home</a>
		<div class="dropdown-content">
			<a href="/academia/">Home</a>
		</div></li>
	<li class="dropdown"><a href="javascript:void(1)" class="dropbtn">Aluno</a>
		<div class="dropdown-content">
			<a href="/academia/aluno/Form">Adicionar Aluno da academia</a> <a
				href="/academia/aluno/">Listar Alunos da academia</a>
		</div></li>


	<li class="dropdown"><a href="javascript:void(2)" class="dropbtn">Pagamentos</a>
		<div class="dropdown-content">
			<a href="/academia/pagamento/Form">Adicionar novo pagamento</a> <a
				href="/academia/pagamento/listar">Listar todos os pagamentos</a>
		</div></li>

<li class="dropdown"><a href="javascript:void(2)" class="dropbtn">Treinos</a>
		<div class="dropdown-content">
			<a href="/academia/treino/Form">Adicionar novo treino</a> <a
				href="/academia/treino">Listar todos os treinos</a>
		</div></li>


</ul>
 

</body>
</html>

