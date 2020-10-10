package com.example.trabajopracticofinal.ui.pagos;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.trabajopracticofinal.R;
import com.example.trabajopracticofinal.ui.contratos.ContratosViewModel;

import modelo.Contrato;
import modelo.Pago;

public class PagosFragment extends Fragment {

    private ListView lvPagos;
    private PagosViewModel vm;
    ArrayAdapter<Pago> adapter;
    Context context;

    public static PagosFragment newInstance() {
        return new PagosFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
      View root= inflater.inflate(R.layout.pagos_fragment, container, false);
        context= root.getContext();
        inicializar(root);
      return root;
      
    }

    private void inicializar(View root) {

        lvPagos = root.findViewById(R.id.lvPagos);
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getActivity().getApplication()).create(PagosViewModel.class);

    }


}