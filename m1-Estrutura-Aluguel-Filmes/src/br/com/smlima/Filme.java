package br.com.smlima;

public class Filme {
    private String nome;
    private Integer codigo;
    private String conteudo;

    public Filme(String nome, Integer codigo, String conteudo) {
        this.nome = nome;
        this.codigo = codigo;
        this.conteudo = conteudo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}
