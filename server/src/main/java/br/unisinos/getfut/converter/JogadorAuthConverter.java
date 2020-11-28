package br.unisinos.getfut.converter;

import br.unisinos.getfut.dto.JogadorAuth;
import br.unisinos.getfut.modelo.JogadorModel;

public abstract class JogadorAuthConverter {

	private JogadorAuthConverter() {
	}

	public static JogadorAuth criarAutorizado(JogadorModel model) {
		return JogadorAuth.builder()
				.autorizado(Boolean.TRUE)
				.id(model.getId()).build();
	}
	
	public static JogadorAuth criarNaoAutorizado() {
		return JogadorAuth.builder()
				.autorizado(Boolean.FALSE)
				.build();
	}

}
