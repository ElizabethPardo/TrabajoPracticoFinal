package com.example.trabajopracticofinal.ui.pagos;

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
import modelo.Pago;
import modelo.Propiedad;

public class PagosViewModel extends AndroidViewModel {

    private Context context;
    private ArrayAdapter<Pago> adapter;
    private MutableLiveData<ArrayList<Pago>> pagos;

    public PagosViewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();
    }

    public LiveData<ArrayList<Pago>> getPagos() {

        if(pagos == null)
        {
            pagos= new MutableLiveData<>();
        }
        return pagos;
    }

    public void cargarContratos()
    {
        ArrayList<Pago> pagos = new ArrayList<>();
        pagos.add(new Pago(1,"22/10/2020",13.455));
        pagos.add(new Pago(2,"01/05/2019",43.555));
        pagos.add(new Pago(3,"15/09/2010",15.000));

        this.pagos.setValue(pagos);
    }
}