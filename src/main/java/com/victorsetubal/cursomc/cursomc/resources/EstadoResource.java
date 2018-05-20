package com.victorsetubal.cursomc.cursomc.resources;

import com.victorsetubal.cursomc.cursomc.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by victorcardoso on 19/05/18.
 */

@RestController
@RequestMapping(value = "/estados")
public class EstadoResource {

    @Autowired
    private EstadoService estadoService;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> buscar (@PathVariable Integer id) {
        return ResponseEntity.ok().body(estadoService.buscar(id));
    }
}
