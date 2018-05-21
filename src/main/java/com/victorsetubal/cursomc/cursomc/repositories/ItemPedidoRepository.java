package com.victorsetubal.cursomc.cursomc.repositories;

import com.victorsetubal.cursomc.cursomc.dominio.ItemPedido;
import com.victorsetubal.cursomc.cursomc.dominio.Pedido;
import com.victorsetubal.cursomc.cursomc.dominio.composite.ItemPedidoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {

}
