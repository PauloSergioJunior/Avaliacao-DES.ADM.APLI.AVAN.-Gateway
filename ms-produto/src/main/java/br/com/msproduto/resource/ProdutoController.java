package br.com.msproduto.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.msproduto.model.Produto;
import br.com.msproduto.service.ProdutoService;

/**
 * @author Paulo
 *
 */

@RestController
@RequestMapping("/v1/api/produto")
public class ProdutoController {
	
	@Autowired
	private ProdutoService service;
	
	@GetMapping
	public ResponseEntity<List<Produto>> lista(){
		return ResponseEntity.ok(this.service.lista());
	}
	
}
