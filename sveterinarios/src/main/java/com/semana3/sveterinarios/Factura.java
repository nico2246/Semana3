package com.semana3.sveterinarios;

public class Factura {
    private int id;
    private String nombreMascota;
    private String nombreMedico;
    private String detalleServicio;
    private int valorTotalServicio;

    public Factura ( int id, String nombreMascota, String nombreMedico, String detalleServicio, int valorTotalServicio){
        this.id = id;
        this.nombreMascota = nombreMascota;
        this.nombreMedico = nombreMedico;
        this.detalleServicio = detalleServicio;
        this.valorTotalServicio = valorTotalServicio;
    }

    //Getters

    public int getId(){
        return id;
    }

    public String getNombreMascota(){
        return nombreMascota;
    }

    public String getNombreMedico(){
        return nombreMedico;
    }

    public String detalleServicio(){
        return detalleServicio;
    }

    public int getValorTotalServicio(){
        return valorTotalServicio;
    }
    
}













