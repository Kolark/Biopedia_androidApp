package com.example.biopedia_app;

public class Animal extends Bioentidad {
    int masa_promedio;
    int longevidad;
    String tipo;
    String genero;
    public Animal(String nombre_Vernaculo,String nombre_Cientifico,String foto,String descripcion,String familia,String colaboradores,
                  int masa_promedio,int longevidad,String tipo,String genero){
    super(nombre_Vernaculo,nombre_Cientifico,foto,descripcion,familia,colaboradores);
    this.masa_promedio = masa_promedio;
    this.longevidad = longevidad;
    this.tipo = tipo;
    this.genero = genero;

    }
}
