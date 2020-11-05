package com.example.biopedia_app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link agregarEncuentros#newInstance} factory method to
 * create an instance of this fragment.
 */
public class agregarEncuentros extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    public static agregarEncuentros instance;

    public TextView txtDescripcion;
    public TextView txtBioentidad;


    public agregarEncuentros() {
        instance = this;
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment agregarEncuentros.
     */
    // TODO: Rename and change types and number of parameters
    public static agregarEncuentros newInstance(String param1, String param2) {
        agregarEncuentros fragment = new agregarEncuentros();
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
        View v = inflater.inflate(R.layout.fragment_agregar_encuentros, container, false);

        //Obtengo componentes
        txtDescripcion = v.findViewById(R.id.txthdescripcion);
        txtBioentidad = v.findViewById(R.id.txthbioidentidad);

        Log.e("cambiooo","Cambioo");
        return v;
    }
}