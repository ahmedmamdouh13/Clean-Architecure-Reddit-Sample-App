package com.example.ahmedmamdouh13.takenotesmvpstudy;

import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ahmedmamdouh13 on 15/09/17.
 */

public class RetrofitInstance {
    public static final String SERVICE_ENDPOINT="https://newsapi.org";
    public static  Retrofit retrofit=null;

    public static Retrofit getRetrofitinstance(){

        if (retrofit==null){

            retrofit=
                    new Retrofit.Builder().baseUrl(SERVICE_ENDPOINT).addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create()).build();

        }


        return retrofit;
    }

}
