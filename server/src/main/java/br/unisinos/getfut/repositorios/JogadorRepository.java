package br.unisinos.getfut.repositorios;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.unisinos.getfut.modelo.JogadorModel;

@Repository
public interface JogadorRepository extends CrudRepository<JogadorModel, Long> {

	List<JogadorModel> findByNome(String nome);

	List<JogadorModel> findByEmail(String email);
	
	JogadorModel findByEmailAndSenha(String email, String senha);
	
	Optional<JogadorModel> findById(Long id);

}
