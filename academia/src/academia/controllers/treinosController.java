package academia.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import academia.daos.TreinosDAO;
import academia.models.Treinos;

@Controller
public class treinosController {
	@RequestMapping("/treino/Form")
	public String form() {
		System.out.println("chamou meu método");
		return "treino/Form";
	}
	
	@PostMapping("/treino")
	public String adicionar(Treinos treino) {
		System.out.println("chamou o método de adicionar");
		System.out.println(treino);
		TreinosDAO treinosDAO = new TreinosDAO();
		treinosDAO.inserir(treino);
		return "redirect:treino";
	}
	
	@GetMapping("/treino")
	public ModelAndView listar() {
		System.out.println("chamou o metódo listagem");
		TreinosDAO treinosDAO = new TreinosDAO();
		List<Treinos> lista = treinosDAO.getLista();
		ModelAndView model = new ModelAndView("treino/listarTreinos");
		model.addObject("treino", lista);
		return model;
		
	}
	
	@RequestMapping("/treino/remover")
	public String remover(Treinos treinos) {
		System.out.println("chamou o método remover.");
		TreinosDAO treinosDAO = new TreinosDAO();
		treinosDAO.remover(treinos);
		
		return "redirect:../treinos";
			
	}

}
