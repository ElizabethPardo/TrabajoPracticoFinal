package com.example.trabajopracticofinal.ui.perfil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import modelo.Propietario;

public class PerfilViewModel extends ViewModel {

    private MutableLiveData<Propietario> propietario;

    public PerfilViewModel() {

    }

    public LiveData<Propietario> getPropietario() {
        if(propietario== null)
        {
            propietario= new MutableLiveData<>();
        }
        return propietario;
    }

    public void recuperarPropietario()
    {
        Propietario p = new Propietario(37638739,"Pardo","Elizabeth","2664508236","eli@gmail.com","123");
    }
}