package br.com.mscliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mscliente.model.Cliente;

@Repository
public interface ClienteReporitory extends JpaRepository<Cliente, Long>{

}
