package br.unisinos.getfut.modelo;

import java.io.Serializable;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity(name = "Evento")
public class EventoModel implements Serializable {

	private static final long serialVersionUID = 1859564144944272752L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private ZonedDateTime dthInicio;
	private ZonedDateTime dthFim;
	@OneToOne
	@JoinColumn(name = "jogadorId")
	private JogadorModel donoEvento;
	@OneToOne
	@JoinColumn(name = "grupoId")
	private GrupoModel grupo;
	private String local;
}
