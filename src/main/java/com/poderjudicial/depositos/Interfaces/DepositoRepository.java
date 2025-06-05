package com.poderjudicial.depositos.Interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.poderjudicial.depositos.Modelo.Deposito;

@Repository
public interface DepositoRepository   extends JpaRepository<Deposito, Integer>{
	
	
	@Query(value = "SELECT * FROM buscarpordemandante2(:x_demandante)", nativeQuery = true)
	List<Deposito> buscarpordemandante2(@Param("x_demandante") String x_demandante);
	

}
