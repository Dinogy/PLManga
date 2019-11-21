package com.example.duan_pro1211_dungntph08210_lan1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class GridviewAdapter extends BaseAdapter {
    private Context context;
    private String[] chap;
    private String[] tentruyen;
    private int[] hinhturyen;

    public GridviewAdapter(Context context, String[] chap, String[] tentruyen, int[] hinhturyen) {
        this.context = context;
        this.chap = chap;
        this.tentruyen = tentruyen;
        this.hinhturyen = hinhturyen;
    }

    @Override
    public int getCount() {
        return tentruyen.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView =layoutInflater.inflate(R.layout.gridview,null);
        TextView textView=convertView.findViewById(R.id.tvgrid1);
        TextView textView2=convertView.findViewById(R.id.tvgrid2);
        ImageView imageView=convertView.findViewById(R.id.imggrid);


        textView.setText(chap[position]);
        textView2.setText(tentruyen[position]);
        imageView.setImageResource(hinhturyen[position]);

        return convertView;
    }
}
