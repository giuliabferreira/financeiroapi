package br.com.giulia.etec.financeiroapi.resource;

import br.com.giulia.etec.financeiroapi.model.ContasPagar;
import br.com.giulia.etec.financeiroapi.repository.ContasPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contaspagar")
public class ContasPagarResource {

    @Autowired
    private ContasPagarRepository contasPagarRepository;

    @GetMapping("/todos")
    private List<ContasPagar> listarTodosOsClientes()
    {
        return contasPagarRepository.findAll();
    }

}
