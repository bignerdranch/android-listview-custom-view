package com.bignerdranch.android.listitemviewdemo.test;

import android.test.AndroidTestCase;

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

}
