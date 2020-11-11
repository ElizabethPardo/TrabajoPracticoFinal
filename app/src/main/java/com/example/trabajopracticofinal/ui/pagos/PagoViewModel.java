package com.example.trabajopracticofinal.ui.pagos;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.trabajopracticofinal.modelo.Pago;

import java.util.ArrayList;

public class PagoViewModel extends AndroidViewModel {


    private MutableLiveData<ArrayList<Pago>> pagos;

    public PagoViewModel(@NonNull Application application) {
        super(application);

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


}