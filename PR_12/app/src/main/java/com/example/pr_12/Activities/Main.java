package com.example.pr_12.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pr_12.R;

public class Main extends BaseAct {

    private SharedPreferences preferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        preferences = getSharedPreferences("pref_name", MODE_PRIVATE);
    }

    public void BtColor(View view) {
        Intent intent = new Intent(this, ColorSelector.class);
        startActivity(intent);
    }

    public void BtThirdAct(View view) {
        Intent intent = new Intent(this, Third.class);
        startActivity(intent);
    }
}