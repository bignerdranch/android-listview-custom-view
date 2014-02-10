package com.bignerdranch.android.listitemviewdemo.test;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.bignerdranch.android.listitemviewdemo.ItemListFragment;


public class ItemListFragmentHostActivity extends FragmentActivity {
    
    @Override
    protected void onCreate(Bundle arg0) {
        super.onCreate(arg0);
        setContentView(R.layout.item_list_fragment);
    }
    
    public ItemListFragment getItemListFragment() {
        return (ItemListFragment)getSupportFragmentManager().findFragmentById(R.id.itemListFragment);
    }
}