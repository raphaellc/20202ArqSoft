package br.unisinos.getfut.modelo;

import java.time.ZonedDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapKey;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
@Entity
@Table(name = "Evento")
public class EventoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private ZonedDateTime dthInicio;
	private ZonedDateTime dthFim;
	@OneToOne
	@JoinColumn(name = "jogador_id")
	private JogadorModel donoEvento;
	@OneToOne
	@JoinColumn(name = "grupo_id")
	private GrupoModel grupo;
	private String local;
}
