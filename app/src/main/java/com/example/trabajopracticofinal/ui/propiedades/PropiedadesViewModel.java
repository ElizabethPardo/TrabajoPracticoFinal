package com.example.trabajopracticofinal.ui.propiedades;

import android.app.Application;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

import modelo.Propiedad;

public class PropiedadesViewModel extends AndroidViewModel {


    private Context context;
    private ArrayAdapter<Propiedad> adapter;
    private MutableLiveData<ArrayList<Propiedad>> inmuebles;

    public PropiedadesViewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();
    }

    public LiveData<ArrayList<Propiedad>> getInmuebles() {

        if(inmuebles== null)
        {
            inmuebles= new MutableLiveData<>();
        }
        return inmuebles;
    }

    public void cargarInmuebles(){

        ArrayList<Propiedad> inmuebles= new ArrayList<>();
        inmuebles.add(new Propiedad("Pedernera 1234",3,"Departamento","Residencial",20000));
        inmuebles.add(new Propiedad("Balcarse 123",2,"Local","Comercial",25999));
        inmuebles.add(new Propiedad("Belgrano 899",4,"Casa","Residencial",15899));
        this.inmuebles.setValue(inmuebles);
    }

}