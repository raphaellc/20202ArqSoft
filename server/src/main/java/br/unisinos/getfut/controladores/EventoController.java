package br.unisinos.getfut.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unisinos.getfut.dto.EventoDTO;
import br.unisinos.getfut.service.EventoService;

@RequestMapping("/evento")
@RestController
public class EventoController {

	@Autowired
	private EventoService eventoService;

	@GetMapping
	public List<EventoDTO> buscarPorDono(@RequestParam("idDonoEvento") Long idDonoEvento) {
		return eventoService.buscarPorIdDonoEvento(idDonoEvento);
	}

	@PostMapping
	public EventoDTO criarEvento(@RequestBody() EventoDTO evento) {
		return eventoService.criarEvento(evento);
	}

	@GetMapping("/todos")
	public List<EventoDTO> listarEventos() {
		return eventoService.listarEventos();
	}

}
