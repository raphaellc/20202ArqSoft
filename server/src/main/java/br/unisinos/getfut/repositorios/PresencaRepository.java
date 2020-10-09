package br.unisinos.getfut.repositorios;

import org.springframework.data.repository.CrudRepository;

import br.unisinos.getfut.modelo.PresencaModel;
import br.unisinos.getfut.modelo.id.PresencaId;

public interface PresencaRepository extends CrudRepository<PresencaModel, PresencaId> {

}
