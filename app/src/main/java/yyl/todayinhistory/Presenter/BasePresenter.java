package yyl.todayinhistory.Presenter;

import yyl.todayinhistory.ui.view.MvpView;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public class BasePresenter<T extends MvpView> implements Presenter<T> {

    private T mMvpView;

    @Override
    public void attachView(T mvpView) {
        mMvpView = mvpView;
    }

    @Override
    public void detachView() {
        mMvpView = null;
    }

    public T getmMvpView() {
        return mMvpView;
    }

    public Boolean isAttachView() {
        return mMvpView != null;
    }

    public void checkViewAttached() {
        if (!isAttachView()) throw new NotAttachViewException();
    }

    private static class NotAttachViewException extends RuntimeException {
        public NotAttachViewException(){
            super("出问题鸟...重启试试.");
        }
    }
}
