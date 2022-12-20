package br.com.smlima;

public class Locadora {

    public static void main(String[] args){
        Pedido pedido = pedidoCliente();
        pedido.geraPedido();
    }

    public static Pedido pedidoCliente(){
        Usuario usuario = cadastraUsuario("Ana clara", "Rua teste 140, Nosso Teste", 020451, 20);
        Filme filme = informacaoFilme("Guerra do amanha",22, "Apocalipse");
        Aluguel aluguel = aluguelFilme(20.50f, 5);
        Pedido pedido = new Pedido(filme,aluguel, usuario);
        return pedido;
    }

    public static Usuario cadastraUsuario(String nome, String endereco, Integer cpf, Integer idade){
        return new Usuario(nome, endereco, cpf, idade);
    }
    public static Filme informacaoFilme(String nome, Integer codigo, String conteudo){
        return new Filme(nome, codigo, conteudo);
    }
    public static Aluguel aluguelFilme(Float valor, Integer dias){
        return new Aluguel(valor, dias);
    }
}
