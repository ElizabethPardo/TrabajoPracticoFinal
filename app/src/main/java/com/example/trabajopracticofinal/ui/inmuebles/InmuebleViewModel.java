package com.example.trabajopracticofinal.ui.inmuebles;

import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.trabajopracticofinal.modelo.Inmueble;



public class InmuebleViewModel extends AndroidViewModel {

    private MutableLiveData<Inmueble> inmueble;

    public InmuebleViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Inmueble> getInmueble() {

        if(inmueble == null)
        {
            inmueble= new MutableLiveData<>();
        }
        return inmueble;
    }

    public void cargarInmueble(Bundle bundle)
    {
        Inmueble inmueble= (Inmueble) bundle.getSerializable("inmueble");
        this.inmueble.setValue(inmueble);

    }
}
