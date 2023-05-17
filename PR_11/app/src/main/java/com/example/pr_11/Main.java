package com.example.pr_11;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    private SharedPreferences preferences;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        preferences = getSharedPreferences(getString(R.string.preferences), MODE_PRIVATE);

    }

    public void Open (View view) {
        Intent intent = new Intent(this, Second.class);
        startActivity(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();

        int color = preferences.getInt(getString(R.string.key),0xffffff00);
        getWindow().getDecorView().setBackgroundColor(color);
    }
}