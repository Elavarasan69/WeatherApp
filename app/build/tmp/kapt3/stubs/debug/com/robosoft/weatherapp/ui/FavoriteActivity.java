package com.robosoft.weatherapp.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0015J \u0010\r\u001a\u00020\n2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/robosoft/weatherapp/ui/FavoriteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "favoriteBinding", "Lcom/robosoft/weatherapp/databinding/ActivityFavoriteBinding;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "weatherDB", "Lcom/robosoft/weatherapp/database/WeatherDB;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "showAlertDialog", "totalList", "Ljava/util/ArrayList;", "Lcom/robosoft/weatherapp/dataclass/RecyclerViewItems;", "Lkotlin/collections/ArrayList;", "app_debug"})
public final class FavoriteActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.robosoft.weatherapp.databinding.ActivityFavoriteBinding favoriteBinding;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.robosoft.weatherapp.database.WeatherDB weatherDB;
    private java.util.HashMap _$_findViewCache;
    
    public FavoriteActivity() {
        super();
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showAlertDialog(java.util.ArrayList<com.robosoft.weatherapp.dataclass.RecyclerViewItems> totalList) {
    }
}