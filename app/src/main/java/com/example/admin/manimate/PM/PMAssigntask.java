package com.example.admin.manimate.PM;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.manimate.AsyncTasks.AsyncResponse;
import com.example.admin.manimate.AsyncTasks.WebserviceCall;
import com.example.admin.manimate.Helper.Utils;
import com.example.admin.manimate.Home;
import com.example.admin.manimate.MainActivity;
import com.example.admin.manimate.Model.AssignTask;
import com.example.admin.manimate.Model.Login;
import com.example.admin.manimate.R;
import com.google.gson.Gson;

public class PMAssigntask extends AppCompatActivity {
EditText ed1,ed2,ed3;
    Button btnAs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmassigntask);
        ed1=(EditText)findViewById(R.id.TaskProjectTitle);
        ed2=(EditText)findViewById(R.id.Tasktsk);
        ed3=(EditText)findViewById(R.id.tskDis);
        btnAs=(Button)findViewById(R.id.BtUploatask);
        btnAs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String proti=ed1.getText().toString();
                String task=ed2.getText().toString();
                String disc=ed3.getText().toString();

                 if (proti.isEmpty())
                {
                    Toast.makeText(PMAssigntask.this, "Enter project title", Toast.LENGTH_SHORT).show();
                }
               else if (task.isEmpty())
                {
                    Toast.makeText(PMAssigntask.this, "Enter Task", Toast.LENGTH_SHORT).show();
                }
               else if (disc.isEmpty())
                {
                    Toast.makeText(PMAssigntask.this, "Enter Task Discription", Toast.LENGTH_SHORT).show();
                }
                else {

                     String[] keys = new String[]{"mode", "projectId","taskPriority","lable","taskAssign","taskDiscription","status"};
                     String[] values = new String[]{"taskManagement","2", "high",task,"Devloper",disc,"1"};
                     String jsonRequest = Utils.createJsonRequest(keys, values);



                     String URL = "http://development.ifuturz.com/core/iflameapi/pms/admin/webservice.php";

                     new WebserviceCall(PMAssigntask.this, URL, jsonRequest, "Logging in", true, new AsyncResponse() {
                         @Override
                         public void onCallback(String response) {
                             Log.d("myapp", response);
                             AssignTask model = new Gson().fromJson(response, AssignTask.class);
                             Toast.makeText(PMAssigntask.this, model.getMessage(), Toast.LENGTH_SHORT).show();


                         }
                     }).execute();
                 }
            }
        });


    }
}
