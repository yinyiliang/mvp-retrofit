package yyl.todayinhistory.Presenter;

import yyl.todayinhistory.ui.view.MvpView;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public interface Presenter<V extends MvpView> {

    void attachView(V mvpView);

    void detachView();

}
