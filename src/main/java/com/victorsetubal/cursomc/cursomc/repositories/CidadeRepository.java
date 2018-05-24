package com.victorsetubal.cursomc.cursomc.repositories;

import com.victorsetubal.cursomc.cursomc.dominio.Cidade;
import com.victorsetubal.cursomc.cursomc.dominio.EnderecoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by victorcardoso on 19/05/18.
 */

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

    @Query("SELECT new com.victorsetubal.cursomc.cursomc.dominio.EnderecoDTO(c.nome, es.nome, en.logradouro)  FROM Cidade c" +
            " INNER JOIN c.estado as es" +
            " INNER JOIN c.endereco as en " +
            " WHERE en.numero = (SELECT MAX(e.numero) FROM Endereco e WHERE e.cidade.id = c.id)")
    List<EnderecoDTO> buscarEnderecosMaiorNumero();

}
