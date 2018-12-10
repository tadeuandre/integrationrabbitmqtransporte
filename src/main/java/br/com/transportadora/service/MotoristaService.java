package br.com.transportadora.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transportadora.model.Motorista;
import br.com.transportadora.repository.MotoristaRepository;

@Service
public class MotoristaService {

	private MotoristaRepository motoristaRepository;

	@Autowired
	public void setDao(MotoristaRepository motoristaRepository) {
		this.motoristaRepository = motoristaRepository;
	}
	
	public Motorista save(Motorista motorista) {
		return motoristaRepository.save(motorista);
	}
	
	public Optional<Motorista> findOne(Long id) {
		return motoristaRepository.findById(id);
	}
	
	public Iterable<Motorista> findAll() {
		return motoristaRepository.findAll();
	}
	
}
