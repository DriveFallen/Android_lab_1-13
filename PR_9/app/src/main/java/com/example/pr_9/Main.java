package com.example.pr_9;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.security.Key;

public class Main extends AppCompatActivity {

    private EditText Key_1, Key_2, Key_3, Value_1, Value_2, Value_3;
    private SharedPreferences preferences;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        preferences = getSharedPreferences(getString(R.string.preferences), MODE_PRIVATE);
        Key_1 = (EditText) findViewById(R.id.Key_1);
        Key_2 = (EditText) findViewById(R.id.Key_2);
        Key_3 = (EditText) findViewById(R.id.Key_3);
        Value_1 = (EditText) findViewById(R.id.Value_1);
        Value_2 = (EditText) findViewById(R.id.Value_2);
        Value_3 = (EditText) findViewById(R.id.Value_3);
    }

    @Override
    protected void onResume() {
        super.onResume();

        String Key_1_text = getString(R.string.Key_1);
        if (preferences.contains(Key_1_text)) {
            Value_1.setText(preferences.getString(Key_1_text, "NULL"));
        }

        String Key_2_text = getString(R.string.Key_2);
        if (preferences.contains(Key_2_text)) {
            Value_2.setText(preferences.getString(Key_2_text, "NULL"));
        }

        String Key_3_text = getString(R.string.Key_3);
        if (preferences.contains(Key_3_text)) {
            Value_3.setText(String.valueOf(preferences.getInt(Key_3_text, 0)));
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        SharedPreferences.Editor editor = preferences.edit();

        String save = Value_1.getText().toString();
        editor.putString(getString(R.string.Key_1), save);

        save = Value_2.getText().toString();
        editor.putString(getString(R.string.Key_2), save);

        int save_int = Integer.valueOf(Value_3.getText().toString());
        editor.putInt(getString(R.string.Key_3), save_int);

        editor.commit();
    }
}
