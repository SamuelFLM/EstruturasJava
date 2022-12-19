package br.com.samuellima;
/**
 * @author Samuel F Lima
 */
public class Login {

    private Registro registro;
    private Cliente cliente;

    public Login(Cliente cliente,Registro registro) {
        this.registro = registro;
        this.cliente = cliente;
    }

    public Registro getRegistro() {
        return registro;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void validaInformacaoLogin(){
        if (getRegistro().getUser() == "test" && getRegistro().getPassword() == 123) {
            System.out.println("Bem Vindo ao Sistema");
            informacaoCliente();
        }
        else{
            System.out.println("Login ou senha Invalidos");
        }
    }
    public void informacaoCliente(){
        System.out.println("******************************");
        System.out.println("Nome: " + getCliente().getNome());
        System.out.println("Idade: " + getCliente().getIdade());
        System.out.println("CPF: " + getCliente().getCpf());
        System.out.println("Endereco: " + getCliente().getEndereco());
        System.out.println("Telefone: " + getCliente().getTelefone());
        System.out.println("******************************");
    }

}
