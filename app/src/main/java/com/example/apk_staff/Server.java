package com.example.apk_staff;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Server {
    private  static final String url_base="http://192.168.43.9/staff_app/";

    private static Retrofit retrofit;

    public static Retrofit getClient(){

        if (retrofit ==null){
            retrofit=new Retrofit.Builder().baseUrl(url_base)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
