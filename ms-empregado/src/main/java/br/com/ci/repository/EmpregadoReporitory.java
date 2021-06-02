/**
 * 
 */
package br.com.ci.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ci.model.Empregado;

/**
 * @author cbgomes
 *
 */
@Repository
public interface EmpregadoReporitory extends JpaRepository<Empregado, Long> {

}
