package com.victorsetubal.cursomc.cursomc.service;

import com.victorsetubal.cursomc.cursomc.dominio.Cidade;
import com.victorsetubal.cursomc.cursomc.dominio.EnderecoDTO;
import com.victorsetubal.cursomc.cursomc.exceptions.ObjectNotFoundException;
import com.victorsetubal.cursomc.cursomc.repositories.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Created by victorcardoso on 19/05/18.
 */

@Service
public class CidadeService {

    @Autowired
    private CidadeRepository cidadeRepository;

    public Cidade buscar (Integer id) {
        Optional<Cidade> obj = cidadeRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo:  " + Cidade.class.getName()));
    }

    public List<EnderecoDTO> buscarEnderecosMaiorNumero () {
        return cidadeRepository.buscarEnderecosMaiorNumero();
    }
}
