package br.com.stanzione.testeandroid.di;

import javax.inject.Singleton;

import br.com.stanzione.testeandroid.form.FormFragment;
import br.com.stanzione.testeandroid.form.FormModule;
import dagger.Component;

@Singleton
@Component(
        modules = {
                NetworkModule.class,
                FormModule.class
        }
)
public interface ApplicationComponent {
    void inject(FormFragment fragment);
}
