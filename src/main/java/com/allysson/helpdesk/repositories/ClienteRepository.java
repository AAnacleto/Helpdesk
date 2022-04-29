package com.allysson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allysson.helpdesk.domain.Pessoa;

public interface ClienteRepository extends JpaRepository<Pessoa, Integer> {

}
