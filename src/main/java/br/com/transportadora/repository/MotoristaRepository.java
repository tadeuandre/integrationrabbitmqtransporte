package br.com.transportadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.transportadora.model.Motorista;

public interface MotoristaRepository extends JpaRepository<Motorista, Long> {

}
