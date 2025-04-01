package com.semana3.eventosmascota;

public class Evento {
    private int id;
    private String tipo;
    private String lugar;
    private String fecha;
    
    public Evento (int id, String tipo, String lugar, String fecha){
        this.id = id;
        this.tipo = tipo;
        this.lugar = lugar;
        this.fecha = fecha;
    }

    //Getters

    public int getId(){
        return id;
    }

    public String getTipo(){
        return tipo;
    }

    public String getLugar(){
        return lugar;
    }

    public String getFecha(){
    return fecha;
    }
}


