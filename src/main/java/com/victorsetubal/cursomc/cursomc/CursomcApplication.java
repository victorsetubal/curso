package com.victorsetubal.cursomc.cursomc;

import com.victorsetubal.cursomc.cursomc.dominio.Categoria;
import com.victorsetubal.cursomc.cursomc.dominio.Produto;
import com.victorsetubal.cursomc.cursomc.repositories.CategoriaRepository;
import com.victorsetubal.cursomc.cursomc.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
    private ProdutoRepository produtoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run (String ... args) throws Exception {
		Categoria categoria = new Categoria(null, "Informática");
		Categoria categoria2 = new Categoria(null, "Escritório");

        Produto produto = new Produto(null, "Computador", 2000.0);
        Produto produto2 = new Produto(null, "Impressora", 800.0);
        Produto produto3 = new Produto(null, "Mouse", 80.0);

        categoria.setProdutos(Arrays.asList(produto, produto2, produto3));
        categoria2.setProdutos(Arrays.asList(produto2));

        produto.setCategorias(Arrays.asList(categoria));
        produto2.setCategorias(Arrays.asList(categoria, categoria2));
        produto3.setCategorias(Arrays.asList(categoria));

		categoriaRepository.saveAll(Arrays.asList(categoria, categoria2));
		produtoRepository.saveAll(Arrays.asList(produto, produto2, produto3));
	}
}
