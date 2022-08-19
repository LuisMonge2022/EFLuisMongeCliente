package com.idat.MicroservicioCliente.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioCliente.client.OpenFeignClient;
import com.idat.MicroservicioCliente.dto.ClienteDTO;
import com.idat.MicroservicioCliente.modelo.Cliente;
import com.idat.MicroservicioCliente.modelo.PizerriaDetalle;
import com.idat.MicroservicioCliente.modelo.PizerriaDetalleFK;
import com.idat.MicroservicioCliente.repositorio.ClienteRepositorio;
import com.idat.MicroservicioCliente.repositorio.PizerriaDetalleRepositorio;

@Service
public class ClienteServicioImpl implements ClienteServicio{
	
	@Autowired
	private ClienteRepositorio repositorio;
	
	@Autowired
	private OpenFeignClient feign;
	
	@Autowired
	private PizerriaDetalleRepositorio  pizerriaDetalleRepositorio;
	

	@Override
	public List<Cliente> listarCliente() {
		return repositorio.findAll();
	}

	@Override
	public void guardarCliente(Cliente cliente) {
		repositorio.save(cliente);
		
	}

	@Override
	public void asignarPizzerria() {
		
		List<ClienteDTO> listado = feign.pizerriaSeleccionados();
		
		PizerriaDetalle detalle = null;
		PizerriaDetalleFK fk = null;
		
		for (ClienteDTO clienteteDTO : listado) {
			detalle = new PizerriaDetalle();
			fk = new PizerriaDetalleFK();	
			
			fk.setIdPizerria(clienteteDTO.getIdPizerria());
			fk.setIdPizza(1);
			
			detalle.setFk(fk);
			pizerriaDetalleRepositorio.save(detalle);
		}	
		
	}

}
