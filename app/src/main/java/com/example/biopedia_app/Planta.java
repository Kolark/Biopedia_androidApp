package com.example.biopedia_app;

public class Planta extends Bioentidad  {
    String tipo_Especie;
    float tamaño;
    float altura;
    public Planta(String nombre_Vernaculo,String nombre_Cientifico,String foto,String descripcion,String familia,String colaboradores,
                  String tipo_Especie,float tamaño,float altura){
        super(nombre_Vernaculo,nombre_Cientifico,foto,descripcion,familia,colaboradores);
    }
}
