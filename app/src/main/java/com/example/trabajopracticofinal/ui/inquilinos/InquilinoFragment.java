package com.example.trabajopracticofinal.ui.inquilinos;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.trabajopracticofinal.R;
import com.example.trabajopracticofinal.ui.propiedades.PropiedadViewModel;
import com.google.android.material.textfield.TextInputEditText;

import modelo.Inquilino;

public class InquilinoFragment extends Fragment {

    private InquilinoViewModel vm;
    private  TextInputEditText etDni;
    private  TextInputEditText etApellido;
    private  TextInputEditText etNombre;
    private  TextInputEditText etDireccion;
    private  TextInputEditText etTelefono;
    private  TextInputEditText etEmail;
    private  TextInputEditText etNombreGarante;
    private  TextInputEditText etDniGarante;
    private  TextInputEditText etTelefonoGarante;

    public InquilinoFragment() {
    }

    public InquilinoFragment(int contentLayoutId, TextInputEditText etDni, TextInputEditText etApellido, TextInputEditText etNombre, TextInputEditText etDireccion, TextInputEditText etTelefono, TextInputEditText etEmail, TextInputEditText etNombreGarante, TextInputEditText etDniGarante, TextInputEditText etTelefonoGarante) {
        super(contentLayoutId);
        this.etDni = etDni;
        this.etApellido = etApellido;
        this.etNombre = etNombre;
        this.etDireccion = etDireccion;
        this.etTelefono = etTelefono;
        this.etEmail = etEmail;
        this.etNombreGarante = etNombreGarante;
        this.etDniGarante = etDniGarante;
        this.etTelefonoGarante = etTelefonoGarante;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_inquilino, container, false);
        inicializar(root, savedInstanceState);
        return root;
    }

    public void inicializar(View view, Bundle bundle)
    {
        etDni= view.findViewById(R.id.etDni2);
        etApellido= view.findViewById(R.id.etApellido2);
        etNombre= view.findViewById(R.id.etNombre);
        etDireccion =view.findViewById(R.id.etDireccion);
        etTelefono=view.findViewById(R.id.etTelefono);
        etEmail= view.findViewById(R.id.etEmail);
        etDniGarante=view.findViewById(R.id.etDniGarante);
        etNombreGarante= view.findViewById(R.id.etNombreGarante);
        etTelefonoGarante=view.findViewById(R.id.etTelefonoGarante);

        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getActivity().getApplication()).create(InquilinoViewModel.class);
        vm.getInquilino().observe(getViewLifecycleOwner(), new Observer<Inquilino>() {
            @Override
            public void onChanged(Inquilino inquilino) {
                etDni.setText(inquilino.getDni());
                etApellido.setText(inquilino.getApellido());
                etNombre.setText(inquilino.getNombre());
                etDireccion.setText(inquilino.getDireccion());
                etTelefono.setText(inquilino.getTelefono());
                etEmail.setText(inquilino.getEmail());
                etDniGarante.setText(inquilino.getDniGarante());
                etNombreGarante.setText(inquilino.getNombreGarante());
                etTelefonoGarante.setText(inquilino.getTelefonoGarante());
            }
        });

        vm.cargarInquilino(getArguments());
    }


}
