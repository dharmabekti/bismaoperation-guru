package com.example.kianomdharmabekti.bismaoperation_guru.HELPER;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

import retrofit.Converter;

/**
 * Created by Ki Anom Dharma Bekti on 5/24/2017.
 */
public class ToStringConverter implements Converter<String> {
    @Override
    public String fromBody(ResponseBody body)throws IOException {
        return body.string();
    }
    @Override
    public RequestBody toBody(String value){
        return RequestBody.create(MediaType.parse("text/plain"),value);

    }
}
