package com.example.admin.manimate.Client;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.manimate.AsyncTasks.AsyncResponse;
import com.example.admin.manimate.AsyncTasks.WebserviceCall;
import com.example.admin.manimate.Helper.Utils;
import com.example.admin.manimate.Home;
import com.example.admin.manimate.MainActivity;
import com.example.admin.manimate.Model.Login;
import com.example.admin.manimate.Model.ProSts;
import com.example.admin.manimate.R;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class CLprojectstatus extends AppCompatActivity {
    ProSts model;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clprojectstatus);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        final TextView protitle=(TextView)findViewById(R.id.CLPROJECTtitle);
        TextView jobdesc=(TextView)findViewById(R.id.CLTstatus);
        TextView jobaval=(TextView)findViewById(R.id.CLPROJECTdisc);

        String[] keys = new String[]{"mode", "userId","projectId"};
        String[] values = new String[]{"viewprojectstatus","8","8" };
        String jsonRequest = Utils.createJsonRequest(keys, values);

        String URL = "http://development.ifuturz.com/core/iflameapi/pms/admin/webservice.php";

        new WebserviceCall(CLprojectstatus.this, URL, jsonRequest, "Logging in", true, new AsyncResponse() {
            @Override
            public void onCallback(String response) {
                Log.d("mpp", response);
                 model = new Gson().fromJson(response, ProSts.class);
                Toast.makeText(CLprojectstatus.this, "Done Project stats", Toast.LENGTH_SHORT).show();
            }
        }).execute();
        List<ProSts.ProjectStatusBean>list=new ArrayList<ProSts.ProjectStatusBean>();

      //  jobdesc.setText(model.getStatus());
    }
}
