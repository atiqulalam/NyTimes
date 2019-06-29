package com.nytimes.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import com.nytimes.data.local.entity.ArticleEntity;
import com.nytimes.data.remote.Resource;
import com.nytimes.data.remote.repository.ArticleRepository;

import java.util.List;

import javax.inject.Inject;


public class ArticleListViewModel extends ViewModel {
    private final LiveData<Resource<List<ArticleEntity>>> popularArticles;

    @Inject
    public ArticleListViewModel(ArticleRepository articleRepository) {
        popularArticles = articleRepository.loadPopularArticles(7);
    }

    public LiveData<Resource<List<ArticleEntity>>> getPopularArticles() {
        return popularArticles;
    }
}
