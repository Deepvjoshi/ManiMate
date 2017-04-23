package com.example.admin.manimate.Adptr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.manimate.AsyncTasks.AsyncResponse;
import com.example.admin.manimate.Model.Post;
import com.example.admin.manimate.Model.ViewProject;
import com.example.admin.manimate.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deep Joshi on 22-04-2017.
 */

public class ViewProj extends BaseAdapter {

    Context context;
    List<Post> Al=new ArrayList<>();
    public ViewProj(Context context, List<Post> al) {

   this.context=context;
        this.Al=al;

    }

    @Override
    public int getCount() {
        return Al.size();
    }

    @Override
    public Object getItem(int position) {
        return Al.get(position);
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

            convertView = LayoutInflater.from(context).inflate(R.layout.raw_viewproj, parent, false);
            listholder.ts1 = (TextView) convertView.findViewById(R.id.textView_viewproj);
            listholder.ts2 = (TextView) convertView.findViewById(R.id.textView2_viewprojt);
            listholder.ts3 = (TextView) convertView.findViewById(R.id.textView3_viewprojt);
            listholder.ts4 = (TextView) convertView.findViewById(R.id.textView4_viewprojt);
            listholder.ts5 = (TextView) convertView.findViewById(R.id.textView5_viewprojt);

            convertView.setTag(listholder);
        } else

        {
            listholder = (ViewListHolder) convertView.getTag();
        }
        listholder.ts1.setText(Al.get(position).getProT());
        listholder.ts2.setText(Al.get(position).getProL());
        listholder.ts3.setText(Al.get(position).getProEd());
        listholder.ts4.setText(Al.get(position).getProdsc());
        listholder.ts5.setText(Al.get(position).getProSt());


        return convertView;
    }
}
