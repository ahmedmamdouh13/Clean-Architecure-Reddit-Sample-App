package com.example.ahmedmamdouh13.takenotesmvpstudy;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by ahmedmamdouh13 on 15/09/17.
 */

public interface RedditService {
  public static final String SERVICE_ENDPOINT="https://newsapi.org";
   // String Query="/v1/articles?source=reddit-r-all&sortBy=latest&apiKey=b1b7e58c35b6453dbaa1fe64b757d711";


    @GET("/v1/articles?source=reddit-r-all&sortBy=latest&apiKey=b1b7e58c35b6453dbaa1fe64b757d711")
    Observable<redditEntryPojo> listTopics();

}
