package br.unisinos.getfut.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unisinos.getfut.modelo.JogadorModel;
import br.unisinos.getfut.service.JogadorService;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

	@Autowired
	private JogadorService jogadorService;

	@RequestMapping(method = RequestMethod.PUT)
	public JogadorModel incluirConta(@RequestParam("email") String email, @RequestParam("senha") String senha,
			@RequestParam("nome") String nome) {
		return jogadorService.incluir(email, nome, senha);
	}

}
