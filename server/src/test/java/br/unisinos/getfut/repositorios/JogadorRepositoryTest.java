package br.unisinos.getfut.repositorios;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.unisinos.getfut.BaseGetFutApplicationTest;
import br.unisinos.getfut.modelo.JogadorModel;

class JogadorRepositoryTest extends BaseGetFutApplicationTest {

    @Test
    void encontraUsuariosPorNome(@Autowired JogadorRepository repositorio) {
        final List<JogadorModel> jogadores = repositorio.findByNome("Vinicius");

        assertThat(jogadores)
                .hasSize(1)
                .first().satisfies(jogador -> {
            assertThat(jogador.getId()).isGreaterThan(0);
            assertThat(jogador.getNome()).isEqualTo("Vinicius");
            assertThat(jogador.getEmail()).isEqualTo("vinicius@gmail.com");
        });
    }
}