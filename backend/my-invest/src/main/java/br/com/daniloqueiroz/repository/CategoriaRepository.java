package br.com.daniloqueiroz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daniloqueiroz.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
