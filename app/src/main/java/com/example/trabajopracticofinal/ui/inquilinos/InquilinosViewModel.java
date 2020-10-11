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
import com.example.trabajopracticofinal.modelo.Propiedad;

public class InquilinosViewModel extends AndroidViewModel {

    private Context context;
    private ArrayAdapter<Propiedad> adapter;
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
        inquilinos.add(new Inquilino("36555666","Lucero","Martin","Mitre 502","2664554433","martin@gmail.com","Jimena Ortiz","32334489","266778877"));
        inquilinos.add(new Inquilino("34123345","Emilia","Perez","San Martin 888", "2664232312","emi@gmail.com","Lucas Rodriguez","31222111","2669009988"));
        inquilinos.add(new Inquilino("37888987","Agustin","Neme","Colon 345","2669887744","agus@hotmail.com","Alana Avila","31222333","2665765432"));
        this.inquilinos.setValue(inquilinos);
    }
}