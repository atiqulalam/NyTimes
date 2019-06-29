package com.nytimes.data.remote.model;

import com.google.gson.annotations.SerializedName;
import com.nytimes.data.local.entity.ArticleEntity;

import java.util.List;


public class PopularArticleResponse {

    @SerializedName("results")
    private List<ArticleEntity> popularArticles;


    /**
     * This method return the list of article entities
     * @return List of entities
     */
    public List<ArticleEntity> getPopularArticles() {
        return popularArticles;
    }

    /**
     * This method sets the article entities
     * @param popularArticles - articleslist
     */
    @SuppressWarnings("unused")
    public void setPopularArticles(List<ArticleEntity> popularArticles) {
        this.popularArticles = popularArticles;
    }
}
