package com.example.biopedia_app;

public abstract class Usuario {
    String nombre;
    String celular;
    String email;

    public Usuario(String nombre,String celular,String email){
        this.nombre = nombre;
        this.celular = celular;
        this.email = email;
    }
}
