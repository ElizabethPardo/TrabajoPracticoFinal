package com.example.trabajopracticofinal.ui.contratos;

import android.app.Application;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.trabajopracticofinal.modelo.Contrato;
import com.example.trabajopracticofinal.modelo.Inquilino;

import java.util.ArrayList;




public class ContratosViewModel extends AndroidViewModel {
    private Context context;
    private ArrayAdapter<Contrato> adapter;
    private MutableLiveData<ArrayList<Contrato>> contratos;

    public ContratosViewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();
    }

    public LiveData<ArrayList<Contrato>> getContratos() {

        if(contratos == null)
        {
            contratos= new MutableLiveData<>();
        }
        return contratos;
    }

    public void cargarContratos()
    {
        ArrayList<Contrato> contratos = new ArrayList<>();
        contratos.add(new Contrato("22/10/2018","22/10/2019",new Inquilino("Pedernera 1234")));
        contratos.add(new Contrato("01/05/2019","01/05/2020",new Inquilino("Balcarse 123")));
        contratos.add(new Contrato("15/03/2020","15/03/2021",new Inquilino("Belgrano 899")));

        this.contratos.setValue(contratos);
    }
}