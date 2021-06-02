/**
 * 
 */
package br.com.msproduto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.msproduto.model.Produto;
import br.com.msproduto.repository.ProdutoRepository;

/**
 * @author Paulo
 *
 */

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> lista(){
		return this.produtoRepository.findAll();
	}
}
