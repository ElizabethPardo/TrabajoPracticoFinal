package com.example.trabajopracticofinal.ui.propiedades;

import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PropiedadesViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    public PropiedadesViewModel() {

    }

    public LiveData<String> getText() {
        return mText;
    }

}