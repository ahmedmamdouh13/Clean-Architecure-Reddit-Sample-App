package com.example.data.repository.network;

import com.example.data.model.RedditPostsModel;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by ahmedmamdouh13 on 15/09/17.
 */

public interface RetrofitService {
  public static final String SERVICE_ENDPOINT="https://www.reddit.com";
   // String Query="/v1/articles?source=reddit-r-all&sortBy=latest&apiKey=b1b7e58c35b6453dbaa1fe64b757d711";

  //msclkgdzns5d830d2f3df0762cdce574705d9d9cf23d55b765

    @GET("/r/androiddev/new/.json")
    Observable<RedditPostsModel> listTopics();


}
