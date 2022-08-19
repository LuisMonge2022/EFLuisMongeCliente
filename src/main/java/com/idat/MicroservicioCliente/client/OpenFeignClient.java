package com.idat.MicroservicioCliente.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.MicroservicioCliente.dto.ClienteDTO;

@FeignClient(name ="idat-pizerria", url="localhost:8080")
public interface OpenFeignClient {
	
	@GetMapping("/api/v1/pizerria/listar")
	public List<ClienteDTO> pizerriaSeleccionados();

}
