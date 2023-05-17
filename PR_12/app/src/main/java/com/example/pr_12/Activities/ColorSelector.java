package com.example.pr_12.Activities;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pr_12.Adapters.ColorAdapter;
import com.example.pr_12.R;

public class ColorSelector extends BaseAct implements AdapterView.OnItemClickListener {

    private ListView Lv_1;
    private SharedPreferences preferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.color_act);

        preferences = getSharedPreferences("pref_name",MODE_PRIVATE);
        Lv_1 = (ListView) findViewById(R.id.Lv_1);
        Lv_1.setOnItemClickListener(this);
        String[] arrNameColor = getResources().getStringArray(R.array.arrNameColor);
        int[] arrColorNumber = getResources().getIntArray(R.array.arrColorNumber);

        ColorAdapter colorAdapter = new ColorAdapter(arrNameColor, arrColorNumber);
        Lv_1.setAdapter(colorAdapter);
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
}
