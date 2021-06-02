/**
 * 
 */
package br.com.ci.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ci.model.Empregado;
import br.com.ci.repository.EmpregadoReporitory;

/**
 * @author cbgomes
 *
 */
@Service
public class EmpregadoService {

	@Autowired
	private EmpregadoReporitory reporitory;
	
	public List<Empregado> lista(){
		return this.reporitory.findAll();
	}
	
}
