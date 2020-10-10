package com.example.trabajopracticofinal.ui.contratos;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.trabajopracticofinal.R;

import java.util.ArrayList;

import modelo.Contrato;

public class ContratosFragment extends Fragment {

    private ListView lvContratos;
    private ContratosViewModel vm;
    ArrayAdapter<Contrato> adapter;
    Context context;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.contratos_fragment, container, false);
        context= root.getContext();
        inicializar(root);
        return root;
    }

    private void inicializar(View root) {

        lvContratos = root.findViewById(R.id.lvContratos);
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getActivity().getApplication()).create(ContratosViewModel.class);
        vm.getContratos().observe(getViewLifecycleOwner(), new Observer<ArrayList<Contrato>>() {
            @Override
            public void onChanged(ArrayList<Contrato> contratoes) {
                adapter = new ContratoAdapter(context, R.layout.contrato_fragment, contratoes, getLayoutInflater());
                lvContratos.setAdapter(adapter);
                lvContratos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Bundle bundle = new Bundle();
                        Contrato contrato= adapter.getItem(position);
                        bundle.putSerializable("contrato",contrato);


                        Navigation.findNavController(getActivity(),R.id.nav_host_fragment).navigate(R.id.nav_contratos,bundle);
                    }
                });


            }
        });
    }


}