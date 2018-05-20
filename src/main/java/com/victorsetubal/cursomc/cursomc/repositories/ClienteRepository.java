package com.victorsetubal.cursomc.cursomc.repositories;

import com.victorsetubal.cursomc.cursomc.dominio.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
