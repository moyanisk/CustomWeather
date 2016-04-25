package com.sunflower.customweather.activity;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.sunflower.customweather.R;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppBaseActivity {
    public  String tag = this.getClass().getSimpleName();

    private ListView lvItems;
//    private static String[] mData = {"1","2","4","5","2","2","2","2","2","2","2","2","2"};
    @Override
    public void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void initVariables() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(Cheeses.CHEESES));
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,arrayList);
        lvItems.setAdapter(arrayAdapter);
    }

    @Override
    protected void initViews(Bundle saveInstanceState) {
        lvItems = (ListView) findViewById(R.id.lvItems);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    protected void loadData() {

    }
}
