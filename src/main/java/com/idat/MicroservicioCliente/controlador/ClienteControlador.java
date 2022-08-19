package com.idat.MicroservicioCliente.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MicroservicioCliente.modelo.Cliente;
import com.idat.MicroservicioCliente.servicio.ClienteServicio;

@Controller
@RequestMapping("/api/v1/cliente")
public class ClienteControlador {
	
	@Autowired
	private ClienteServicio service;
	
	@GetMapping("/listar")
	public @ResponseBody List<Cliente> listarAlumnos(){		
		return service.listarCliente();
		
	}
	
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarAlumno(@RequestBody Cliente cliente) {
		service.guardarCliente(cliente);	
		
	}
	
	@GetMapping("/asignar")
	public @ResponseBody void asignarCliente() {
		service.asignarPizzerria();	
		
	}
	

}
