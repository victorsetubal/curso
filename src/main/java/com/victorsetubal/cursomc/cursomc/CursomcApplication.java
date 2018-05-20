package com.victorsetubal.cursomc.cursomc;

import com.victorsetubal.cursomc.cursomc.dominio.*;
import com.victorsetubal.cursomc.cursomc.dominio.enums.TipoCliente;
import com.victorsetubal.cursomc.cursomc.repositories.*;
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

	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

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


		Estado estado = new Estado(null, "MG");
		Estado estado1 = new Estado(null, "SP");

		Cidade cidade = new Cidade(null, "Uberlândia", estado);
		Cidade cidade1 = new Cidade(null, "São Paulo", estado1);
		Cidade cidade2 = new Cidade(null, "Campinas", estado1);

		estado.setCidades(Arrays.asList(cidade));
		estado1.setCidades(Arrays.asList(cidade1, cidade2));

		estadoRepository.saveAll(Arrays.asList(estado, estado1));
		cidadeRepository.saveAll(Arrays.asList(cidade, cidade1, cidade2));


		Cliente cliente = new Cliente(null, "Maria Silva", "maria@gmail.com", "99999999999", TipoCliente.PESSOAFISICA);
		cliente.getTelefones().addAll(Arrays.asList("1111111", "2222222"));
		Endereco e1 = new Endereco(null, "Rua Flores", "300", "Apto 303", "Jardim", "879789", cliente, cidade1);
		Endereco e2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "213123", cliente, cidade2);

		cliente.setEnderecos(Arrays.asList(e1, e2));

		clienteRepository.save(cliente);
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
	}
}
