package com.example.biopedia_app;


import java.time.LocalDate;

public class Encuentro {
    String descripcion;
    LocalDate fecha;
    String foto;
    String latitud;
    String longitud;

    String bioentidad;
    Region region;

    public Encuentro(String descripcion,LocalDate fecha,String foto,String bioentidad){
    this.descripcion = descripcion;
    this.fecha = fecha;
    this.foto = foto;
    this.bioentidad = bioentidad;
    this.latitud = "latitud";
    this.longitud = "longitud";
    }

}
