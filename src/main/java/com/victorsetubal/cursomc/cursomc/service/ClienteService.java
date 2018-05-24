package com.victorsetubal.cursomc.cursomc.service;

import com.victorsetubal.cursomc.cursomc.dominio.Categoria;
import com.victorsetubal.cursomc.cursomc.dominio.Cliente;
import com.victorsetubal.cursomc.cursomc.exceptions.ObjectNotFoundException;
import com.victorsetubal.cursomc.cursomc.repositories.CategoriaRepository;
import com.victorsetubal.cursomc.cursomc.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente buscar (Integer id) {
        Optional <Cliente> obj = clienteRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo:  " + Cliente.class.getName()));
    }
}
