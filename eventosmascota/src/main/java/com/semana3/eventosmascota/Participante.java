package com.semana3.eventosmascota;

public class Participante {
    private int id;
    private String nombre;
    private int edad;
    private String tipoAnimal;
    private String nombreDueno;  
    
    public Participante (int id, String nombre, int edad, String tipoAnimal, String nombreDueno){
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.tipoAnimal = tipoAnimal;
        this.nombreDueno = nombreDueno;

    }


    //Getters

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public String getTipoAnimal(){
        return tipoAnimal;
    }

    public String getNombreDueno(){
        return nombreDueno;
    }
}
