package com.example.trabajopracticofinal.ui.contratos;

import android.app.Application;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import modelo.Contrato;
import modelo.Propiedad;

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
        contratos.add(new Contrato("22/10/2018","22/10/2019",23300));
        contratos.add(new Contrato("01/05/2019","01/05/2020",43555));
        contratos.add(new Contrato("15/03/2020","15/03/2021",15000));

        this.contratos.setValue(contratos);
    }
}