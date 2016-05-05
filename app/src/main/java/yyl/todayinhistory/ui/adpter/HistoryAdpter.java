package yyl.todayinhistory.ui.adpter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import yyl.todayinhistory.Model.ResultBean;
import yyl.todayinhistory.R;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public class HistoryAdpter extends RecyclerView.Adapter<HistoryAdpter.HistoryViewHolder>  {

    private List<ResultBean> resultBeen;

    public HistoryAdpter(List<ResultBean> data) {
        this.resultBeen = data;
    }

    @Override
    public HistoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.history_list,parent,false);
        HistoryViewHolder holder = new HistoryViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(HistoryViewHolder holder, int position) {
        HistoryViewHolder historyViewHolder = holder;
        historyViewHolder.title.setText(resultBeen.get(position).getTitle());
        historyViewHolder.date.setText(resultBeen.get(position).getDate());

    }

    @Override
    public int getItemCount() {
        return resultBeen.size();
    }

    static class HistoryViewHolder extends RecyclerView.ViewHolder{

        TextView title;
        TextView date;

        public HistoryViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.id_title);
            date = (TextView) itemView.findViewById(R.id.id_date);
        }
    }
}
