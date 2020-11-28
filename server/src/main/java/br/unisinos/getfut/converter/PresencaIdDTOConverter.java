package br.unisinos.getfut.converter;

import java.util.Objects;

import br.unisinos.getfut.dto.PresencaIdDTO;
import br.unisinos.getfut.modelo.id.PresencaId;

public abstract class PresencaIdDTOConverter {

	private PresencaIdDTOConverter() {
	}

	public static PresencaIdDTO toDTO(PresencaId model) {

		if (Objects.isNull(model)) {
			return null;
		}
		
		return PresencaIdDTO.builder()
				.idEvento(model.getIdEvento())
				.idJogador(model.getIdJogador())
				.build();
	}

}
