package com.victorsetubal.cursomc.cursomc.repositories;

import com.victorsetubal.cursomc.cursomc.dominio.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
