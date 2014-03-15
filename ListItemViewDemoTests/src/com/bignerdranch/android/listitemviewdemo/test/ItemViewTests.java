package com.bignerdranch.android.listitemviewdemo.test;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.widget.FrameLayout;

import com.bignerdranch.android.listitemviewdemo.Item;
import com.bignerdranch.android.listitemviewdemo.ItemView;

public class ItemViewTests extends AndroidTestCase {
    
    private ItemView mItemView;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mItemView = new ItemView(getContext());
    }
    
    public void testConstruction() {
        assertNotNull(mItemView.getTitleTextView());
        assertNotNull(mItemView.getImageView());
        assertNotNull(mItemView.getDescriptionTextView());
    }
    
    public void testSetItem() {
        Item item = new Item("url", "title", "description");
        mItemView.setItem(item);
        // TODO: test url
        assertEquals("title", mItemView.getTitleTextView().getText());
        assertEquals("description", mItemView.getDescriptionTextView().getText());
    }

    public void testInflationHonorsLayoutParams() {
        FrameLayout parent = new FrameLayout(getContext());
        ItemView itemView = ItemView.inflate(parent);
        assertNotNull(itemView.getTitleTextView());
        assertNotNull(itemView.getImageView());
        assertNotNull(itemView.getDescriptionTextView());
        int paddingLeft = itemView.getPaddingLeft();
        WindowManager windowManager = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        assertNotNull(windowManager);
        DisplayMetrics metrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(metrics);
        assertEquals((int)(5 * metrics.density), paddingLeft);
    }

}
