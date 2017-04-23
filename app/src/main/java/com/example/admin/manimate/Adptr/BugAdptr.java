package com.example.admin.manimate.Adptr;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.manimate.DL.DLViewbug;
import com.example.admin.manimate.Model.Bug;
import com.example.admin.manimate.Model.ViewBug;
import com.example.admin.manimate.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Deep Joshi on 14-04-2017.
 */

public class BugAdptr extends BaseAdapter {
    List<Bug> vb=new ArrayList<>();
    Context context;
    public BugAdptr(Context context, List<Bug> vb) {
        this.context=context;
        this.vb=vb;
    }

    @Override
    public int getCount() {
        return vb.size();
    }

    @Override
    public Object getItem(int position) {
        return vb.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    static class ViewListHolder{
        TextView bg1,bg2,bg3,bg4,bg5;


    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewListHolder listholder = new ViewListHolder();
        if (convertView == null){

            convertView = LayoutInflater.from(context).inflate(R.layout.viewbug,parent,false);
            listholder.bg1 = (TextView)convertView.findViewById(R.id.bug);
            listholder.bg2 = (TextView)convertView.findViewById(R.id.bug2);
            listholder.bg3 = (TextView)convertView.findViewById(R.id.bug3);
            listholder.bg4 = (TextView)convertView.findViewById(R.id.bug4);
            listholder.bg5 = (TextView)convertView.findViewById(R.id.bug5);

            convertView.setTag(listholder);
        }else

        {
            listholder = (ViewListHolder)convertView.getTag();
        }


listholder.bg1.setText(vb.get(position).getBugProid());
        listholder.bg2.setText(vb.get(position).getBugtyp());
        listholder.bg3.setText(vb.get(position).getBugname());
        listholder.bg4.setText(vb.get(position).getBugdis());
        listholder.bg5.setText(vb.get(position).getBugasn());

        return convertView;
    }
}
