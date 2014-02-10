package com.bignerdranch.android.listitemviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ItemView extends RelativeLayout {
    private TextView mTitleTextView;
    private TextView mDescriptionTextView;
    private ImageView mImageView;

    public ItemView(Context c) {
        super(c);
        LayoutInflater.from(c).inflate(R.layout.item_view, this);
        mTitleTextView = (TextView) findViewById(R.id.item_titleTextView);
        mDescriptionTextView = (TextView) findViewById(R.id.item_descriptionTextView);
        mImageView = (ImageView) findViewById(R.id.item_imageView);
    }
    
    public void setItem(Item item) {
        mTitleTextView.setText(item.getTitle());
        mDescriptionTextView.setText(item.getDescription());
        // TODO: set up image URL
    }
    
    public ImageView getImageView () {
        return mImageView;
    }

    public TextView getTitleTextView() {
        return mTitleTextView;
    }

    public TextView getDescriptionTextView() {
        return mDescriptionTextView;
    }
}
