package com.example.admin.manimate.Adptr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.manimate.HR.HRleave;
import com.example.admin.manimate.Model.Lv;
import com.example.admin.manimate.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deep Joshi on 24-04-2017.
 */

public class Lvado extends BaseAdapter {
    List<Lv>all=new ArrayList<>();
Context context;
    public Lvado(Context context, List<Lv> all) {
        this.context=context;
        this.all=all;
    }

    @Override
    public int getCount() {
        return all.size();
    }

    @Override
    public Object getItem(int position) {
        return all.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    static class ViewListHolder {
        TextView ts1,ts2,ts3;
        TextView ts4,ts5;


    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewListHolder listholder = new ViewListHolder();
        if (convertView == null) {

            convertView = LayoutInflater.from(context).inflate(R.layout.hrleave, parent, false);
            listholder.ts1 = (TextView) convertView.findViewById(R.id.hr1);
            listholder.ts2 = (TextView) convertView.findViewById(R.id.hr2);
            listholder.ts3 = (TextView) convertView.findViewById(R.id.hr3);

            convertView.setTag(listholder);
        } else

        {
            listholder = (ViewListHolder) convertView.getTag();
        }
        listholder.ts1.setText(all.get(position).getLvsub());
        listholder.ts2.setText(all.get(position).getLvdate());
        listholder.ts3.setText(all.get(position).getLvdis());



        return convertView;
    }
}