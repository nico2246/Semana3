package com.semana3.sveterinarios;

public class Servicio {
    private int id;
    private String nombre;
    private String descripcion;
    private int valorServicio;

    public Servicio (int id, String nombre, String descripcion, int valorServicio){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorServicio = valorServicio;

    }

    //Getters

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public int getValorServicio(){
        return valorServicio;
    }
}
