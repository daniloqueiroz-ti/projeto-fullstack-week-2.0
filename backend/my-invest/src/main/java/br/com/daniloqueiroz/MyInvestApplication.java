package br.com.daniloqueiroz;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.daniloqueiroz.domain.Categoria;
import br.com.daniloqueiroz.domain.Investimento;
import br.com.daniloqueiroz.repository.CategoriaRepository;
import br.com.daniloqueiroz.repository.InvestimentoRepository;

@SpringBootApplication
public class MyInvestApplication implements CommandLineRunner {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	InvestimentoRepository investimentoRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyInvestApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		Categoria categoria1 = new Categoria("FIs", "Fundos Imobiliários");
		Categoria categoria2 = new Categoria("Ações BR", "Ações Brasileiras");
		Categoria categoria3 = new Categoria("Ações EUA", "Ações Americanas");
		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3));
		
		Investimento investimento1 = new Investimento("KISU11", 103.10, 59, LocalDate.parse("2020-01-08"), categoria1);
		Investimento investimento2 = new Investimento("WEGE3", 23.51, 389, LocalDate.parse("2020-02-16"), categoria2);
		Investimento investimento3 = new Investimento("VNQ", 87.19, 23, LocalDate.parse("2020-03-22"), categoria3);
		investimentoRepository.saveAll(Arrays.asList(investimento1, investimento2, investimento3));
		
	}

}
