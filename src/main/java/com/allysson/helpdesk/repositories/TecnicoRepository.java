package com.allysson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allysson.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
