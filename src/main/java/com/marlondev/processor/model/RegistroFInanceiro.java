package main.java.com.marlondev.processor.model;

public class RegistroFInanceiro extends RegistroBase {
    private double value;
    private String tipoTansacao;


    public RegistroFInanceiro(String id, String descricao, double value, String tipoTransacao){
        super(id, descricao);
        this.value = value;
        this.tipoTansacao =tipoTransacao;
    }

    public double getValue() {
        return value;
    }

    public String gettipoTansacao() {
        return tipoTansacao;
    }
}
