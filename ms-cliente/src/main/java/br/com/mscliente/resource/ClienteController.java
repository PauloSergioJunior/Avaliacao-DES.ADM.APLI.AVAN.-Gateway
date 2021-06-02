/**
 * 
 */
package br.com.mscliente.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.mscliente.model.Cliente;
import br.com.mscliente.service.ClienteService;

/**
 * @author Paulo
 *
 */


@Repository
@RequestMapping("/v1/api/cliente")
public class ClienteController {

	
	@Autowired
	private ClienteService service;
	
	
	@GetMapping
	public ResponseEntity<List<Cliente>> lista(){
		return ResponseEntity.ok(this.service.lista());
	}
}
