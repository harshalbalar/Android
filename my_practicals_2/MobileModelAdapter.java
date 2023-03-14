package com.example.my_practicals_2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MobileModelAdapter extends ArrayAdapter<myCustomelist> {
    private Context context;
    private int layoutResourceId;
    private myCustomelist[] data;

    public MobileModelAdapter(Context context, int layoutResourceId, myCustomelist[] data) {
        super(context, layoutResourceId, data);
        this.context = context;
        this.layoutResourceId = layoutResourceId;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        MobileModelHolder holder;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);

            holder = new MobileModelHolder();
            holder.imageView = row.findViewById(R.id.imageView);
            holder.textView = row.findViewById(R.id.textView);

            row.setTag(holder);
        } else {
            holder = (MobileModelHolder) row.getTag();
        }

        myCustomelist mobileModel = data[position];
        holder.textView.setText(mobileModel.getName());
        holder.imageView.setImageResource(mobileModel.getImage());

        return row;
    }

    static class MobileModelHolder {
        ImageView imageView;
        TextView textView;
    }
}