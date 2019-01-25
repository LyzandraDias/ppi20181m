package academia.controllers;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import academia.daos.AlunoDAO;
import academia.models.Aluno;

@Controller
public class alunosController {

	@RequestMapping("/aluno/Form")
	public String form() {
		System.out.println("chamou meu método");
		return "aluno/Form";
	}
	
	@PostMapping("/aluno")
	public String adicionar(Aluno aluno) {
		System.out.println("chamou o método de adicionar");
		System.out.println(aluno);
		AlunoDAO alunoDAO = new AlunoDAO();
		alunoDAO.inserir(aluno);
		return "redirect:aluno";
	}
	
	@GetMapping("/aluno")
	public ModelAndView listar() {
		System.out.println("chamou o metódo listagem");
		AlunoDAO alunoDAO = new AlunoDAO();
		List<Aluno> lista = alunoDAO.getLista();
		ModelAndView model = new ModelAndView("aluno/listarAlunos");
		model.addObject("alunos", lista);
		return model;
		
	}
	
	@RequestMapping("/aluno/remover")
	public String remover(Aluno aluno) {
		System.out.println("chamou o método remover.");
		AlunoDAO alunoDAO = new AlunoDAO();
		alunoDAO.remover(aluno);
		
		return "redirect:../aluno";
			
	}
}

