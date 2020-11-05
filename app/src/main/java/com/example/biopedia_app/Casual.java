package com.example.biopedia_app;

import java.util.ArrayList;

public class Casual extends Usuario {
    String latitud;
    String longitud;
    ArrayList<Encuentro> encuentros = new ArrayList<Encuentro>();
    public Casual(String nombre,String celular,String email,String latitud,String longitud){
        super(nombre,celular,email);
        this.latitud = latitud;
        this.longitud = longitud;
    }
    public void AgregarEncuentro(Encuentro encuentro){
        encuentros.add(encuentro);
    }
}
