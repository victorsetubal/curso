package com.victorsetubal.cursomc.cursomc.service;

import com.victorsetubal.cursomc.cursomc.dominio.Cidade;
import com.victorsetubal.cursomc.cursomc.dominio.Estado;
import com.victorsetubal.cursomc.cursomc.exceptions.ObjectNotFoundException;
import com.victorsetubal.cursomc.cursomc.repositories.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by victorcardoso on 19/05/18.
 */

@Service
public class EstadoService {

    @Autowired
    private EstadoRepository estadoRepository;

    public Estado buscar (Integer id) {
        Optional<Estado> obj = estadoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo:  " + Estado.class.getName()));
    }
}
