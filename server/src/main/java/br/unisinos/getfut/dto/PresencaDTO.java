package br.unisinos.getfut.dto;

import br.unisinos.getfut.enums.PosicaoEnum;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class PresencaDTO {

	private PresencaIdDTO id;
	private PosicaoEnum posicao;

}
