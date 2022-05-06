package com.springboot.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.gestaofesta.model.Convidado;

public interface Convidados extends JpaRepository<Convidado, Long> {
	
}
