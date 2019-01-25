package agendaspring.controllers;



import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import agenda.daos.ContatoDAO;
import agenda.models.Contato;

@Controller
public class ContatosController {

	@RequestMapping("/contatos/form")
	public String form() {
		System.out.println("chamou meu método");
		return "contatos/form";
	}
	
	@PostMapping("/contatos")
	public String adicionar(Contato contato) {
		System.out.println("chamou o método de adicionar");
		System.out.println(contato);
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.inserir(contato);
		return "redirect:contatos";
	}
	
	@GetMapping("/contatos")
	public ModelAndView listar() {
		System.out.println("chamou o metódo listagem");
		ContatoDAO contatoDAO = new ContatoDAO();
		List<Contato> lista = contatoDAO.getLista();
		ModelAndView model = new ModelAndView("contatos/lista");
		model.addObject("contatos", lista);
		return model;
		
	}
	
	@RequestMapping("/contatos/remover")
	public String remover(Contato contato) {
		System.out.println("chamou o método remover.");
		ContatoDAO contatoDAO = new ContatoDAO();
		contatoDAO.remover(contato);
		
		return "redirect:../contatos";
			
	}
}
