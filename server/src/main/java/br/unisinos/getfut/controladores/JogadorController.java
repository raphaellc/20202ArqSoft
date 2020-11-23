package br.unisinos.getfut.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unisinos.getfut.modelo.JogadorAuth;
import br.unisinos.getfut.modelo.JogadorModel;
import br.unisinos.getfut.service.JogadorService;

@RequestMapping("/jogador")
@RestController
public class JogadorController {

	@Autowired
	private JogadorService jogadorService;

	@GetMapping
	public JogadorModel buscarPorId(@RequestParam("id") Long id) {
		return jogadorService.buscarPorId(id);
	}

	@PostMapping
	public JogadorModel incluirConta(@RequestBody() JogadorModel jogador) {
		return jogadorService.incluir(jogador.getEmail(), jogador.getNome(), jogador.getSenha());
	}

	@PostMapping("/login")
	public JogadorAuth autorizarConta(@RequestBody() JogadorModel jogador) {
		return jogadorService.verificarUsuario(jogador);
	}

}
