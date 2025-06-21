package main.java.com.marlondev.processor.model;

import java.util.Objects;

public abstract class RegistroBase implements Registravel{
    protected final String id;
    protected String descricao;

    public RegistroBase(String id, String descricao){
        this.id = id;
        this.descricao= descricao;
    }

    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RegistroBase{");
        sb.append("id='").append(id).append('\'');
        sb.append(", descricao='").append(descricao).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        RegistroBase that = (RegistroBase) o;
        return Objects.equals(id, that.id) && Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descricao);
    }
}
