package com.victorsetubal.cursomc.cursomc.resources;

import com.victorsetubal.cursomc.cursomc.dominio.Categoria;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

    @RequestMapping(method = RequestMethod.GET)
    public List<Categoria> listar () {
        Categoria categoria = new Categoria(1, "Informática");
        List<Categoria> categorias = new ArrayList<>();
        categorias.add(categoria);
        return categorias;
    }
}
