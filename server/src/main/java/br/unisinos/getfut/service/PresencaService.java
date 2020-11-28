package br.unisinos.getfut.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisinos.getfut.converter.PresencaDTOConverter;
import br.unisinos.getfut.dto.PresencaDTO;
import br.unisinos.getfut.enums.PosicaoEnum;
import br.unisinos.getfut.modelo.PresencaModel;
import br.unisinos.getfut.modelo.id.PresencaId;
import br.unisinos.getfut.repositorios.PresencaRepository;

@Service
public class PresencaService {

	private PresencaRepository presencaRepository;

	@Autowired
	public PresencaService(PresencaRepository presencaRepository) {
		super();
		this.presencaRepository = presencaRepository;
	}

	public PresencaDTO salvarPresenca(Long idJogador, Long idEvento, PosicaoEnum posicao) {
		return PresencaDTOConverter.toDTO(
				presencaRepository.save(PresencaModel.builder()
				.id(PresencaId.builder().idJogador(idJogador).idEvento(idEvento).build()).posicao(posicao).build()));
	}

	public void removerPresenca(Long idJogador, Long idEvento) {
		presencaRepository.delete(PresencaModel.builder()
				.id(PresencaId.builder().idJogador(idJogador).idEvento(idEvento).build()).build());
	}

}
