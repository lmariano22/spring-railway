package com.poderjudicial.depositos.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poderjudicial.depositos.Interfaces.DepositoRepository;
import com.poderjudicial.depositos.Modelo.Deposito;
import com.poderjudicial.depositosInterfaceService.DepositoServicio;

import jakarta.transaction.Transactional;

@Service
public class DepositoServicioImpl implements DepositoServicio{
	
	
	@Autowired
	private DepositoRepository repository;
	

	@Override
	@Transactional
	public List<Deposito> listardepositosuu(String x_demandante) {
	
		return repository.buscarpordemandante2(x_demandante);
	}
	
	
	
	
	

}
