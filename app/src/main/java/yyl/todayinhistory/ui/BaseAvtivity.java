package yyl.todayinhistory.ui;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import yyl.todayinhistory.ui.view.MvpView;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public class BaseAvtivity extends AppCompatActivity implements MvpView {
    @Override
    public void showLoading(String msg) {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener, String msgId) {

    }

    @Override
    public void showNetError(View.OnClickListener onClickListener) {

    }
}
