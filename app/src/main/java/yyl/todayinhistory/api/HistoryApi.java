package yyl.todayinhistory.api;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/5/4 0004.
 */
public class HistoryApi {

    public static final String HOST = "http://v.juhe.cn";
    public static final String API_KEY = "2e290ffe05fd02a47f6c33817ca1f583";

    private HistoryService service;

    public static HistoryApi getHistoryApi() {
        return historyApi;
    }

    private static HistoryApi historyApi = new HistoryApi();

    private HistoryApi() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOST)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        service = retrofit.create(HistoryService.class);

    }

    public HistoryService getService() {
        return service;
    }

}
