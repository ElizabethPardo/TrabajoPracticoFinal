package com.example.trabajopracticofinal.ui.inquilinos;

import android.app.Application;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.ArrayList;

import com.example.trabajopracticofinal.modelo.Inquilino;
import com.example.trabajopracticofinal.modelo.Inmueble;

public class InquilinosViewModel extends AndroidViewModel {

    private Context context;
    private ArrayAdapter<Inmueble> adapter;
    private MutableLiveData<ArrayList<Inquilino>> inquilinos;

    public InquilinosViewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();
    }

    public LiveData<ArrayList<Inquilino>> getInquilinos() {

        if(inquilinos == null)
        {
            inquilinos = new MutableLiveData<>();
        }
        return inquilinos;
    }

    public void cargarInquilinos(){

        ArrayList<Inquilino> inquilinos= new ArrayList<>();
        inquilinos.add(new Inquilino("Martin","Lucero","36555666","2664554433","Mitre 502","martin@gmail.com","ULP","Jimena"," Ortiz","32334489","266778877","Colon 909"));
        inquilinos.add(new Inquilino("Emilia","Perez","34123345","2664232312","San Martin 888", "emi@gmail.com","Grupo slot","Lucas"," Rodriguez","31222111","2669009988","Belgrano 676"));
        inquilinos.add(new Inquilino("Agustin","Neme","37888987","Colon 345","2669887744","agus@hotmail.com","Esso","Alana"," Avila","31222333","2665765432","contirucion 676"));
        this.inquilinos.setValue(inquilinos);
    }
}