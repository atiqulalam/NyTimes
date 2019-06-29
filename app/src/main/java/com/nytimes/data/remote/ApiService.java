package com.nytimes.data.remote;

import com.nytimes.data.remote.model.PopularArticleResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("svc/mostpopular/v2/mostviewed/all-sections/{index}.json")
    Call<PopularArticleResponse> loadPopularArticles(@Path("index") int index/*,@Query("apiKey") String apiKey*/);
}
