package br.unisinos.getfut.converter;

import java.util.Objects;

import br.unisinos.getfut.dto.PresencaDTO;
import br.unisinos.getfut.modelo.PresencaModel;

public abstract class PresencaDTOConverter {

	private PresencaDTOConverter() {
	}

	public static PresencaDTO toDTO(PresencaModel model) {
		
		if (Objects.isNull(model)) {
			return null;
		}
		
		return PresencaDTO.builder()
				.id(PresencaIdDTOConverter.toDTO(model.getId()))
				.posicao(model.getPosicao())
				.build();
	}

}
