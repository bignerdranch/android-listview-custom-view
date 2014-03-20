package com.bignerdranch.android.listitemviewdemo.test;

import java.util.ArrayList;

import android.test.AndroidTestCase;
import android.view.View;
import android.widget.ListView;

import com.bignerdranch.android.listitemviewdemo.Item;
import com.bignerdranch.android.listitemviewdemo.ItemAdapter;
import com.bignerdranch.android.listitemviewdemo.ItemView;

public class ItemAdapterTests extends AndroidTestCase {
    private ItemAdapter mAdapter;
    private ArrayList<Item> mItems;
    private ListView mListView;
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mItems = new ArrayList<Item>();
        mItems.add(new Item("url1", "title1", "description1"));
        mItems.add(new Item("url2", "title2", "description2"));
        mItems.add(new Item("url3", "title3", "description3"));
        mAdapter = new ItemAdapter(getContext(), mItems);
        mListView = new ListView(getContext());
    }
    
    public void testGetItem() {
        Item item = mAdapter.getItem(0);
        assertEquals("url1", item.getImageUrl());
        assertEquals("title1", item.getTitle());
        assertEquals("description1", item.getDescription());
        item = mAdapter.getItem(2);
        assertEquals("url3", item.getImageUrl());
        assertEquals("title3", item.getTitle());
        assertEquals("description3", item.getDescription());
    }
    
    public void testGetView() {
        for (int i = 0; i < mItems.size(); i++) {
            Item item = mItems.get(i);
            ItemView view = (ItemView) mAdapter.getView(i, null, mListView);
            assertEquals(item.getTitle(), view.getTitleTextView().getText());
        }
    }
    
    public void testGetViewRecycling() {
        View view1 = mAdapter.getView(0, null, mListView);
        View view2 = mAdapter.getView(0, view1, mListView);
        assertSame(view1, view2);
    }

}
