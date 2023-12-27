package com.mesantos.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mesantos.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{
	
	

}
