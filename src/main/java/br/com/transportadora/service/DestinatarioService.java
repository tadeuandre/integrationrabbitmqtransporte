package br.com.transportadora.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transportadora.model.Destinatario;
import br.com.transportadora.repository.DestinatarioRepository;

@Service
public class DestinatarioService {

	private DestinatarioRepository destinatarioRepository;

	@Autowired
	public void setDao(DestinatarioRepository destinatarioRepository) {
		this.destinatarioRepository = destinatarioRepository;
	}
	
	public Destinatario save(Destinatario destinatario) {
		return destinatarioRepository.save(destinatario);
	}
	
	public Optional<Destinatario> findOne(Long id) {
		return destinatarioRepository.findById(id);
	}
	
	public Iterable<Destinatario> findAll() {
		return destinatarioRepository.findAll();
	}
}
