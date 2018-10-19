package br.com.stanzione.testeandroid.api;

import br.com.stanzione.testeandroid.data.Cell;
import io.reactivex.Observable;
import retrofit2.http.GET;

public interface SantanderApi {

    @GET("cells.json")
    Observable<Cell> getFormFields();

}
