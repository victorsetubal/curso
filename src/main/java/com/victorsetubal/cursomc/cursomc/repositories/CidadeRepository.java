package com.victorsetubal.cursomc.cursomc.repositories;

import com.victorsetubal.cursomc.cursomc.dominio.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by victorcardoso on 19/05/18.
 */

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {
}
