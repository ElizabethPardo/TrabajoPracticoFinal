package com.example.trabajopracticofinal.ui.pagos;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import modelo.Contrato;
import modelo.Pago;

public class PagoViewModel extends AndroidViewModel {
    private MutableLiveData<Pago> pago;

    public PagoViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Pago> getPago() {

        if(pago== null)
        {
            pago= new MutableLiveData<>();
        }
        return pago;
    }
}