package br.com.namastetecnologia.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.namastetecnologia.cursomc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository <Estado, Integer> {

}
