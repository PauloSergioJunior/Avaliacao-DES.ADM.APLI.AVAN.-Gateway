/**
 * 
 */
package br.com.mscliente.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mscliente.model.Cliente;
import br.com.mscliente.repository.ClienteReporitory;

/**
 * @author Paulo
 *
 */

@Service
public class ClienteService {

	@Autowired
	private ClienteReporitory clienteReporitory;
	
	
	public List<Cliente> lista(){
		return this.clienteReporitory.findAll();
	}
	
}
