package main.java.com.marlondev.processor.model;

public class RegistroLog extends RegistroBase{
    private String nivel;
    private String email;

    public RegistroLog(String id, String descricao, String nivel, String email){
        super(id, descricao);
        this.nivel = nivel;
        this.email = email;
    }

    public String getNivel() {
        return nivel;
    }

    public String getEmail() {
        return email;
    }
}
