package com.example.pr_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Main extends AppCompatActivity {
    private LinearLayout linearLayout;
    private TextView textView_1, textView_2;
    private Button bt_1, bt_2, bt_3, bt_4, bt_5, bt_6;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        linearLayout = (LinearLayout) findViewById(R.id.mLL);
        textView_1 = (TextView)findViewById(R.id.tv_1);
        textView_2 = (TextView)findViewById(R.id.tv_2);
        bt_1 = (Button)findViewById(R.id.bt_1);
        bt_2 = (Button)findViewById(R.id.bt_2);
        bt_3 = (Button)findViewById(R.id.bt_3);
        bt_4 = (Button)findViewById(R.id.bt_4);
        bt_5 = (Button)findViewById(R.id.bt_5);
        bt_6 = (Button)findViewById(R.id.bt_6);
    }

    public void onRed(View view) {
        textView_1.setBackgroundColor(ContextCompat.getColor(this,R.color.red));
        textView_1.setTextColor(ContextCompat.getColor(this, R.color.green));
        textView_2.setBackgroundColor(ContextCompat.getColor(this,R.color.red));
        textView_2.setTextColor(ContextCompat.getColor(this, R.color.green));
    }

    public void onYellow(View view) {
        textView_1.setBackgroundColor(ContextCompat.getColor(this,R.color.yellow));
        textView_1.setTextColor(ContextCompat.getColor(this, R.color.blue));
        textView_2.setBackgroundColor(ContextCompat.getColor(this,R.color.yellow));
        textView_2.setTextColor(ContextCompat.getColor(this, R.color.blue));
    }

    public void onBlack(View view) {
        textView_1.setBackgroundColor(ContextCompat.getColor(this,R.color.black));
        textView_1.setTextColor(ContextCompat.getColor(this, R.color.white));
        textView_2.setBackgroundColor(ContextCompat.getColor(this,R.color.black));
        textView_2.setTextColor(ContextCompat.getColor(this, R.color.white));
    }

    public void backRed(View view) {
        linearLayout.setBackgroundColor((ContextCompat.getColor(this,R.color.red)));
    }

    public void backBlue(View view) {
        linearLayout.setBackgroundColor((ContextCompat.getColor(this,R.color.blue)));
    }

    public void backBlack(View view) {
        linearLayout.setBackgroundColor(ContextCompat.getColor(this,R.color.black));
    }
}