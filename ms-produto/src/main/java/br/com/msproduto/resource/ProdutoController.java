package br.com.msproduto.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.msproduto.model.Produto;
import br.com.msproduto.service.ProdutoService;

/**
 * @author Paulo
 *
 */

@Repository
@RequestMapping("/v1/api/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<List<Produto>> lista(){
		return ResponseEntity.ok(this.service.lista());
	}
	
}
