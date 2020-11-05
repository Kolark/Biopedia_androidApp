package com.example.biopedia_app;

import android.util.Log;

import java.util.ArrayList;

public class BioentidadCreator {
    static String path1 ="C:/Users/Felipe Loaiza/Documents/GitHub/Biopedia_androidApp/app/src/test/java/com/example/biopedia_app/Especies_en_viveros_corporativos.csv";
    static String path2 ="C:/Users/Felipe Loaiza/Documents/GitHub/Biopedia_androidApp/app/src/test/java/com/example/biopedia_app/Fauna_silvestre.csv";
    static String path3 ="C:/Users/Felipe Loaiza/Documents/GitHub/Biopedia_androidApp/app/src/test/java/com/example/biopedia_app/Informacion_de_la_flora_y_fauna_en_el_municipio_de_Marinilla.csv";

    public BioentidadCreator(){

    }


    public static Animal[] obtenerAnimales1(){

        int cantidad = 10;

        ArrayList<String[]> lista1 = CSVREADER.Read(R.raw.fauna);
        Animal[] animales = new Animal[cantidad];

        /*for (int i = 0; i < 100; i++) {
            Log.e(": " + lista1.get(i)[5],"i: " + i + ": length: " + lista1.get(i).length);
        }*/
        for (int i=1;i<cantidad+1;i++){
            String[] linea = lista1.get(i);
            animales[i-1] = new Animal
                    (linea[5],linea[3],"---","Descripcion",linea[2]
                            ,"---",123456,123456,
                            linea[0],"genero");
        }
        return animales;
    }
    public static Animal[] obtenerAnimales2(){
        ArrayList<String[]> lista1 = CSVREADER.Read(R.raw.marinilla);
        ArrayList<Animal> animales = new ArrayList<Animal>();
        for (int i=1;i<lista1.size();i++){
            String[] linea = lista1.get(i);
            Log.e("fffauna: " + linea[3],"end_");
            if(linea[3] == "fauna"){
                Animal animal = new Animal(linea[2],linea[0],"---","---",linea[1],"---",123,123,linea[3],"---");
                animales.add(animal);

            }

        }

        Animal[] arrToreturn = new Animal[animales.size()];
        for (int i = 0; i <animales.size() ; i++) {
            arrToreturn[i] = animales.get(i);
        }


        return arrToreturn;
    }

    public static Planta[] obtenerPlantas1(){
        int cantidad = 10;
        ArrayList<String[]> lista1 = CSVREADER.Read(R.raw.especies);
        Planta[] plantas = new Planta[cantidad];
        for (int i=1;i<cantidad+1;i++){
            String[] linea = lista1.get(i);
            plantas[i-1] = new Planta(linea[0],linea[1],"---","---",linea[2],"---",linea[2],25f,25f);
        }
        return plantas;
    }


    public static Planta[] obtenerPlantas2(){
        ArrayList<String[]> lista1 = CSVREADER.Read(R.raw.marinilla);
        ArrayList<Planta> plantas = new ArrayList<Planta>();

        for (int i=1;i<lista1.size();i++){
            String[] linea = lista1.get(i);
            if(linea[3] == "flora"){
                Planta planta = new Planta(linea[2],linea[0],"---","---",linea[1],"---",linea[3],123,123);
                plantas.add(planta);
            }

        }

        Planta[] arrToreturn = new Planta[plantas.size()];
        for (int i = 0; i <plantas.size() ; i++) {
            arrToreturn[i] = plantas.get(i);
        }


        return arrToreturn;
    }

}
