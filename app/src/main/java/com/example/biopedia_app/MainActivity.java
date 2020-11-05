package com.example.biopedia_app;

import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Bioentidad> bioentidads = new ArrayList<Bioentidad>();
    ArrayList<Animal> animals = new ArrayList<Animal>();
    ArrayList<Planta> plantas = new ArrayList<Planta>();
    public static Casual persona;

    ListView listView = null;

    public static MainActivity instance;

    void addAnimals(Animal[] arrAnimals){
        for (int i=0;i<arrAnimals.length;i++){
        animals.add(arrAnimals[i]);
        bioentidads.add(arrAnimals[i]);
        }
    }
    void addPlants(Planta[] arrPlants){
        for (int i=0;i<arrPlants.length;i++){
        plantas.add(arrPlants[i]);
        bioentidads.add(arrPlants[i]);
        }
    }

    InputStream getFile(int resource){
        InputStream is = getResources().openRawResource(resource);
        return is;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        instance=this;

        persona = new Casual("Santiago","+57 312 231 3123","santiago@biopedia.com.co","-","-");

        Animal[] listaAnimales1 = BioentidadCreator.obtenerAnimales1();

        Planta[] listaPlantas1 = BioentidadCreator.obtenerPlantas1();

        addAnimals(listaAnimales1);
        addPlants(listaPlantas1);

        //Animal[] listaAnimales2 = BioentidadCreator.obtenerAnimales2();
        //Log.e("l: "+listaAnimales2.length,"end_");
        //Planta[] listaPlantas2 = BioentidadCreator.obtenerPlantas2();


        //addAnimals(listaAnimales2);

        //addPlants(listaPlantas2);
        
        

        for (int i = 0; i < bioentidads.size(); i++) {
            Log.e("ejemplo: " + bioentidads.get(i).nombre_Vernaculo,"end");
        }

        
        setContentView(R.layout.activity_main);
        BottomNavigationView view = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this,R.id.viewfrag);

        NavigationUI.setupWithNavController(view,navController);
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    public void onClick(View v) {
        Log.e("JAJAJAAJAJAJAJA","hHHEHEHE");
        //Obtengo componentes
        String descripcion = agregarEncuentros.instance.txtDescripcion.getText().toString();
        String bioentidad = agregarEncuentros.instance.txtBioentidad.getText().toString();

        //
        Encuentro encuentro = new Encuentro(descripcion, LocalDate.now(),"foto",bioentidad);
        agregarEncuentros.instance.txtDescripcion.setText("");
        agregarEncuentros.instance.txtBioentidad.setText("");
        persona.AgregarEncuentro(encuentro);

        /*Log.e("tamaño: "+persona.encuentros.size(),"__");
        for (int i = 0; i < persona.encuentros.size(); i++) {
            Log.e("i encuentros: "+persona.encuentros.get(i).bioentidad,"__");
        }
*/

    }
}