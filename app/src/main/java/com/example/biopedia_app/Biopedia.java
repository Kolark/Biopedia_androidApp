package com.example.biopedia_app;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Biopedia#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Biopedia extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    ListView listView;

    public Biopedia() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Biopedia.
     */
    // TODO: Rename and change types and number of parameters
    public static Biopedia newInstance(String param1, String param2) {
        Biopedia fragment = new Biopedia();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
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
        View v =inflater.inflate(R.layout.fragment_biopedia, container, false);

        listView = v.findViewById(R.id.biopedia_listview);
        BiopediaAdapter biopediaAdapter = new BiopediaAdapter(v.getContext(),MainActivity.bioentidads);
        listView.setAdapter(biopediaAdapter);


        return v;
    }

    class BiopediaAdapter extends ArrayAdapter<Bioentidad>{
        //ArrayList<Bioentidad> bioentidades;
        String[] familiasString;
        String[] nombresComunesString;
        String[] nombresCientificoString;
        String[] descripcionesString;
        Context context;

        BiopediaAdapter(Context c, ArrayList<Bioentidad> bioentidades){
            super(c,R.layout.row_bioentidad,bioentidades);
            bioentidades = bioentidades;
            this.context = c;


            this.familiasString = new String[bioentidades.size()];
            this.nombresComunesString = new String[bioentidades.size()];
            this.nombresCientificoString = new String[bioentidades.size()];
            this.descripcionesString = new String[bioentidades.size()];

            if(bioentidades.get(0) != null){
                Log.e("Existe aca","l: " + this.familiasString.length);
            }
            else {
                Log.e("NO EXISTE aca","l: " + this.familiasString.length);
            }
            for (int i = 0; i < bioentidades.size(); i++) {
                familiasString[i] = bioentidades.get(i).familia;
                nombresComunesString[i] = bioentidades.get(i).nombre_Vernaculo;
                nombresCientificoString[i] = bioentidades.get(i).nombre_Cientifico;
                descripcionesString[i] = bioentidades.get(i).descripcion;
            }
            Log.e("llego aca","l: " + this.familiasString.length);
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row_bioentidad,parent,false);

            //Obtengo componentes del row
            TextView textComun = row.findViewById(R.id.txtnombrecomun);
            TextView textCientifico = row.findViewById(R.id.txtnombrecientifico);
            TextView textFamilia = row.findViewById(R.id.txtfamilia);
            TextView textDescripcion = row.findViewById(R.id.textdescripcion);

            //Modifico los componentes
            textComun.setText(nombresComunesString[position]);
            textCientifico.setText(nombresCientificoString[position]);
            textFamilia.setText(familiasString[position]);
            textDescripcion.setText(descripcionesString[position]);
            return row;
        }
    }
}