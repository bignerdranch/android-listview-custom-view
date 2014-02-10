package com.bignerdranch.android.listitemviewdemo.test;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.ListView;

import com.bignerdranch.android.listitemviewdemo.ItemListFragment;


public class ItemListFragmentTests extends ActivityInstrumentationTestCase2<ItemListFragmentHostActivity> {
    
    private ItemListFragment mItemListFragment;
    
    public ItemListFragmentTests() {
        super(ItemListFragmentHostActivity.class);
    }
    
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        
        ItemListFragmentHostActivity activity = (ItemListFragmentHostActivity)getActivity();
//        activity.getSupportFragmentManager().executePendingTransactions();
        mItemListFragment = activity.getItemListFragment();
    }
    
    public void testAdapterSetup() {
        ListView listView = mItemListFragment.getListView();
        assertNotNull(listView.getAdapter());
        assertEquals(50, listView.getCount());
    }
}
