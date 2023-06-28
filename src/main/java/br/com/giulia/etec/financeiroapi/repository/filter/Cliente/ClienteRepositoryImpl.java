package br.com.giulia.etec.financeiroapi.repository.filter.Cliente;

import br.com.giulia.etec.financeiroapi.model.Cliente;
import br.com.giulia.etec.financeiroapi.repository.filter.ClienteFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepositoryQuery {

    @Autowired
    private EntityManager entityManager;

    @Override
    public Page<Cliente> filtrarCliente(ClienteFilter clienteFilter, Pageable pageable) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Cliente> criteriaQuery = criteriaBuilder.createQuery(Cliente.class);
        Root<Cliente> root = criteriaQuery.from(Cliente.class);

        Predicate[] predicates = criarFiltros(root, criteriaBuilder, clienteFilter);
        criteriaQuery.where(predicates);
        criteriaQuery.orderBy(criteriaBuilder.asc(root.get("nomecliente")));

        TypedQuery<Cliente> typedQuery = entityManager.createQuery(criteriaQuery);
        adicionarRestricoesDePaginacao(typedQuery, pageable);

        return null;

    }

    private void adicionarRestricoesDePaginacao(TypedQuery<Cliente> typedQuery, Pageable pageable) {
        int paginaAtual = pageable.getPageNumber();
        int totalRegistroPorPagina = pageable.getPageSize();
        int registrosNaPagina = paginaAtual * totalRegistroPorPagina;
    }

    private Predicate[] criarFiltros(Root<Cliente> root, CriteriaBuilder criteriaBuilder, ClienteFilter clienteFilter) {
        List<Predicate> predicates = new ArrayList<>();

        if (!StringUtils.isEmpty(clienteFilter.getNomecliente()))
        {
            predicates.add(criteriaBuilder.like(criteriaBuilder.lower(root.get("nomecliente")),
                    "%" + clienteFilter.getNomecliente().toLowerCase() + "%"
            ));
        }

        return predicates.toArray(new Predicate[predicates.size()]);
    }

}
