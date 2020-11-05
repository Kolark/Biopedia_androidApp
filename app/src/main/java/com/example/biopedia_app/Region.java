package com.example.biopedia_app;

public class Region {
    String latitud;
    String longitud;
    String clima;
    String area;
    int totalMeta;
    int puntajeActual;

    Bioentidad[] bioentidades;

    public Region(String latitud,String longitud,String clima,String area,int totalMeta,int puntajeActual){
    this.latitud = latitud;
    this.longitud = longitud;
    this.clima = clima;
    this.area = area;
    this.totalMeta = totalMeta;
    this.puntajeActual = puntajeActual;
    }
}
