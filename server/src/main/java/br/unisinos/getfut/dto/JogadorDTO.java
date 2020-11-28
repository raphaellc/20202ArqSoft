package br.unisinos.getfut.dto;

import java.time.ZonedDateTime;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Data
public class JogadorDTO {

	private Long id;
	private String nome;
	private ZonedDateTime dataNascimento;
	private String email;
	private String senha;
	private int codPosicao;

}
