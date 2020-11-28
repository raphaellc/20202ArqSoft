package br.unisinos.getfut.converter;

import java.util.Objects;

import br.unisinos.getfut.dto.JogadorDTO;
import br.unisinos.getfut.modelo.JogadorModel;

public abstract class JogadorDTOConverter {

	private JogadorDTOConverter() {
	}

	public static JogadorDTO toDTO(JogadorModel model) {

		if (Objects.isNull(model)) {
			return null;
		}
		
		return JogadorDTO.builder()
				.id(model.getId())
				.codPosicao(model.getCodPosicao())
				.dataNascimento(model.getDataNascimento())
				.email(model.getEmail())
				.nome(model.getNome())
				.build();
	}
	
	public static JogadorModel toModel(JogadorDTO dto) {

		if (Objects.isNull(dto)) {
			return null;
		}
		
		return JogadorModel.builder()
				.id(dto.getId())
				.codPosicao(dto.getCodPosicao())
				.dataNascimento(dto.getDataNascimento())
				.email(dto.getEmail())
				.nome(dto.getNome())
				.build();
	}

}
