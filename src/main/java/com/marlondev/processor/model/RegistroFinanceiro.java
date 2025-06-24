package main.java.com.marlondev.processor.model;

public class RegistroFinanceiro extends RegistroBase {
    private double value;
    private String tipoTransacao;


    public RegistroFinanceiro(String id, String descricao, double value, String tipoTransacao){
        super(id, descricao);
        this.value = value;
        this.tipoTransacao =tipoTransacao;
    }

    public double getValue() {
        return value;
    }

    public String gettipoTransacao() {
        return tipoTransacao;
    }
}
