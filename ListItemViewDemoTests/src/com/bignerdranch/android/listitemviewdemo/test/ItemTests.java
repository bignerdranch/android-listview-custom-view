package com.bignerdranch.android.listitemviewdemo.test;

import com.bignerdranch.android.listitemviewdemo.Item;

import junit.framework.TestCase;

public class ItemTests extends TestCase {

    public void testConstruction() {
        String url = "http://test.com/item.jpg";
        String title = "This is the title";
        String description = "This is the description";
        Item item = new Item(url, title, description);
        assertEquals(url, item.getImageUrl());
        assertEquals(title, item.getTitle());
        assertEquals(description, item.getDescription());
    }
}
