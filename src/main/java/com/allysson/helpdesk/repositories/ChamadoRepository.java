package com.allysson.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.allysson.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
