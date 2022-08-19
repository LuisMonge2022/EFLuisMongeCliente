package com.idat.MicroservicioCliente.servicio;

import java.util.List;

import com.idat.MicroservicioCliente.modelo.Cliente;

public interface ClienteServicio {	
	
	public List<Cliente> listarCliente();
	
	public void guardarCliente(Cliente cliente);
	
	void asignarPizzerria();
	

}
