package br.com.transportadora.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.transportadora.model.Caminhao;
import br.com.transportadora.service.CaminhaoService;
import br.com.transportadora.service.DestinatarioService;
import br.com.transportadora.service.EntregaService;
import br.com.transportadora.service.MotoristaService;

@RestController
public class TransportadoraResource {

	@Autowired
	private CaminhaoService caminhaoService;
	
	@Autowired
	private DestinatarioService destinatarioService;
	
	@Autowired
	private EntregaService entregaService;
	
	@Autowired
	private MotoristaService motoristaService;

	@PostMapping("/")
	public ResponseEntity<?> saveGraph(@RequestBody Caminhao data) {
		return null;
	}
}
