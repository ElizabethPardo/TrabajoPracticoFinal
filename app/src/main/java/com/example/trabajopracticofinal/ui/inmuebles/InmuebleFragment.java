package com.example.trabajopracticofinal.ui.inmuebles;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.example.trabajopracticofinal.R;
import com.google.android.material.textfield.TextInputEditText;

import com.example.trabajopracticofinal.modelo.Inmueble;

public class InmuebleFragment extends Fragment {
    private InmuebleViewModel vm;
    private  TextInputEditText etDireccion;
    private  TextInputEditText etAmbientes;
    private  TextInputEditText etTipo;
    private  TextInputEditText etUso;
    private  TextInputEditText etPrecio;
    private  CheckBox cbestado;
    private  ImageView imagen;

    public InmuebleFragment(TextInputEditText etDireccion, TextInputEditText etAmbientes, TextInputEditText etTipo, TextInputEditText etUso, TextInputEditText etPrecio, CheckBox cbEstado, ImageView imagen) {
        this.etDireccion = etDireccion;
        this.etAmbientes = etAmbientes;
        this.etTipo = etTipo;
        this.etUso = etUso;
        this.etPrecio = etPrecio;
        this.cbestado=cbEstado;
        this.imagen=imagen;
    }

    public InmuebleFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_inmueble, container, false);
        inicializar(root, savedInstanceState);
        return root;
    }

    private void inicializar(View view, Bundle bundle) {

        etDireccion=view.findViewById(R.id.etDomicilio);
        etAmbientes=view.findViewById(R.id.etAmbientes);
        etTipo=view.findViewById(R.id.etTipo);
        etUso=view.findViewById(R.id.etUso);
        etPrecio=view.findViewById(R.id.etPrecio);
        cbestado=view.findViewById(R.id.cbEstado);
        final ImageView imagen= (ImageView) view.findViewById(R.id.imagen);

        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getActivity().getApplication()).create(InmuebleViewModel.class);
        vm.getInmueble().observe(getViewLifecycleOwner(), new Observer<Inmueble>() {
            @Override
            public void onChanged(Inmueble inmueble) {
                etDireccion.setText(inmueble.getDireccion());
                etAmbientes.setText(String.valueOf(inmueble.getAmbientes()));
                etTipo.setText(inmueble.getTipo());
                etUso.setText(inmueble.getUso());
                etPrecio.setText(String.valueOf(inmueble.getPrecio()));
                cbestado.setChecked(inmueble.getEstado());
                imagen.setImageResource(inmueble.getImagen());
            }
        });

     vm.cargarInmueble(getArguments());
    }
}