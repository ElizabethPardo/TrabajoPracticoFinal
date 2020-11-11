package com.example.trabajopracticofinal.ui.inmuebles;

import android.app.Application;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.trabajopracticofinal.R;
import com.example.trabajopracticofinal.modelo.Inmueble;

import java.util.ArrayList;



public class InmueblesViewModel extends AndroidViewModel {


    private Context context;
    private ArrayAdapter<Inmueble> adapter;
    private MutableLiveData<ArrayList<Inmueble>> inmuebles;

    public InmueblesViewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();
    }

    public LiveData<ArrayList<Inmueble>> getInmuebles() {

        if(inmuebles== null)
        {
            inmuebles= new MutableLiveData<>();
        }
        return inmuebles;
    }

    public void cargarInmuebles(){

        ArrayList<Inmueble> inmuebles= new ArrayList<>();
        inmuebles.add(new Inmueble("Pedernera 1234",3,"Departamento","Residencial",20000, true,R.drawable.casa1));
        inmuebles.add(new Inmueble("Balcarse 123",2,"Local","Comercial",25999,false,R.drawable.casa2));
        inmuebles.add(new Inmueble("Belgrano 899",4,"Casa","Residencial",15899,true,R.drawable.casa3));
        this.inmuebles.setValue(inmuebles);
    }

}