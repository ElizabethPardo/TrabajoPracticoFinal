package com.example.trabajopracticofinal.ui.perfil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.trabajopracticofinal.modelo.Propietario;

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
        Propietario p = new Propietario("Elizabeth","Pardo","37638739","pasaje fortuna","2664508236","eli@gmail.com","123");
        propietario.setValue(p);
    }
}