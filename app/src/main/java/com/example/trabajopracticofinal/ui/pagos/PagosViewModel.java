package com.example.trabajopracticofinal.ui.pagos;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import com.example.trabajopracticofinal.modelo.Contrato;
import com.example.trabajopracticofinal.modelo.Inquilino;
import com.example.trabajopracticofinal.modelo.Pago;
import com.example.trabajopracticofinal.modelo.Propiedad;

public class PagosViewModel extends AndroidViewModel {

    private Context context;
    private ArrayAdapter<Contrato> adapter;
    private ArrayAdapter<Pago> adapterPagos;
    private MutableLiveData<ArrayList<Contrato>> contratos;
    private MutableLiveData<ArrayList<Pago>> pagos;


    public PagosViewModel(@NonNull Application application) {
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

    public LiveData<ArrayList<Pago>> getPagos()
    {
        if(pagos == null)
        {
            pagos= new MutableLiveData<>();
        }
        return pagos;
    }

    public void cargarPagos() {

        ArrayList<Pago> pagos = new ArrayList<>();

        pagos.add(new Pago(1,"22/10/2020",13.455));
        pagos.add(new Pago(2,"01/05/2019",43.555));
        pagos.add(new Pago(3,"15/09/2010",15.000));

        this.pagos.setValue(pagos);

    }

    public void cargarContratos()
    {
        ArrayList<Contrato> contratos = new ArrayList<>();
        contratos.add(new Contrato("22/10/2018","22/10/2019",23300,new Inquilino("Pedernera 1234")));
        contratos.add(new Contrato("01/05/2019","01/05/2020",43555,new Inquilino("Balcarse 123")));
        contratos.add(new Contrato("15/03/2020","15/03/2021",15000,new Inquilino("Belgrano 899")));

        this.contratos.setValue(contratos);
    }

}