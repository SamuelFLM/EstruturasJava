package br.com.samuellima;
/**
 * @author Samuel F Lima
 */
public class Registro {

    private String email;
    private String user;
    private int password;

    public Registro(String email, String user, int password) {
        this.email = email;
        this.user = user;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

}
