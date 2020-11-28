package br.unisinos.getfut.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.unisinos.getfut.converter.PresencaDTOConverter;
import br.unisinos.getfut.dto.PresencaDTO;
import br.unisinos.getfut.enums.PosicaoEnum;
import br.unisinos.getfut.service.PresencaService;

@RequestMapping("/presenca")
@RestController
public class PresencaController {

	@Autowired
	private PresencaService presencaService;

	@PostMapping
	public PresencaDTO confirmarPresenca(@RequestParam("idJogador") Long idJogador,
			@RequestParam("idEvento") Long idEvento, @RequestParam(required = false) PosicaoEnum posicao) {
		return presencaService.salvarPresenca(idJogador, idEvento, posicao);
	}

	@DeleteMapping
	public void removerPresenca(@RequestParam("idJogador") Long idJogador, @RequestParam("idEvento") Long idEvento) {
		presencaService.removerPresenca(idJogador, idEvento);
	}

}
