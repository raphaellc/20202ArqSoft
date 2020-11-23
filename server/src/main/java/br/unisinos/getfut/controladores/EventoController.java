package br.unisinos.getfut.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unisinos.getfut.modelo.EventoModel;
import br.unisinos.getfut.service.EventoService;

@RequestMapping("/evento")
@RestController
public class EventoController {

	@Autowired
	private EventoService eventoService;

	@GetMapping
	public List<EventoModel> buscarPorDono(@RequestParam("idDonoEvento") Long idDonoEvento) {
		return eventoService.buscarPorIdDonoEvento(idDonoEvento);
	}

	@PostMapping
	public EventoModel criarEvento(@RequestBody() EventoModel evento) {
		return eventoService.criarEvento(evento);
	}

	@GetMapping("/todos")
	public List<EventoModel> listarEventos() {
		return eventoService.listarEventos();
	}

}
