package br.com.msproduto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.msproduto.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
