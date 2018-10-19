package br.com.stanzione.testeandroid.form;

import javax.inject.Singleton;

import br.com.stanzione.testeandroid.api.SantanderApi;
import dagger.Module;
import dagger.Provides;

@Module
public class FormModule {

    @Provides
    @Singleton
    FormContract.Presenter providesPresenter(FormContract.Repository repository){
        FormPresenter presenter = new FormPresenter(repository);
        return presenter;
    }

    @Provides
    @Singleton
    FormContract.Repository providesRepository(SantanderApi santanderApi){
        FormRepository repository = new FormRepository(santanderApi);
        return repository;
    }

}
