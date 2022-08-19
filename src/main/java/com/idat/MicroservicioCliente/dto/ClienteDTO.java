package com.idat.MicroservicioCliente.dto;


public class ClienteDTO {
	
	public ClienteDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Integer idPizerria;	
	private String direccion;
	private String sede;
	
	
	
	public ClienteDTO(Integer idPizerria, String direccion, String sede) {
		super();
		this.idPizerria = idPizerria;
		this.direccion = direccion;
		this.sede = sede;
	}
	public Integer getIdPizerria() {
		return idPizerria;
	}
	public void setIdPizerria(Integer idPizerria) {
		this.idPizerria = idPizerria;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getSede() {
		return sede;
	}
	public void setSede(String sede) {
		this.sede = sede;
	}
	
	

}
