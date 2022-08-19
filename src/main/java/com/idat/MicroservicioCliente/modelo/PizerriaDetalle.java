package com.idat.MicroservicioCliente.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "detalle_pizerria")
public class PizerriaDetalle {
	
	@Id
	private PizerriaDetalleFK fk= new PizerriaDetalleFK();

	public PizerriaDetalleFK getFk() {
		return fk;
	}

	public void setFk(PizerriaDetalleFK fk) {
		this.fk = fk;
	}
	
	
	
	

}
