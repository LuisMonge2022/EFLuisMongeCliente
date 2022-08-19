package com.idat.MicroservicioCliente.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PizerriaDetalleFK implements Serializable{
	
	
	private static final long serialVersionUID = -3564688090036676406L;

	@Column(name = "id_pizerria",nullable = false, unique= true)	
	private Integer idPizerria;	
	
	@Column(name = "id_pizza",nullable = false, unique= true)
	private Integer idPizza;
	
	public Integer getIdPizerria() {
		return idPizerria;
	}
	public void setIdPizerria(Integer idPizerria) {
		this.idPizerria = idPizerria;
	}
	public Integer getIdPizza() {
		return idPizza;
	}
	public void setIdPizza(Integer idPizza) {
		this.idPizza = idPizza;
	}
	
	

}
