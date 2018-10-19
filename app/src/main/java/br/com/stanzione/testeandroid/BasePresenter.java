package br.com.stanzione.testeandroid;

public interface BasePresenter<T extends BaseView> {
    void attachView(T view);
    void dispose();
}
