package yyl.todayinhistory.api;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;
import rx.Observer;
import yyl.todayinhistory.Model.HistoryBean;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public interface HistoryService {

    @GET("/todayOnhistory/queryEvent.php")
    Observable<HistoryBean> getResult(@Query("key") String key, @Query("date") String date);

}
