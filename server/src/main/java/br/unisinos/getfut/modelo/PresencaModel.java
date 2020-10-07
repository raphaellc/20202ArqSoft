package br.unisinos.getfut.modelo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.unisinos.getfut.enums.PosicaoEnum;
import br.unisinos.getfut.modelo.id.PresencaId;
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
@Table(name = "Presenca")
public class PresencaModel {

	@EmbeddedId
	private PresencaId id;
	private int codPosicao;

}
