package com.robosoft.weatherapp.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0012B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/robosoft/weatherapp/adapter/FavouritesScreenAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/robosoft/weatherapp/adapter/FavouritesScreenAdapter$ViewHolder;", "totalList", "Ljava/util/ArrayList;", "Lcom/robosoft/weatherapp/dataclass/RecyclerViewItems;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"})
public final class FavouritesScreenAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.robosoft.weatherapp.adapter.FavouritesScreenAdapter.ViewHolder> {
    private final java.util.ArrayList<com.robosoft.weatherapp.dataclass.RecyclerViewItems> totalList = null;
    
    public FavouritesScreenAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.robosoft.weatherapp.dataclass.RecyclerViewItems> totalList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.robosoft.weatherapp.adapter.FavouritesScreenAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.robosoft.weatherapp.adapter.FavouritesScreenAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u0011"}, d2 = {"Lcom/robosoft/weatherapp/adapter/FavouritesScreenAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "ItemView", "Landroid/view/View;", "(Landroid/view/View;)V", "climateText", "Landroid/widget/TextView;", "getClimateText", "()Landroid/widget/TextView;", "favouriteCheckedBox", "Lcom/google/android/material/checkbox/MaterialCheckBox;", "getFavouriteCheckedBox", "()Lcom/google/android/material/checkbox/MaterialCheckBox;", "place", "getPlace", "temperature", "getTemperature", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView place = null;
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.material.checkbox.MaterialCheckBox favouriteCheckedBox = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView temperature = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView climateText = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View ItemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPlace() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.material.checkbox.MaterialCheckBox getFavouriteCheckedBox() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTemperature() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getClimateText() {
            return null;
        }
    }
}