package br.com.transportadora.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transportadora.model.Entrega;
import br.com.transportadora.repository.EntregaRepository;

@Service
public class EntregaService {

	private EntregaRepository entregaRepository;

	@Autowired
	public void setDao(EntregaRepository entregaRepository) {
		this.entregaRepository = entregaRepository;
	}
	
	public Entrega save(Entrega entrega) {
		return entregaRepository.save(entrega);
	}
	
	public Optional<Entrega> findOne(Long id) {
		return entregaRepository.findById(id);
	}
	
	public Iterable<Entrega> findAll() {
		return entregaRepository.findAll();
	}
}
