package br.unisinos.getfut.enums;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access=AccessLevel.PRIVATE)
@Getter
public enum PosicaoEnum {
	
	GOLEIRO(0, "Goleiro"),
	LATERAL(1, "Lateral"),
	ZAGUEIRO(2, "Zagueiro"),
	VOLANTE(3, "Volante"),
	MEIA(4, "Meia"),
	ATACANTE(5, "Atacante");
	
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
