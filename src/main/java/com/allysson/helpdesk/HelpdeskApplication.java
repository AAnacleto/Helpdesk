package com.allysson.helpdesk;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.allysson.helpdesk.domain.Chamado;
import com.allysson.helpdesk.domain.Cliente;
import com.allysson.helpdesk.domain.Tecnico;
import com.allysson.helpdesk.domain.enuns.Perfil;
import com.allysson.helpdesk.domain.enuns.Prioridade;
import com.allysson.helpdesk.domain.enuns.Status;
import com.allysson.helpdesk.repositories.ChamadoRepository;
import com.allysson.helpdesk.repositories.ClienteRepository;
import com.allysson.helpdesk.repositories.TecnicoRepository;

@SpringBootApplication
public class HelpdeskApplication implements CommandLineRunner {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(HelpdeskApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
       Tecnico tec1= new Tecnico(null, "Valdir Cesar", "93653230268", "valdir@gmail.com", "123");	
       tec1.addPerfis(Perfil.ADMIN);
       
       Cliente cli1 = new Cliente(null, "Linus Torvald", "16298762086", "linus@gmail.com", "123");
       
       Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 01", "primeiro chamado"
       , tec1, cli1);
       
       tecnicoRepository.saveAll(Arrays.asList(tec1));
       clienteRepository.saveAll(Arrays.asList(cli1));
       chamadoRepository.saveAll(Arrays.asList(c1));
	}

}
