package com.company;

import java.util.HashMap;

public class Proyecto {
    String tema;
    HashMap<String, Tarea> lista = new HashMap<>();

    public Proyecto(){

    }

    public String getTema() {
        return tema;
    }

    public void ejecutar(){

    }
    public void agregarTarea(){

    }
    public void aberirTareas(){

    }
    public Tarea buscarTareas(){
        return null;
    }
    public void eliminarTarea(){

    }
    public void pausar(){

    }
    public void detener(){

    }

    @Override
    public String toString() {
        return "Proyecto{" +
                "tema='" + tema + '\'' +
                ", lista=" + lista +
                '}';
    }
}
