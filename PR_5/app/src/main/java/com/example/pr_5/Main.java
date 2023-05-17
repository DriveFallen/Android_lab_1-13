package com.example.pr_5;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class Main extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ArrayAdapter<String> arrAdapt_1;
    private ListView Lv_1;
    private EditText Et_1;
    private Button Bt_1, Bt_2, Bt_3, Bt_4;
    int posItem = -1;
    private View curView = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);

        Et_1 = (EditText) findViewById(R.id.text_1);
        Bt_1 = (Button) findViewById(R.id.bt_1);
        Bt_2 = (Button) findViewById(R.id.bt_2);
        Bt_3 = (Button) findViewById(R.id.bt_3);
        Bt_4 = (Button) findViewById(R.id.bt_4);

        arrAdapt_1 = new ArrayAdapter<String>(this, R.layout.le);
        Lv_1 = (ListView) findViewById(R.id.list_1);
        Lv_1.setAdapter(arrAdapt_1);
        arrAdapt_1.add("First");
        arrAdapt_1.add("Second");
        Lv_1.setOnItemClickListener(this);

        Bt_2.setEnabled(true);
        Bt_3.setEnabled(true);
    }

    public void Add (View view) {
        arrAdapt_1.add(Et_1.getText().toString());
    }

    public void onItemClick (AdapterView<?> parent, View view, int position, long id) {
        TextView textView = (TextView) view;
        Et_1.setText(textView.getText().toString());
        view.setBackgroundColor(getResources().getColor(R.color.pink_2));

        if(curView != null) {
            curView.setBackgroundColor(ContextCompat.getColor(this, R.color.pink));
        }

        curView = view;
        posItem = position;
        Bt_2.setEnabled(true);
        Bt_3.setEnabled(true);
    }

    public void Edit (View view) {
        if(curView != null) {
            if(posItem >= 0) {
                String str = arrAdapt_1.getItem(posItem);
                arrAdapt_1.remove(str);
                arrAdapt_1.insert(Et_1.getText().toString(),posItem);
                posItem = -1;
                curView.setBackgroundColor(ContextCompat.getColor(this, R.color.pink));
                curView = null;
                Et_1.setText("");
            }
        }
        Bt_2.setEnabled(true);
        Bt_3.setEnabled(true);
    }

    public void Del (View view) {
        if(posItem >= 0) {
            String str = arrAdapt_1.getItem(posItem);
            arrAdapt_1.remove(str);
            posItem = -1;
            curView.setBackgroundColor(ContextCompat.getColor(this, R.color.pink));
            curView = null;
            Et_1.setText("");
        }
    }

    public void Clear (View view) {
        arrAdapt_1.clear();
    }
}
