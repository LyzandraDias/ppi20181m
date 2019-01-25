package academia.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import academia.daos.PagamentoDAO;
import academia.models.Pagamento;
import academia.daos.AlunoDAO;
import academia.daos.TreinosDAO;
import academia.models.Aluno;
import academia.models.Treinos;

@Controller
public class pagamentoControllers {

	@RequestMapping("/pagamento/Form")
	public ModelAndView form() {
		System.out.println("Chamou o meu método pagamento");
		AlunoDAO alunoDAO = new AlunoDAO();
		List<Aluno> listaAlunos = alunoDAO.getLista();

		TreinosDAO treinosDAO = new TreinosDAO();
		List<Treinos> listarTreinos = treinosDAO.getLista();

		ModelAndView model = new ModelAndView("pagamento/Form");

		model.addObject("alunos", listaAlunos);
		model.addObject("treinos", listarTreinos);

		System.out.println("Finalizou o meu método pagamento");
		return model;

	}
	
	@PostMapping("/pagamento/executarPagamento")
	public String adicionar(Pagamento pagamento) {
		System.out.println("chamou o método de adicionar");
		System.out.println(pagamento);
		PagamentoDAO pagamentoDAO = new PagamentoDAO();
		
		System.out.println("ID DO ALUNO: " + pagamento.getAluno().getId());
		System.out.println("ID DO TREINO: "+ pagamento.getTreino().getId());
		
		pagamentoDAO.inserir(pagamento);
		return "redirect:listar";
	}
	
	@GetMapping("/pagamento/listar")
	public ModelAndView listar() {
		System.out.println("chamou o metódo listagem");
		PagamentoDAO pagamentoDAO = new PagamentoDAO();
		List<Pagamento> lista = pagamentoDAO.getLista();
		ModelAndView model = new ModelAndView("pagamento/listarPagamento");
		model.addObject("pagamento", lista);
		return model;
		
	}
	
	@RequestMapping("/pagamento/remover")
	public String remover(Pagamento pagamento) {
		System.out.println("chamou o método remover.");
		PagamentoDAO pagamentoDAO = new PagamentoDAO();
		pagamentoDAO.remover(pagamento);
		
		return "redirect:../pagamento";
			
	}
	
}

