package com.example.trabajopracticofinal.ui.pagos;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.trabajopracticofinal.modelo.Contrato;
import com.example.trabajopracticofinal.modelo.Pago;
import com.example.trabajopracticofinal.modelo.Propiedad;

import java.io.Serializable;
import java.util.ArrayList;

public class PagoViewModel extends AndroidViewModel {


    private MutableLiveData<Pago> pago;

    public PagoViewModel(@NonNull Application application) {
        super(application);

    }

    public LiveData<Pago> getPago() {

        if(pago == null)
        {
            pago= new MutableLiveData<>();
        }
        return pago;
    }


}