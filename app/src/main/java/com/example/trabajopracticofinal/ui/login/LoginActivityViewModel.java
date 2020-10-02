package com.example.trabajopracticofinal.ui.login;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.trabajopracticofinal.MainActivity;

public class LoginActivityViewModel extends AndroidViewModel {
    private Context context;
    private MutableLiveData<String> error;

    public LoginActivityViewModel(@NonNull Application application) {
        super(application);
        context=application.getApplicationContext();

    }

    public LiveData<String> getError() {
        if(error == null)
        {
            error = new MutableLiveData<>();
        }
        return error;
    }

    public void autenticar(String user, String pass)
    {
        String usuario="eli@gmail.com";
        String contrasenia="123";

        if(usuario.equals(user)  && contrasenia.equals(pass))
        {
          Intent intent = new Intent(context, MainActivity.class);
          context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
        }
        else
        {
          error.setValue("Email o password son incorrectos");
        }

    }
}
