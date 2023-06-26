package br.com.giulia.etec.financeiroapi.repository;

import br.com.giulia.etec.financeiroapi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
