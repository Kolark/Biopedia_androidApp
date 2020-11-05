package com.example.biopedia_app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Perfil#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Perfil extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ViewGroup contenedor;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    ListView listView;
    String[] ejemplos = {"hola","como","estamos"};
    public Perfil() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Perfil.
     */
    // TODO: Rename and change types and number of parameters
    public static Perfil newInstance(String param1, String param2) {
        Perfil fragment = new Perfil();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        Log.e(" se creo la CLASE","--");
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        Log.e("tamaño: " + MainActivity.bioentidads.size(),"hahaha");
        Log.e("se creo","esta vuelta");
        View v=inflater.inflate(R.layout.fragment_perfil, container, false);
        //Obtenemos componentes
        TextView editText = v.findViewById(R.id.txtprueba);
        //El usuario
        TextView textNombre = v.findViewById(R.id.txtNombre);
        TextView textEmail = v.findViewById(R.id.txtEmail);
        TextView textCelular = v.findViewById(R.id.txtCelular);



        //Les cambiamos su contenido
        editText.setText("Funciono");
        textNombre.setText(MainActivity.persona.nombre);
        textEmail.setText(MainActivity.persona.email);
        textCelular.setText(MainActivity.persona.celular);

        listView = v.findViewById(R.id.perfil_list);
        Myadapter myadapter = new Myadapter(v.getContext(),MainActivity.persona.encuentros);
        listView.setAdapter(myadapter);



        return v;
    }


    class Myadapter extends ArrayAdapter<Encuentro> {
        ArrayList<Encuentro> encuentros;
        Context context;

        Myadapter(Context c, ArrayList<Encuentro> _encuentros){
            super(c,R.layout.row_encuentro,_encuentros);

            this.context =c;
            this.encuentros = _encuentros;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row_encuentro,parent,false);

            //Obtengo componentes

            TextView txtbioe = row.findViewById(R.id.rowtxtbioe);
            TextView txtdesc = row.findViewById(R.id.rowtxtdesc);
            TextView txtfecha = row.findViewById(R.id.rowtxtfecha);

            //Modifico esos componentes
            txtbioe.setText(encuentros.get(position).bioentidad);
            txtdesc.setText(encuentros.get(position).descripcion);
            txtfecha.setText(encuentros.get(position).fecha.toString());

            return row;
        }
    }
}