package com.nytimes.view.callbacks;

import com.nytimes.data.local.entity.ArticleEntity;

public interface ResponseListener {

    void onSuccess(ArticleEntity data);
    void onFailure(String message);
}
