package br.unisinos.getfut.converter;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import br.unisinos.getfut.dto.EventoDTO;
import br.unisinos.getfut.modelo.EventoModel;

public abstract class EventoDTOConverter {

	private EventoDTOConverter() {
	}

	public static EventoDTO toDTO(EventoModel model) {
		if (Objects.isNull(model)) {
			return null;
		}

		return EventoDTO.builder()
				.id(model.getId())
				.nome(model.getNome())
				.dthInicio(model.getDthInicio())
				.dthFim(model.getDthFim())
				.local(model.getLocal())
				.donoEvento(JogadorDTOConverter.toDTO(model.getDonoEvento()))
				.grupo(GrupoDTOConverter.toDTO(model.getGrupo())).build();
	}

	public static List<EventoDTO> toListDTO(List<EventoModel> modelList) {

		if (Objects.isNull(modelList) || modelList.isEmpty()) {
			return null;
		}

		return modelList.stream().map(model -> toDTO(model)).collect(Collectors.toList());
	}
	
	public static EventoModel toModel(EventoDTO dto) {
		if (Objects.isNull(dto)) {
			return null;
		}

		return EventoModel.builder()
				.id(dto.getId())
				.nome(dto.getNome())
				.dthInicio(dto.getDthInicio())
				.dthFim(dto.getDthFim())
				.local(dto.getLocal())
				.donoEvento(JogadorDTOConverter.toModel(dto.getDonoEvento()))
				.grupo(GrupoDTOConverter.toModel(dto.getGrupo()))
				.build();
	}

	
}
