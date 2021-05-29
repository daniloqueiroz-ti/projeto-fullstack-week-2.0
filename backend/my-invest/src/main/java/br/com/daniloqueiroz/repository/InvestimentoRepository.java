package br.com.daniloqueiroz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.daniloqueiroz.domain.Investimento;

public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {

}
