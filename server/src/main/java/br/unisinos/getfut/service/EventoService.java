package br.unisinos.getfut.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisinos.getfut.modelo.EventoModel;
import br.unisinos.getfut.repositorios.EventoRepository;

@Service
public class EventoService {

	private EventoRepository eventoRepository;

	@Autowired
	public EventoService(EventoRepository eventoRepository) {
		super();
		this.eventoRepository = eventoRepository;
	}

	public List<EventoModel> buscarPorIdDonoEvento(Long idDonoEvento) {
		return eventoRepository.findByDonoEvento_Id(idDonoEvento);
	}

	public EventoModel criarEvento(EventoModel evento) {
		return eventoRepository.save(evento);
	}

	public List<EventoModel> listarEventos() {
		return eventoRepository.findAll();
	}

}
