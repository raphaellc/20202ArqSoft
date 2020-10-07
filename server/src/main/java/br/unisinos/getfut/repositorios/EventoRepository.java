package br.unisinos.getfut.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.unisinos.getfut.modelo.EventoModel;

@Repository
public interface EventoRepository extends CrudRepository<EventoModel, Long> {

}
