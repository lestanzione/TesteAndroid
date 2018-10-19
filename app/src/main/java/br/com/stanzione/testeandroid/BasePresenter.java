package br.com.stanzione.testeandroid;

public interface BasePresenter {
    void attachView(BaseView view);
    void dispose();
}
