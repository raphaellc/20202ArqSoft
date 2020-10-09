package br.unisinos.getfut.modelo;

import java.time.ZonedDateTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "Jogador")
public class JogadorModel {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
    private String nome;
    private ZonedDateTime dataNascimento;
    private String email;
    private int codPosicao;

    public JogadorModel(String nome, ZonedDateTime dataNascimento, String email) {
        this.nome = Objects.requireNonNull(nome);
        this.dataNascimento = Objects.requireNonNull(dataNascimento);
        this.email = Objects.requireNonNull(email);
    }

    @Override
    public String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this)
                .add("id", id)
                .add("nome", nome)
                .add("dataNascimento", dataNascimento)
                .add("email", email)
                .toString();
    }
    
    public PosicaoEnum getPosicao() {
		return PosicaoEnum.fromCodigo(codPosicao);
    }
}
