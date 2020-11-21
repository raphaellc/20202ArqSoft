package br.unisinos.getfut.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unisinos.getfut.modelo.JogadorModel;
import br.unisinos.getfut.service.JogadorService;

@RestController
public class JogadorController {

	@Autowired
	private JogadorService jogadorService;

	@PutMapping("/jogador")
	public JogadorModel incluirConta(@RequestParam("email") String email, @RequestParam("senha") String senha,
			@RequestParam("nome") String nome) {
		return jogadorService.incluir(email, nome, senha);
	}

}
