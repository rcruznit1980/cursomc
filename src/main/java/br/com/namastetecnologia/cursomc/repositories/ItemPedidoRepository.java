package br.com.namastetecnologia.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.namastetecnologia.cursomc.domain.Categoria;
import br.com.namastetecnologia.cursomc.domain.ItemPedido;

@Repository
public interface ItemPedidoRepository extends JpaRepository <ItemPedido, Integer> {

}
