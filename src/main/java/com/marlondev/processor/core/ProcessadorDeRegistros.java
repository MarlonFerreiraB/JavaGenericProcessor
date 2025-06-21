package main.java.com.marlondev.processor.core;

import main.java.com.marlondev.processor.model.RegistroBase;

import java.util.ArrayList;
import java.util.List;

public class ProcessadorDeRegistros<T extends RegistroBase> {
    private List<T> registroList;

    public ProcessadorDeRegistros(){
        registroList = new ArrayList<>();
    }

    public boolean addRegistro(T registro){
        if(registroList == null){
            System.out.println("Lista nula");
            return false;
        }

        registroList.add(registro);
        return true;
    }

    public List<T> buscarId(String id){
        List<T> newRegistroList = new ArrayList<>();

        if(registroList == null){
            System.out.println("Lista nula");
            return null;
        }

        for(T o: registroList){
            if(o.getID().equals(id)){
                newRegistroList.add(o);
            }
        }
        return newRegistroList;
    }

    public List<T> FiltraPorDescrition(String descricion){
        List<T> newRegistroList = new ArrayList<>();

        if(registroList == null){
            System.out.println("Lista nula");
            return null;
        }

        for(T o: registroList){
            if(o.getDescricao().contains(descricion)){
                newRegistroList.add(o);
            }
        }
        return newRegistroList;
    }

    public List<T> getTodosRegistros(){
        List<T> newRegistroList = new ArrayList<>();
        newRegistroList.addAll(registroList);
        return newRegistroList;
    }

    public static <R extends RegistroBase> List<R> filtrarPorTipo(List<R> lista, Class<? extends R> tipo){
       List<R> listaFiltrada = new ArrayList<>();
        for(R o: lista){
            if(tipo.isInstance(o)){
                listaFiltrada.add(o);
            }
        }
        return listaFiltrada;
    }

}
