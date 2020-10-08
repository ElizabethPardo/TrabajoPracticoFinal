package com.example.trabajopracticofinal.ui.propiedades;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import modelo.Propiedad;

public class PropiedadViewModel extends AndroidViewModel {

    private MutableLiveData<Propiedad> inmueble;

    public PropiedadViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<Propiedad> getInmueble() {

        if(inmueble == null)
        {
            inmueble= new MutableLiveData<>();
        }
        return inmueble;
    }

    public void cargarInmueble(Bundle bundle)
    {
        Propiedad inmueble= (Propiedad) bundle.getSerializable("inmueble");
        this.inmueble.setValue(inmueble);

    }
}
