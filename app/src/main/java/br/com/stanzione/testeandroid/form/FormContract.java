package br.com.stanzione.testeandroid.form;

import br.com.stanzione.testeandroid.BasePresenter;
import br.com.stanzione.testeandroid.BaseView;
import br.com.stanzione.testeandroid.data.Cell;
import io.reactivex.Observable;

public interface FormContract {

    interface View extends BaseView{
    }

    interface Presenter extends BasePresenter<View>{
        void getFormFields();
    }

    interface Repository {
        Observable<Cell> getFormFields();
    }

}
