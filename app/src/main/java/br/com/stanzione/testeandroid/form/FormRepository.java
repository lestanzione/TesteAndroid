package br.com.stanzione.testeandroid.form;

import br.com.stanzione.testeandroid.api.SantanderApi;
import br.com.stanzione.testeandroid.data.Cell;
import io.reactivex.Observable;

public class FormRepository implements FormContract.Repository {

    private SantanderApi santanderApi;

    public FormRepository(SantanderApi santanderApi){
        this.santanderApi = santanderApi;
    }

    @Override
    public Observable<Cell> getFormFields() {
        return santanderApi.getFormFields();
    }
}
