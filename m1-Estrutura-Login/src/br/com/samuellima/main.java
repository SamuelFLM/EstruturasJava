package br.com.samuellima;

/**
 * @author Samuel F Lima
 */
public class main {
    public static void main(String[] args){
        System.out.println("INICIANDO");

        Login login = dadosCadastrais();
        login.validaInformacaoLogin();
    }


    public static Login dadosCadastrais(){

        Cliente cliente = cadastrarCliente("Pessoa 1", 20, 1123334455,"Rua amaral peixoto", 999887333);
        Registro registro = registroClienteSistema("pessoa@gmail.com","test",123);
        Login login = new Login(cliente, registro);
        return login;
    }

    public static Cliente cadastrarCliente(String nome, int idade, long cpf, String endereco, long telefone ){
        return new Cliente(nome, idade, cpf, endereco, telefone);
    }
    public static Registro registroClienteSistema(String email, String user, int password){
        return new Registro(email, user, password);
    }
}
