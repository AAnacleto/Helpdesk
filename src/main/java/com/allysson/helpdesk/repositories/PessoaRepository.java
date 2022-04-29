package com.allysson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allysson.helpdesk.domain.Cliente;

public interface PessoaRepository extends JpaRepository<Cliente, Integer> {

}
