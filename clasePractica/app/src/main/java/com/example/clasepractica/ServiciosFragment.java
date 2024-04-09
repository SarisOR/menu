package com.example.clasepractica;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ServiciosFragment extends Fragment {
    EditText edtNombre, edtNumero;
    Button btnEnviar;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_servicios, container, false);
        edtNombre = view.findViewById(R.id.edtNombre);
        edtNumero = view.findViewById(R.id.edtNumero);
        btnEnviar = view.findViewById(R.id.btnEnviar);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = edtNombre.getText().toString();
                String numero = edtNumero.getText().toString();
                if (nombre.equals("") || numero.equals(""))
                    Toast.makeText(getActivity(), "Por favor llenar los campos ", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getActivity(), "Enviado ", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}