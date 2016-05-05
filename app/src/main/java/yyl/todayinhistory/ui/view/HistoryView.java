package yyl.todayinhistory.ui.view;

import java.util.List;

import yyl.todayinhistory.Model.ResultBean;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public interface HistoryView extends MvpView {

    void refresh(List<ResultBean> data);

}
