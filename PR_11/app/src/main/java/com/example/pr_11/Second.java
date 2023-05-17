package com.example.pr_11;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Second extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView Lv_1;
    private SharedPreferences preferences;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_act);

        preferences = getSharedPreferences(getString(R.string.preferences), MODE_PRIVATE);
        Lv_1 = (ListView) findViewById(R.id.Lv_1);
        Lv_1.setOnItemClickListener(this);
        String[] arrNameColor = getResources().getStringArray(R.array.arrNameColor);
        int[] arrColorNumber = getResources().getIntArray(R.array.arrColorNumber);

        MyAdapter myAdapter = new MyAdapter(arrNameColor, arrColorNumber);
        Lv_1.setAdapter(myAdapter);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        int[] arrColorNumber = getResources().getIntArray(R.array.arrColorNumber);
        getWindow().getDecorView().setBackgroundColor(arrColorNumber[position]);

        SharedPreferences.Editor editor = preferences.edit();

        int save = arrColorNumber[position];
        editor.putInt(getString(R.string.key), save);

        editor.commit();
    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    protected void onResume() {
        super.onResume();

        int color = preferences.getInt(getString(R.string.key),0xffffff00);
        getWindow().getDecorView().setBackgroundColor(color);
    }
}