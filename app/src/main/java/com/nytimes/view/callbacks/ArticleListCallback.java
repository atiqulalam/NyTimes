package com.nytimes.view.callbacks;

import com.nytimes.data.local.entity.ArticleEntity;


public interface ArticleListCallback {
    void onArticleClicked(ArticleEntity articleEntity);
}

