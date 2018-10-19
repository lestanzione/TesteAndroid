package br.com.stanzione.testeandroid.form;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

public class FormPresenter implements FormContract.Presenter {

    private FormContract.View view;
    private FormContract.Repository repository;

    private CompositeDisposable compositeDisposable = new CompositeDisposable();

    public FormPresenter(FormContract.Repository repository){
        this.repository = repository;
    }

    @Override
    public void getFormFields() {
        repository.getFormFields()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer() {
                               @Override
                               public void accept(Object o) throws Exception {
                                    System.out.println("Inside OK");
                               }
                           },
                        new Consumer<Throwable>() {
                            @Override
                            public void accept(Throwable throwable) throws Exception {
                                System.out.println("Inside error");
                            }
                        });
    }

    @Override
    public void attachView(FormContract.View view) {
        this.view = view;
    }

    @Override
    public void dispose() {

    }
}
