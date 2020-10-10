package com.example.trabajopracticofinal.ui.propiedades;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.PatternMatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.trabajopracticofinal.R;
import com.example.trabajopracticofinal.ui.perfil.PerfilViewModel;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputEditText;

import modelo.Propiedad;

public class PropiedadFragment extends Fragment {
    private  PropiedadViewModel vm;
    private  TextInputEditText etDireccion;
    private  TextInputEditText etAmbientes;
    private  TextInputEditText etTipo;
    private  TextInputEditText etUso;
    private  TextInputEditText etPrecio;
    private  ImageView imagen;

    public PropiedadFragment(TextInputEditText etDireccion, TextInputEditText etAmbientes, TextInputEditText etTipo, TextInputEditText etUso, TextInputEditText etPrecio,ImageView imagen) {
        this.etDireccion = etDireccion;
        this.etAmbientes = etAmbientes;
        this.etTipo = etTipo;
        this.etUso = etUso;
        this.etPrecio = etPrecio;
        this.imagen=imagen;
    }

    public PropiedadFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_propiedad, container, false);
        inicializar(root, savedInstanceState);
        return root;
    }

    private void inicializar(View view, Bundle bundle) {

        etDireccion=view.findViewById(R.id.etDomicilio);
        etAmbientes=view.findViewById(R.id.etAmbientes);
        etTipo=view.findViewById(R.id.etTipo);
        etUso=view.findViewById(R.id.etUso);
        etPrecio=view.findViewById(R.id.etPrecio);
        final ImageView imagen= (ImageView) view.findViewById(R.id.imagen);

        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getActivity().getApplication()).create(PropiedadViewModel.class);
        vm.getInmueble().observe(getViewLifecycleOwner(), new Observer<Propiedad>() {
            @Override
            public void onChanged(Propiedad propiedad) {
                etDireccion.setText(propiedad.getDireccion());
                etAmbientes.setText(String.valueOf(propiedad.getAmbientes()));
                etTipo.setText(propiedad.getTipo());
                etUso.setText(propiedad.getUso());
                etPrecio.setText(String.valueOf(propiedad.getPrecio()));
                imagen.setImageResource(propiedad.getImagen());
            }
        });

     vm.cargarInmueble(getArguments());
    }
}