package yyl.todayinhistory.ui.view;

import android.view.View;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public interface MvpView {

    void showLoading(String msg);

    void hideLoading();

    void showError(String msg, View.OnClickListener onClickListener);

    void showEmpty(String msg, View.OnClickListener onClickListener);

    void showEmpty(String msg, View.OnClickListener onClickListener, String msgId);

    void showNetError(View.OnClickListener onClickListener);

}
