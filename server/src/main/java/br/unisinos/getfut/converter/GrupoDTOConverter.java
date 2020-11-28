package br.unisinos.getfut.converter;

import java.util.Objects;

import br.unisinos.getfut.dto.GrupoDTO;
import br.unisinos.getfut.modelo.GrupoModel;

public class GrupoDTOConverter {

	private GrupoDTOConverter() {
	}

	public static GrupoDTO toDTO(GrupoModel model) {
		if (Objects.isNull(model)) {
			return null;
		}
		return GrupoDTO.builder()
				.id(model.getId())
				.nome(model.getNome())
				.local(model.getLocal())
				.diaSemana(model.getDiaSemana()).build();
	}
	
	public static GrupoModel toModel(GrupoDTO dto) {
		if (Objects.isNull(dto)) {
			return null;
		}
		return GrupoModel.builder()
				.id(dto.getId())
				.nome(dto.getNome())
				.local(dto.getLocal())
				.diaSemana(dto.getDiaSemana())
				.build();
	}


}
