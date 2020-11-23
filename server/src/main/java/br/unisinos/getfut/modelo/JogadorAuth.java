package br.unisinos.getfut.modelo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class JogadorAuth {
    private Long id;
    private boolean autorizado;
}
