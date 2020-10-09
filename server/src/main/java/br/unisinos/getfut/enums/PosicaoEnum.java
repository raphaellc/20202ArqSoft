package br.unisinos.getfut.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access=AccessLevel.PRIVATE)
@Getter
public enum PosicaoEnum {
	
	GOLEIRO(1, "Goleiro"),
	LATERAL(2, "Lateral"),
	ZAGUEIRO(3, "Zagueiro"),
	VOLANTE(4, "Volante"),
	MEIA(5, "Meia"),
	ATACANTE(6, "Atacante");
	
	private Integer codigo;
	private String descricao;
	
	public static PosicaoEnum fromCodigo(int codigo) {
		for (PosicaoEnum p : values()) {
			if (p.getCodigo().equals(codigo)) {
				return p;
			}
		}
		return null;
	}

}
