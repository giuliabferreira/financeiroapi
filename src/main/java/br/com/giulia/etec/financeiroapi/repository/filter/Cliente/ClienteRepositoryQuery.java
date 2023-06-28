package br.com.giulia.etec.financeiroapi.repository.filter.Cliente;

import br.com.giulia.etec.financeiroapi.model.Cliente;
import br.com.giulia.etec.financeiroapi.repository.filter.ClienteFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteRepositoryQuery {

    public Page<Cliente> filtrarCliente(ClienteFilter clienteFilter, Pageable pageable);
}
