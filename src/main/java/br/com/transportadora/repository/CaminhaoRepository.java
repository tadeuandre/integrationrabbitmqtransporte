package br.com.transportadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.transportadora.model.Caminhao;

public interface CaminhaoRepository extends JpaRepository<Caminhao, Long> {

}
