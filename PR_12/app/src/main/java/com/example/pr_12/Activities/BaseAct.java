package com.example.pr_12.Activities;

import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pr_12.R;

public class BaseAct extends AppCompatActivity {
    private SharedPreferences preferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        preferences = getSharedPreferences(getString(R.string.preferences),MODE_PRIVATE);
    }

    @Override
    protected void onResume() {
        super.onResume();

        int color = preferences.getInt(getString(R.string.key),0xffffff00);
        getWindow().getDecorView().setBackgroundColor(color);
    }
}