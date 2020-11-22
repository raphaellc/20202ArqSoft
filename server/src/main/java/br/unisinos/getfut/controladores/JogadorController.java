package br.unisinos.getfut.controladores;

import br.unisinos.getfut.modelo.JogadorAuth;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.unisinos.getfut.modelo.JogadorModel;
import br.unisinos.getfut.service.JogadorService;

@RestController
public class JogadorController {

	@Autowired
	private JogadorService jogadorService;

	/*TODO: find jogador by id: http://localhost:8080/jogador?id=*/


	@PostMapping("/jogador")
	public JogadorModel incluirConta(@RequestBody() JogadorModel jogador) {
		return jogadorService.incluir(jogador.getEmail(), jogador.getNome(), jogador.getSenha());
	}

	@PostMapping("/jogador/login")
	public JogadorAuth autorizarConta(@RequestBody() JogadorModel jogador) {
		/*TODO: find jogador by email e senha*/
		JogadorModel jogadorReturn = jogadorService.incluir(jogador.getEmail(), null, jogador.getSenha());
		JogadorAuth auth = new JogadorAuth();
		auth.setId(jogadorReturn.getId());
		auth.setAutorizado(true);
		return auth;
	}

}
