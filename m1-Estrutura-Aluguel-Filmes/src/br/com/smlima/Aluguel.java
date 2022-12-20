package br.com.smlima;

public class Aluguel {
    private Float valor;
    private Integer  dias;

    public Aluguel(Float valor, Integer dias) {
        this.valor = valor;
        this.dias = dias;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }
}
