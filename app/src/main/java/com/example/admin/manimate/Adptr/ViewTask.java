package com.example.admin.manimate.Adptr;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.admin.manimate.Model.ViewTasks;
import com.example.admin.manimate.R;

import java.util.List;

/**
 * Created by Deep Joshi on 14-04-2017.
 */

public class ViewTask extends BaseAdapter {
    Context countext;
    List<ViewTasks.TaskDetailBean> Lists;

    public ViewTask(Context context, List<ViewTasks.TaskDetailBean> lists) {
        this.countext = context;
        this.Lists = lists;
    }

    @Override
    public int getCount() {
        return Lists.size();
    }

    @Override
    public Object getItem(int position) {
        return Lists.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    static class ViewListHolder {
        TextView ts1,ts2,ts3;


    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewListHolder listholder = new ViewListHolder();
        if (convertView == null) {

            convertView = LayoutInflater.from(countext).inflate(R.layout.taskraw, parent, false);
            listholder.ts1 = (TextView) convertView.findViewById(R.id.TaskNam);
            listholder.ts2 = (TextView) convertView.findViewById(R.id.TaskPrio);
            listholder.ts3 = (TextView) convertView.findViewById(R.id.TaskDis);

            convertView.setTag(listholder);
        } else

        {
            listholder = (ViewListHolder) convertView.getTag();
        }
        listholder.ts1.setText(Lists.get(position).getLable());
        listholder.ts2.setText(Lists.get(position).getTaskPriority());
        listholder.ts3.setText(Lists.get(position).getTaskDiscription());


        return convertView;
    }
}