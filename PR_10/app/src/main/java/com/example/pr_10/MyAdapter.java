package com.example.pr_10;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

public class MyAdapter extends BaseAdapter {

    private String[] names;

    public MyAdapter (String [] names) {
        this.names = names;
    }

    @Override
    public int getCount() {
        return names.length;

    }

    @Override
    public Object getItem(int position) {
        return names[position];

    }

    @Override
    public long getItemId(int position) {
        return position;

    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        Context context = parent.getContext();

        if(view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_item, parent, false);
        }

        TextView textView = (TextView) view;
        textView.setText(names[position]);

        if(position % 2 == 0) {
            textView.setBackgroundColor(ContextCompat.getColor(context, R.color.pink));
        } else {
            textView.setBackgroundColor(ContextCompat.getColor(context, R.color.green));
        }

        return view;
    }
}
