package com.victorsetubal.cursomc.cursomc.service;

import com.victorsetubal.cursomc.cursomc.dominio.Pedido;
import com.victorsetubal.cursomc.cursomc.exceptions.ObjectNotFoundException;
import com.victorsetubal.cursomc.cursomc.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    public Pedido buscar (Integer id) {
        Optional <Pedido> obj = pedidoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo:  " + Pedido.class.getName()));
    }
}
