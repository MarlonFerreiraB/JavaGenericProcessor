package main.java.com.marlondev.processor.model;

public class RegistroUsuario extends  RegistroBase{
    private String nomeUser;
    private String email;

    public RegistroUsuario(String id, String descricao, String nomeUser, String email){
        super(id, descricao);
        this.nomeUser = nomeUser;
        this.email = email;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public String getEmail() {
        return email;
    }
}
