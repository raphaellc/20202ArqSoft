package br.unisinos.getfut.modelo;

import java.time.ZonedDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.unisinos.getfut.enums.PosicaoEnum;
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
@Entity(name = "Jogador")
public class JogadorModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private ZonedDateTime dataNascimento;
	private String email;
	private String senha;
	private int codPosicao;

	public JogadorModel(String nome, ZonedDateTime dataNascimento, String email) {
		this.nome = Objects.requireNonNull(nome);
		this.dataNascimento = Objects.requireNonNull(dataNascimento);
		this.email = Objects.requireNonNull(email);
	}

	public PosicaoEnum getPosicao() {
		return PosicaoEnum.fromCodigo(codPosicao);
	}
}
