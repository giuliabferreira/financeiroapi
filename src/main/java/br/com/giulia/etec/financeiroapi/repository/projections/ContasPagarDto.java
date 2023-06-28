package br.com.giulia.etec.financeiroapi.repository.projections;

import java.math.BigDecimal;
import java.util.Date;

public class ContasPagarDto {

    private Integer id;

    private Date data;

    private BigDecimal valor;

    private String nomecliente;

    public ContasPagarDto(int id, Date data, String nomecliente, BigDecimal valor) {

        this.id = id;
        this.data = data;
        this.nomecliente = nomecliente;
        this.valor = valor;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

}
