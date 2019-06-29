package com.nytimes.data.local;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.nytimes.data.local.dao.ArticleDao;
import com.nytimes.data.local.entity.ArticleEntity;


@Database(entities = {ArticleEntity.class}, version = 1)
public abstract class ArticleDatabase extends RoomDatabase {
    public abstract ArticleDao articleDao();
}