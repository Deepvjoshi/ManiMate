package com.example.admin.manimate.PM;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.manimate.Adptr.BugAdptr;
import com.example.admin.manimate.Adptr.ViewProj;
import com.example.admin.manimate.AsyncTasks.AsyncResponse;
import com.example.admin.manimate.AsyncTasks.WebserviceCall;
import com.example.admin.manimate.DL.DLViewbug;
import com.example.admin.manimate.Helper.Utils;
import com.example.admin.manimate.Model.Post;
import com.example.admin.manimate.Model.ViewBug;
import com.example.admin.manimate.Model.ViewProject;
import com.example.admin.manimate.R;
import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class PMViewproject extends AppCompatActivity {
List<Post> Al=new ArrayList<>();
ListView lsv;
    String ts,tt,ta,am,as;
    ViewProject model;
    String dx;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pmviewproject);
        lsv =(ListView) findViewById(R.id.PMDLVviewpro);

        // ArrayAdapter adapter =new ArrayAdapter<String>(this,R.layout.activity_dlviewbug,bagArray);
        String[] keys = new String[]{"mode", "userId"};
        final String[] values = new String[]{"viewprojects","8" };
        String jsonRequest = Utils.createJsonRequest(keys, values);

        String URL = "http://development.ifuturz.com/core/iflameapi/pms/admin/webservice.php";

        new WebserviceCall(PMViewproject.this, URL, jsonRequest, "Logging in", true, new AsyncResponse() {
            @Override
            public void onCallback(String response) {
                Log.d("appdj", response);
                 model = new Gson().fromJson(response, ViewProject.class);
                Toast.makeText(PMViewproject.this, model.getMessage(), Toast.LENGTH_SHORT).show();


              //  tv.setText(response);
                try {
                    JSONObject root = new JSONObject(response);
                    JSONArray dtl = root.getJSONArray("projectDetail");
                    Log.d("pk", String.valueOf(dtl));
                    for (int i = 0; i < dtl.length(); i++) {

                        JSONObject myobj = dtl.getJSONObject(i);

                        ts = myobj.getString("projectTitle");
                        tt = myobj.getString("projectLanguage");
                        ta = myobj.getString("projectDesc");
                                am = myobj.getString("projectEndDate");
                        as = myobj.getString("projectStatus");
Log.d("deepbhai",ts);
                        Post p = new Post();
                        p.setProT(ts);
                        p.setProL(tt);
                        p.setProdsc(ta);
                        p.setProEd(am);
                        p.setProSt(as);
                        Al.add(p);
                    }
                    } catch(JSONException e){
                        e.printStackTrace();
                    }

                ViewProj asd=new ViewProj( PMViewproject.this,Al);
                lsv.setAdapter(asd);

                }
        }).execute();

    }
}
