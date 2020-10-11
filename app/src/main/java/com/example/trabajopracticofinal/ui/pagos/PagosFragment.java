package com.example.trabajopracticofinal.ui.pagos;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

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

import com.example.trabajopracticofinal.modelo.Contrato;
import com.example.trabajopracticofinal.modelo.Pago;

public class PagosFragment extends Fragment {

    private ListView lvContratos;
    private ListView lvPagos;
    private PagosViewModel vm;
    PagoAdapter adapter;
    PagosAdapter adapterPagos;
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

        lvContratos = root.findViewById(R.id.lvContratos2);
        lvPagos=root.findViewById(R.id.lvPagos);
        vm= ViewModelProvider.AndroidViewModelFactory.getInstance(getActivity().getApplication()).create(PagosViewModel.class);
        vm.getContratos().observe(getViewLifecycleOwner(), new Observer<ArrayList<Contrato>>() {
                   @Override
                   public void onChanged(ArrayList<Contrato> contratoes) {
                       adapter= new PagoAdapter(context,R.layout.contrato_fragment,contratoes,getLayoutInflater());
                       lvContratos.setAdapter(adapter);

                       lvContratos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                           @Override
                           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                           }
                       });
                   }
               });
               vm.cargarContratos();

        vm.getPagos().observe(getViewLifecycleOwner(), new Observer<ArrayList<Pago>>() {
            @Override
            public void onChanged(ArrayList<Pago> pagos) {
                adapterPagos= new PagosAdapter(context,R.layout.item_pago,pagos,getLayoutInflater());
                lvPagos.setAdapter(adapterPagos);
                lvPagos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Bundle bundle = new Bundle();

                        Pago pago= new Pago();
                        bundle.putInt("nroPago",pago.getNroPago());
                        bundle.putString("fechaPago",pago.getFechaPago());
                        bundle.putInt("importe", (int) pago.getImporte());
                        Navigation.findNavController(getActivity(),R.id.nav_host_fragment).navigate(R.id.pagoFragment,bundle);
                    }
                });

            }
        });
        vm.cargarPagos();



    }


}