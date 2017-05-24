package com.example.kianomdharmabekti.bismaoperation_guru.REST;

import com.example.kianomdharmabekti.bismaoperation_guru.HELPER.ToStringConverter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Response;

import java.io.IOException;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.POST;

/**
 * Created by Ki Anom Dharma Bekti on 5/24/2017.
 */
public class RestClient {
    private static GitApiInterface gitApiInterface;
    //    private static String baseUrl = "http://bisma.bluecrawler.com" ;
    private static String baseUrl = "http://api.bismaoperation.id" ;
    private static final String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwOi8vd3d3LmFwaS5iaXNtYW9wZXJhdGlvbi5pZC9wdWJsaWMvYXV0aC9sb2dpbiIsImlhdCI6MTQ5NTQ2MzY3MywiZXhwIjoxNDk1NTIzNjczLCJuYmYiOjE0OTU0NjM2NzMsImp0aSI6IkNHclVOUFdNY3Q2TXprZDYiLCJzdWIiOjZ9.7bVkzdxaZlrclX1FgXswtNrwOoHgpxQH7LSDBDNm7GE";


    public static GitApiInterface getClient(){
        if(gitApiInterface==null){

            Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();

            OkHttpClient okClient = new OkHttpClient();
            okClient.interceptors().add(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Response response = chain.proceed(chain.request());
                    return response;
                }
            });

            Retrofit client = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverter(String.class, new ToStringConverter())
                    .client(okClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            gitApiInterface = client.create(GitApiInterface.class);

        }
        return gitApiInterface;
    }

    public interface GitApiInterface {

        @FormUrlEncoded
        @Headers("Authorization: "+token)
        @POST("/public/Murid/LoginMurid")
        Call<APIMuridData> login(@Field("username") String username, @Field("password") String password);

    }
}