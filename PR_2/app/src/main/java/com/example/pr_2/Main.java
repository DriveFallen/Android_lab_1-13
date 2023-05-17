package com.example.pr_2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {
    TextView textView_1, textView_2;
    Button button_add, button_copy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        textView_1=(TextView)findViewById(R.id.tv_1);
        textView_2=(TextView)findViewById(R.id.tv_2);
        button_add=(Button)findViewById(R.id.add);
        button_copy=(Button)findViewById(R.id.copy);
    }

    public void onAdd(View view) {
        textView_1.append("*");
    }

    public void onCopy(View view) {
        textView_2.setText(textView_1.getText().toString());
    }
}

