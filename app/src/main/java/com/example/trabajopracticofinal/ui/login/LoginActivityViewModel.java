package com.example.trabajopracticofinal.ui.login;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.trabajopracticofinal.MainActivity;
import com.example.trabajopracticofinal.request.ApiClient;
import com.google.android.material.checkbox.MaterialCheckBox;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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


        Call<String> dato =ApiClient.getMyApiInterface().obtenerToken(user,pass);
        dato.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                if(response.isSuccessful())
                {
                    SharedPreferences sp= context.getSharedPreferences("datos",0);
                    SharedPreferences.Editor editor= sp.edit();
                    editor.putString("token",response.body());
                    editor.commit();

                    Intent intent = new Intent(context, MainActivity.class);
                    context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));

                    //Toast.makeText(context,response.body(),Toast.LENGTH_LONG).show();

                }
                else
                    {
                        error.setValue("El usuario o contraseña son incorrectos");
                    }


            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
             error.postValue(t.getMessage());
            }
        });

        /*
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
        }*/

    }
}
