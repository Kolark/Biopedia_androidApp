package com.example.biopedia_app;

public class Sector_MedioAmbiente extends Usuario{
    String profesion;
    public Sector_MedioAmbiente(String nombre,String celular,String email,String profesion){
        super(nombre,celular,email);
        this.profesion = profesion;
    }
}
