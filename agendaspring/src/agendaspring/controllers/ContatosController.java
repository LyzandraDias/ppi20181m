package agendaspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import agenda.models.Contato;

@Controller
public class ContatosController {

	@RequestMapping("/contatos/form")
	public String form() {
		System.out.println("chamou meu método");
		return "contatos/form";
	}
	
	@RequestMapping("/contatos")
	public String adicionar(Contato contato) {
		System.out.println("chamou o método de adicionar");
		System.out.println("Nome: " + contato.getNome());
		System.out.println("Email: " + contato.getEmail());
		System.out.println("Endereco: " + contato.getEndereco());
		System.out.println("DataNascimento: " + contato.getDataNascimento());
		return "contatos/ok";
	}
}
