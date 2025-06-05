package com.poderjudicial.depositos.Modelo;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "deposito")
public class Deposito {
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_deposito;
    private String x_formato;
    private String n_unico;
    private String n_incidente;
    private String c_depositoj;
    private String x_demandante;
    private String x_sede;
    private String x_instancia;
    private String f_recojo;
    private String f_recojo_rezago;
    private String x_direccion;
    
    
    
    public Deposito() {
    	
    	}
    

	public Deposito(Integer id_deposito, String x_formato, String n_unico, String n_incidente, String c_deposito,
			String x_demandante, String x_sede, String x_instancia, String f_recojo, String f_recojo_rezago,
			String x_direccion) {
		this.id_deposito = id_deposito;
		this.x_formato = x_formato;
		this.n_unico = n_unico;
		this.n_incidente = n_incidente;
		this.c_depositoj = c_deposito;
		this.x_demandante = x_demandante;
		this.x_sede = x_sede;
		this.x_instancia = x_instancia;
		this.f_recojo = f_recojo;
		this.f_recojo_rezago = f_recojo_rezago;
		this.x_direccion = x_direccion;
	}
	
	
	
	public Integer getId_deposito() {
		return id_deposito;
	}
	public void setId_deposito(Integer id_deposito) {
		this.id_deposito = id_deposito;
	}
	public String getX_formato() {
		return x_formato;
	}
	public void setX_formato(String x_formato) {
		this.x_formato = x_formato;
	}
	public String getN_unico() {
		return n_unico;
	}
	public void setN_unico(String n_unico) {
		this.n_unico = n_unico;
	}
	public String getN_incidente() {
		return n_incidente;
	}
	public void setN_incidente(String n_incidente) {
		this.n_incidente = n_incidente;
	}
	public String getC_deposito() {
		return c_depositoj;
	}
	public void setC_deposito(String c_deposito) {
		this.c_depositoj = c_deposito;
	}
	public String getX_demandante() {
		return x_demandante;
	}
	public void setX_demandante(String x_demandante) {
		this.x_demandante = x_demandante;
	}
	public String getX_sede() {
		return x_sede;
	}
	public void setX_sede(String x_sede) {
		this.x_sede = x_sede;
	}
	public String getX_instancia() {
		return x_instancia;
	}
	public void setX_instancia(String x_instancia) {
		this.x_instancia = x_instancia;
	}
	public String getF_recojo() {
		return f_recojo;
	}
	public void setF_recojo(String f_recojo) {
		this.f_recojo = f_recojo;
	}
	public String getF_recojo_rezago() {
		return f_recojo_rezago;
	}
	public void setF_recojo_rezago(String f_recojo_rezago) {
		this.f_recojo_rezago = f_recojo_rezago;
	}
	public String getX_direccion() {
		return x_direccion;
	}
	public void setX_direccion(String x_direccion) {
		this.x_direccion = x_direccion;
	}


}
