package com.example.trabajopracticofinal.request;

import com.example.trabajopracticofinal.modelo.Propietario;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public class ApiClient {

    private static final String PATH="Http://192.168.0.110:45455/api/";

    public  static  MyApiInterface myApiInterface;

    public static MyApiInterface getMyApiInterface() {

        Gson gson= new GsonBuilder().setLenient().create();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PATH)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        myApiInterface= retrofit.create(MyApiInterface.class);

        return myApiInterface;
    }

    public interface MyApiInterface {
        @FormUrlEncoded
        @POST("Propietario/login")
        Call<String> obtenerToken(@Field("Usuario") String usuario, @Field("Clave") String clave);

        @GET("Propietario")
        Call<Propietario> obtenerPropietario(@Header("Authorization") String Authorization);
    }

}
