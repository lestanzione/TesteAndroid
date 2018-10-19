package br.com.stanzione.testeandroid;

import android.app.Application;

import br.com.stanzione.testeandroid.di.ApplicationComponent;
import br.com.stanzione.testeandroid.di.DaggerApplicationComponent;
import br.com.stanzione.testeandroid.di.NetworkModule;
import br.com.stanzione.testeandroid.form.FormModule;

public class App extends Application {

    private ApplicationComponent applicationComponent;

    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .networkModule(new NetworkModule())
                .formModule(new FormModule())
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

}
