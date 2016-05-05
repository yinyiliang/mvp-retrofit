package yyl.todayinhistory.ui.activity;


import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;


import yyl.todayinhistory.Model.ResultBean;
import yyl.todayinhistory.Presenter.TodayPresenter;
import yyl.todayinhistory.R;
import yyl.todayinhistory.Util.TimeUtil;
import yyl.todayinhistory.api.HistoryApi;
import yyl.todayinhistory.common.DividerItemDecoration;
import yyl.todayinhistory.ui.BaseAvtivity;
import yyl.todayinhistory.ui.adpter.HistoryAdpter;
import yyl.todayinhistory.ui.view.HistoryView;

public class MainActivity extends BaseAvtivity implements HistoryView{

    private RecyclerView recyclerView;


    private TodayPresenter todayPresenter;
    private List<ResultBean> resultList;
    private HistoryAdpter historyAdpter;
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initData();
        loadData();
    }

    private void initViews() {
        recyclerView = (RecyclerView) findViewById(R.id.record_recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(getResources().getDrawable(R.drawable.divider)));
    }

    private void initData() {

        resultList = new ArrayList<>();
        historyAdpter = new HistoryAdpter(resultList);
        recyclerView.setAdapter(historyAdpter);

        todayPresenter = new TodayPresenter();
        todayPresenter.attachView(this);
    }

    private void loadData() {
        todayPresenter.loadList(HistoryApi.API_KEY, TimeUtil.getDate());
    }


    @Override
    public void refresh(List<ResultBean> data) {
        resultList.clear();
        resultList.addAll(data);
        historyAdpter.notifyDataSetChanged();


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        todayPresenter.detachView();
    }
}
