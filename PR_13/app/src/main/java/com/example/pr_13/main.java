package com.example.pr_13;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class main extends AppCompatActivity implements TextWatcher {

    private TextView tv;
    private EditText et;
    private Button bt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        tv = findViewById(R.id.tv);
        et = findViewById(R.id.et);
        bt = findViewById(R.id.bt);
        et.addTextChangedListener(this);
        bt.setEnabled(false);
    }

    public void onOK(View view) {
        tv.setText(et.getText().toString());
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        if(et.getText().toString().trim().length() >= 1) {
            bt.setEnabled(true);
        } else {
            bt.setEnabled(false);
        }
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
