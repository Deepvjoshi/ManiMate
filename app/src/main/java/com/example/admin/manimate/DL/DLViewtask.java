package com.example.admin.manimate.DL;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;

import com.example.admin.manimate.Adptr.ViewTask;
import com.example.admin.manimate.AsyncTasks.AsyncResponse;
import com.example.admin.manimate.AsyncTasks.WebserviceCall;
import com.example.admin.manimate.Helper.Utils;
import com.example.admin.manimate.Home;
import com.example.admin.manimate.MainActivity;
import com.example.admin.manimate.Model.Login;
import com.example.admin.manimate.Model.ViewTasks;
import com.example.admin.manimate.R;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class DLViewtask extends AppCompatActivity {
ListView lw;
    List<ViewTasks.TaskDetailBean> Lists=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dlviewtask);
        lw=(ListView)findViewById(R.id.TaskList);

        String[] keys = new String[]{"mode", "userId"};
        String[] values = new String[]{"viewTask","8"};
        String jsonRequest = Utils.createJsonRequest(keys, values);

        String URL = "http://development.ifuturz.com/core/iflameapi/pms/admin/webservice.php";

        new WebserviceCall(DLViewtask.this, URL, jsonRequest, "Logging in", true, new AsyncResponse() {
            @Override
            public void onCallback(String response) {
                Log.d("my", response);
                ViewTasks model = new Gson().fromJson(response, ViewTasks.class);
                Toast.makeText(DLViewtask.this, model.getMessage(), Toast.LENGTH_SHORT).show();


            }
        }).execute();
        ViewTask adptr=new ViewTask(this,Lists);
        lw.setAdapter(adptr);
    }
}
