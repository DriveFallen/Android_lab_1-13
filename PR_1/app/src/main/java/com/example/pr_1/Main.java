package com.example.pr_1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        Button Btn_1=(Button) findViewById(R.id.Btn_1);
        Button Btn_2=(Button) findViewById(R.id.Btn_2);
        Button Btn_3=(Button) findViewById(R.id.Btn_3);
        Button Btn_4=(Button) findViewById(R.id.Btn_4);

        Btn_1.setOnClickListener(this);
        Btn_2.setOnClickListener(this);
        Btn_3.setOnClickListener(this);
        Btn_4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button b=(Button)view;

        b.setText(R.string.AfterClick);
    }
}
