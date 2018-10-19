package br.com.stanzione.testeandroid.api;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface SantanderApi {

    @GET("cells.json")
    Observable getFormFields();

}
