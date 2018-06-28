package com.algaworks.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.crm.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
