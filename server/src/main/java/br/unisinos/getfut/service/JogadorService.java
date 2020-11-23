package br.unisinos.getfut.service;

import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.unisinos.getfut.modelo.JogadorAuth;
import br.unisinos.getfut.modelo.JogadorModel;
import br.unisinos.getfut.repositorios.JogadorRepository;

@Service
public class JogadorService {

	private JogadorRepository jogadorRepository;

	@Autowired
	public JogadorService(JogadorRepository jogadorRepository) {
		super();
		this.jogadorRepository = jogadorRepository;
	}

	public JogadorModel incluir(String email, String nome, String senha) {
		if (StringUtils.isBlank(email) || StringUtils.isBlank(nome) || StringUtils.isBlank(senha)) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "E-mail, nome e senha devem ser informados.");
		}
		boolean jaCadastrado = !jogadorRepository.findByEmail(email).isEmpty();
		if (jaCadastrado) {
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "E-mail já está cadastrado no sistema.");
		}
		return jogadorRepository.save(JogadorModel.builder().nome(nome).email(email).senha(senha).build());
	}

	public JogadorAuth verificarUsuario(JogadorModel jogador) {
		JogadorModel jogadorReturn = jogadorRepository.findByEmailAndSenha(jogador.getEmail(), jogador.getSenha());
		if (Objects.nonNull(jogadorReturn)) {
			return JogadorAuth.builder().id(jogadorReturn.getId()).autorizado(Boolean.TRUE).build();
		}
		return JogadorAuth.builder().autorizado(Boolean.FALSE).build();
	}

	public JogadorModel buscarPorId(Long id) {
		return jogadorRepository.findById(id).orElse(null);
	}

}
