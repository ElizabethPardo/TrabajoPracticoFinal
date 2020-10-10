package com.example.trabajopracticofinal.ui.contratos;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.trabajopracticofinal.R;
import com.google.android.material.textfield.TextInputEditText;

import modelo.Contrato;

public class ContratoFragment extends Fragment {
    private ContratoViewModel vm;
    private TextInputEditText etFechaIngreso;
    private TextInputEditText etFechaSalida;
    private TextInputEditText etImporte;

    public ContratoFragment() {

    }

    public ContratoFragment(TextInputEditText etFechaIngreso, TextInputEditText etFechaSalida, TextInputEditText etImporte) {
        this.etFechaIngreso = etFechaIngreso;
        this.etFechaSalida = etFechaSalida;
        this.etImporte = etImporte;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.contrato_fragment, container, false);
        inicializar(root, savedInstanceState);
        return root;
    }

    private void inicializar(View root,Bundle bundle) {

        etFechaIngreso=root.findViewById(R.id.etdFechaIngreso);
        etFechaSalida=root.findViewById(R.id.etdFechaSalida);
        etImporte=root.findViewById(R.id.etdImporte);

        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getActivity().getApplication()).create(ContratoViewModel.class);
        vm.getContrato().observe(getViewLifecycleOwner(), new Observer<Contrato>() {
            @Override
            public void onChanged(Contrato contrato) {
                etFechaIngreso.setText(contrato.getFechaIngreso());
                etFechaSalida.setText(contrato.getFechaSalida());
                etImporte.setText((int) contrato.getImporte());

            }
        });
        vm.cargarContrato(getArguments());

    }

}