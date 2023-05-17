package com.example.pr_8;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Second_act extends AppCompatActivity {

    private ListView List_1, List_2;
    private ArrayAdapter<String> arrayAdapter_1, arrayAdapter_2;
    private EditText Et_1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_act);

        arrayAdapter_1 = new ArrayAdapter<String> (this, R.layout.le);
        arrayAdapter_2 = new ArrayAdapter<String> (this, R.layout.le);
        List_1 = (ListView) findViewById(R.id.List_1);
        List_2 = (ListView) findViewById(R.id.List_2);
        List_1.setAdapter(arrayAdapter_1);
        List_2.setAdapter(arrayAdapter_2);
        String [] ar1 = getResources().getStringArray(R.array.ar_1);
        String [] ar2 = getResources().getStringArray(R.array.ar_2);
        arrayAdapter_1.addAll(ar1);
        arrayAdapter_2.addAll(ar2);

        Et_1 = (EditText) findViewById(R.id.Et_1);
    }

    public void Add_1(View view) {
        arrayAdapter_1.add(Et_1.getText().toString());
    }

    public void Add_2(View view) {
        arrayAdapter_2.add(Et_1.getText().toString());
    }

    public void back(View view) {
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(this, Main.class);
        startActivity(intent);
        finish();
    }
}
