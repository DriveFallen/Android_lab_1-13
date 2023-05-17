package com.example.pr_4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.badge.BadgeUtils;

public class Main extends AppCompatActivity {
    private LinearLayout LinearLayout;
    private EditText EditText_1, EditText_2;
    private Button Bt_1, Bt_2, Bt_3, Bt_4;
    private TextView TextView;
    int result = 0;
    int first_num = 0;
    int second_num = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        LinearLayout = (LinearLayout) findViewById(R.id.Linear_1);
        EditText_1 = (EditText) findViewById(R.id.EditText_1);
        EditText_2 = (EditText) findViewById(R.id.EditText_2);
        Bt_1 = (Button) findViewById(R.id.Button_1);
        Bt_2 = (Button) findViewById(R.id.Button_2);
        Bt_3 = (Button) findViewById(R.id.Button_3);
        Bt_4 = (Button) findViewById(R.id.Button_4);
        TextView = (TextView) findViewById(R.id.TextView);
    }

    public void plus (View view) {
        first_num = Integer.valueOf(EditText_1.getText().toString());
        second_num = Integer.valueOf(EditText_2.getText().toString());
        result = first_num + second_num;
        TextView.setText(EditText_1.getText() + "+" + EditText_2.getText() +"="+ String.valueOf(result));
    }

    public void minus (View view) {
        first_num = Integer.valueOf(EditText_1.getText().toString());
        second_num = Integer.valueOf(EditText_2.getText().toString());
        result = first_num - second_num;
        TextView.setText(EditText_1.getText() + "-" + EditText_2.getText() +"="+ String.valueOf(result));
    }

    public void star (View view) {
        first_num = Integer.valueOf(EditText_1.getText().toString());
        second_num = Integer.valueOf(EditText_2.getText().toString());
        result = first_num * second_num;
        TextView.setText(EditText_1.getText() + "*" + EditText_2.getText() +"="+ String.valueOf(result));
    }

    public void slash (View view) {
        first_num = Integer.valueOf(EditText_1.getText().toString());
        second_num = Integer.valueOf(EditText_2.getText().toString());
        if (second_num == 0) {
            TextView.setText("Деление на ноль.");
        }
        else {
            result = first_num / second_num;
            TextView.setText(EditText_1.getText() + "/" + EditText_2.getText() +"="+ String.valueOf(result));
        }
    }
}
