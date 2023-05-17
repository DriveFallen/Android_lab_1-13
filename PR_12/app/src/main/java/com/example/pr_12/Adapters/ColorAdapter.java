package com.example.pr_12.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pr_12.R;

public class ColorAdapter extends BaseAdapter {
    private String[] arrNameColor;
    private int[] arrColorNum;

    public ColorAdapter(String[] arrNameColor, int[] arrColorNum) {
        this.arrNameColor = arrNameColor; this.arrColorNum = arrColorNum;
    }

    @Override
    public int getCount() {
        return arrNameColor.length;
    }

    @Override
    public Object getItem(int position) {
        return arrColorNum[position];
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
            view = inflater.inflate(R.layout.one_item, parent,false);
        }

        TextView textView = (TextView) view;
        textView.setText(arrNameColor[position]);
        textView.setBackgroundColor(arrColorNum[position]);

        return view;
    }
}