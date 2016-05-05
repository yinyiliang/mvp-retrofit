package yyl.todayinhistory.Presenter;

import java.util.List;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;
import yyl.todayinhistory.ui.view.HistoryView;
import yyl.todayinhistory.Model.HistoryBean;
import yyl.todayinhistory.Model.ResultBean;
import yyl.todayinhistory.api.HistoryApi;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public class TodayPresenter extends BasePresenter<HistoryView> {

    @Override
    public void attachView(HistoryView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }

    public void loadList(String key,String date) {

        HistoryApi.getHistoryApi().getService()
                .getResult(key,date)
                .subscribeOn(Schedulers.io())
                .map(new Func1<HistoryBean, List<ResultBean>>() {
                    @Override
                    public List<ResultBean> call(HistoryBean historyBean) {
                        return historyBean.getResult();
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<List<ResultBean>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(List<ResultBean> resultBeen) {
                        getmMvpView().refresh(resultBeen);
                    }
                });

    }

}
