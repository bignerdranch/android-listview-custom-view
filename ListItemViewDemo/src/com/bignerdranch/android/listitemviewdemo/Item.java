package com.bignerdranch.android.listitemviewdemo;

public class Item {
    private String mImageUrl;
    private String mTitle;
    private String mDescription;
    
    public Item(String imageUrl, String title, String description) {
        super();
        mImageUrl = imageUrl;
        mTitle = title;
        mDescription = description;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        mImageUrl = imageUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }
}
