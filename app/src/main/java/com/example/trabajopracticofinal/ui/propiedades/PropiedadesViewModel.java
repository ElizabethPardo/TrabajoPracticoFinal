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

import com.example.trabajopracticofinal.R;
import com.example.trabajopracticofinal.modelo.Propiedad;

import java.util.ArrayList;



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
        inmuebles.add(new Propiedad("Pedernera 1234",3,"Departamento","Residencial",20000, true,R.drawable.casa1));
        inmuebles.add(new Propiedad("Balcarse 123",2,"Local","Comercial",25999,false,R.drawable.casa2));
        inmuebles.add(new Propiedad("Belgrano 899",4,"Casa","Residencial",15899,true,R.drawable.casa3));
        this.inmuebles.setValue(inmuebles);
    }

}