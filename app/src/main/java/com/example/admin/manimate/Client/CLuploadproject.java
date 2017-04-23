package com.example.admin.manimate.Client;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.manimate.AsyncTasks.AsyncResponse;
import com.example.admin.manimate.AsyncTasks.WebserviceCall;
import com.example.admin.manimate.Helper.Utils;
import com.example.admin.manimate.Home;
import com.example.admin.manimate.MainActivity;
import com.example.admin.manimate.Model.Login;
import com.example.admin.manimate.Model.UpldPro;
import com.example.admin.manimate.R;
import com.google.gson.Gson;

import static com.example.admin.manimate.R.id.ClProjectTitle;

public class CLuploadproject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cluploadproject);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        final EditText ed1 = (EditText) findViewById(ClProjectTitle);
        final EditText ed2 = (EditText) findViewById(R.id.ClprojectDec);
        final EditText ed3 = (EditText) findViewById(R.id.CLprojectDure);
        final EditText ed4=(EditText)findViewById(R.id.CLprojectleg) ;
        Button button = (Button) findViewById(R.id.BtUploadpro);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String JobTitle = ed1.getText().toString();
                String JobDec = ed2.getText().toString();
                String JobAvavi = ed3.getText().toString();
                String proleg = ed4.getText().toString();

                if (JobTitle.isEmpty()) {
                    Toast.makeText(CLuploadproject.this, "Project Title can't be empty", Toast.LENGTH_SHORT).show();
                } else if (JobDec.isEmpty()) {
                    Toast.makeText(CLuploadproject.this, "Bag Descpritio can't be empty", Toast.LENGTH_SHORT).show();

                } else if (JobAvavi.isEmpty()) {
                    Toast.makeText(CLuploadproject.this, "Project Duretion can't be empty", Toast.LENGTH_SHORT).show();
                }else if (proleg.isEmpty()) {
                    Toast.makeText(CLuploadproject.this, "Project Duretion can't be empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    String[] keys = new String[]{"mode", "userId","clientUserId","projectTitle","projectLanguage","projectDesc","projectStartDate","projectEndDate","developerUserId"};
                    String[] values = new String[]{"postnewproject","8","8" ,JobTitle,proleg,JobDec,"15/4/17",JobAvavi,"8"};
                    String jsonRequest = Utils.createJsonRequest(keys, values);

                    String URL = "http://development.ifuturz.com/core/iflameapi/pms/admin/webservice.php";

                    new WebserviceCall(CLuploadproject.this, URL, jsonRequest, "Logging in", true, new AsyncResponse() {
                        @Override
                        public void onCallback(String response) {
                            Log.d("myapp", response);
                            UpldPro model = new Gson().fromJson(response, UpldPro.class);
                            Toast.makeText(CLuploadproject.this, model.getMessage(), Toast.LENGTH_SHORT).show();


                        }
                    }).execute();


                }
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==android.R.id.home)
        {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
}
