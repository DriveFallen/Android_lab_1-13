package com.example.pr_10;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    private ListView Lw_1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        Lw_1 = (ListView) findViewById(R.id.Lv_1);

        String[] arr = getResources().getStringArray(R.array.Massive);
        MyAdapter myAdapter = new MyAdapter (arr);
        Lw_1.setAdapter(myAdapter);
    }
}