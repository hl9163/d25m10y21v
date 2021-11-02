package com.example.d25m10y21;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] countryList;
    String cityList[];
    int symbols[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] countryList, String[] cityList, int[] symbols) {
        this.context = context;
        this.countryList = countryList;
        this.cityList = cityList;
        this.symbols = symbols;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return cityList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.coustom_spinner, null);
        TextView country = (TextView) view.findViewById(R.id.textViews1);
        TextView city = (TextView) view.findViewById(R.id.textViews1);
        ImageView symbol = (ImageView) view.findViewById(R.id.imageView1);
        country.setText(countryList[i]);
        city.setText(cityList[i]);
        symbol.setImageResource(symbols[i]);
        return view;
    }
}

