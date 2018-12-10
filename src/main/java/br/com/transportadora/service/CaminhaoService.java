package br.com.transportadora.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.transportadora.model.Caminhao;
import br.com.transportadora.repository.CaminhaoRepository;

@Service
public class CaminhaoService {

	private CaminhaoRepository caminhaoRepository;

	@Autowired
	public void setDao(CaminhaoRepository caminhaoRepository) {
		this.caminhaoRepository = caminhaoRepository;
	}
	
	public Caminhao save(Caminhao caminhao) {
		return caminhaoRepository.save(caminhao);
	}
	
	public Optional<Caminhao> findOne(Long id) {
		return caminhaoRepository.findById(id);
	}
	
	public Iterable<Caminhao> findAll() {
		return caminhaoRepository.findAll();
	}

}
