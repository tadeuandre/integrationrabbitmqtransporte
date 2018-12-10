package br.com.transportadora.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.transportadora.model.Destinatario;

public interface DestinatarioRepository extends JpaRepository<Destinatario, Long> {

}
