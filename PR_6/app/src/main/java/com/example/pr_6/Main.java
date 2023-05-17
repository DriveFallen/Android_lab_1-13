package com.example.pr_6;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class Main extends AppCompatActivity {

    private Button Bt_second, Bt_third;
    private  Intent intent_2, intent_3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        Bt_second = (Button) findViewById(R.id.Bt_sec);
        Bt_third = (Button) findViewById(R.id.Bt_th);
    }

    public void openSecAct(View view) {
        intent_2 = new Intent(this, Second.class);
        startActivity(intent_2);
    }

    public void openThAct(View view) {
        intent_3 = new Intent(this, Third.class);
        startActivity(intent_3);
    }
}
