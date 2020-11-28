package br.unisinos.getfut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisinos.getfut.converter.EventoDTOConverter;
import br.unisinos.getfut.dto.EventoDTO;
import br.unisinos.getfut.repositorios.EventoRepository;

@Service
public class EventoService {

	private EventoRepository eventoRepository;

	@Autowired
	public EventoService(EventoRepository eventoRepository) {
		super();
		this.eventoRepository = eventoRepository;
	}

	public List<EventoDTO> buscarPorIdDonoEvento(Long idDonoEvento) {
		return EventoDTOConverter.toListDTO(eventoRepository.findByDonoEvento_Id(idDonoEvento));
	}

	public EventoDTO criarEvento(EventoDTO evento) {
		return EventoDTOConverter.toDTO(eventoRepository.save(EventoDTOConverter.toModel(evento)));
	}

	public List<EventoDTO> listarEventos() {
		return EventoDTOConverter.toListDTO(eventoRepository.findAll());
	}

}
