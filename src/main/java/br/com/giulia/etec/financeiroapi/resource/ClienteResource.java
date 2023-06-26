package br.com.giulia.etec.financeiroapi.resource;

import br.com.giulia.etec.financeiroapi.model.Cliente;
import br.com.giulia.etec.financeiroapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/todos")
    private List<Cliente> listarTodosOsClientes()
    {
        return clienteRepository.findAll();
    }

}
