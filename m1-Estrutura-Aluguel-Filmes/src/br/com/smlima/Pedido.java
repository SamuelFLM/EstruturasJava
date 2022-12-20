package br.com.smlima;
import java.util.Random;
public class Pedido {
    private Filme filme;
    private Aluguel aluguel;
    private Usuario usuario;

    public Pedido(Filme filme, Aluguel aluguel, Usuario usuario) {
        this.filme = filme;
        this.aluguel = aluguel;
        this.usuario = usuario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Aluguel getAluguel() {
        return aluguel;
    }

    public void setAluguel(Aluguel aluguel) {
        this.aluguel = aluguel;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public long token(){
        Random random = new Random();
        long value1 = random.nextLong(10000000);
        return value1;
    }

    public void geraPedido(){
        System.out.println("FPL LTDA - FILMES PIRATAS LEGALMENTE");
        System.out.println("**************************");
        System.out.println("\nPedido Filme: " + getFilme().getNome());
        System.out.println("Conteudo: " + getFilme().getConteudo());
        System.out.println("Solicitacao: " + getUsuario().getNome());
        System.out.println("Endereco: " + getUsuario().getEndereco());
        System.out.println("CPF: " + getUsuario().getCpf());
        System.out.println("IDADE: " + getUsuario().getIdade());
        System.out.println("Codigo de Seguranca: " + token());
        System.out.println("\n**************************");
        System.out.println("INFORMACOES ADICIONAL");
        System.out.println("**************************");
        System.out.println("\nPAGANTE: " + getUsuario().getNome());
        System.out.println("RECEBIMENTO: " + "FPL LTDA - FILMES PIRATAS LEGALMENTE");
        System.out.println("METODO: " + "ALUGUEL");
        System.out.println("QUANTIDADE DE DIAS: " + getAluguel().getDias());
        System.out.println("VALOR DIA: " + getAluguel().getValor());
        System.out.println("VALOR TOTAL: " + (getAluguel().getValor() * getAluguel().getDias()));
    }
}
