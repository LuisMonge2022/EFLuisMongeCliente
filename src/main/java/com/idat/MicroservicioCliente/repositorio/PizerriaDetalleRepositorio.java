package com.idat.MicroservicioCliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroservicioCliente.modelo.PizerriaDetalle;

@Repository
public interface PizerriaDetalleRepositorio extends JpaRepository<PizerriaDetalle, Integer>{

}
