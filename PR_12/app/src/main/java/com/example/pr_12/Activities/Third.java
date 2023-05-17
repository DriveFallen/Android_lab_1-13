package com.example.pr_12.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pr_12.R;

public class Third extends BaseAct {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_act);
    }

    public void Back(View view) {
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
    }
}
