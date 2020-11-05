package com.example.biopedia_app;

public abstract class Bioentidad {
    public String nombre_Vernaculo;
    public String nombre_Cientifico;
    public String foto;
    public String descripcion;
    public String familia;
    public String colaboradores;

    public Region[] regiones;

    public Bioentidad(String nombre_Vernaculo,String nombre_Cientifico,String foto,String descripcion,String familia,String colaboradores){
    this.nombre_Vernaculo = nombre_Vernaculo;
    this.nombre_Cientifico = nombre_Cientifico;
    this.foto = foto;
    this.descripcion = descripcion;
    this.familia = familia;
    this.colaboradores = colaboradores;
    }
}
