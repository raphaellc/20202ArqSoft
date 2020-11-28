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
public class EventoDTO {

	private Long id;
	private String nome;
	private ZonedDateTime dthInicio;
	private ZonedDateTime dthFim;
	private JogadorDTO donoEvento;
	private GrupoDTO grupo;
	private String local;

}
