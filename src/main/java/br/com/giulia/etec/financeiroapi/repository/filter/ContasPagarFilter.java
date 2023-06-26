package br.com.giulia.etec.financeiroapi.repository.filter;

import java.math.BigDecimal;
import java.util.Date;

public class ContasPagarFilter {

    private Date data;

    private BigDecimal valor;


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

}
