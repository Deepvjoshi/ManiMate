package com.example.admin.manimate.DL;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.manimate.Adptr.BugAdptr;
import com.example.admin.manimate.Adptr.ViewProj;
import com.example.admin.manimate.AsyncTasks.AsyncResponse;
import com.example.admin.manimate.AsyncTasks.WebserviceCall;
import com.example.admin.manimate.Helper.Utils;
import com.example.admin.manimate.Home;
import com.example.admin.manimate.MainActivity;
import com.example.admin.manimate.Model.Bug;
import com.example.admin.manimate.Model.Login;
import com.example.admin.manimate.Model.Post;
import com.example.admin.manimate.Model.ViewBug;
import com.example.admin.manimate.PM.PMViewproject;
import com.example.admin.manimate.R;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class DLViewbug extends AppCompatActivity {
    String ts,tt,ta,am,as;

   List<Bug>vb=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dlviewbug);

       // ArrayAdapter adapter =new ArrayAdapter<String>(this,R.layout.activity_dlviewbug,bagArray);
        String[] keys = new String[]{"mode", "userId"};
        String[] values = new String[]{"viewBug","2" };
        String jsonRequest = Utils.createJsonRequest(keys, values);

        String URL = "http://development.ifuturz.com/core/iflameapi/pms/admin/webservice.php";

        new WebserviceCall(DLViewbug.this, URL, jsonRequest, "Logging in", true, new AsyncResponse() {
            @Override
            public void onCallback(String response) {
                Log.d("app", response);
                ViewBug model = new Gson().fromJson(response, ViewBug.class);
                Toast.makeText(DLViewbug.this, model.getMessage(), Toast.LENGTH_SHORT).show();

                    ListView listView =(ListView) findViewById(R.id.LvDLViewbag);

                try {
                    JSONObject root = new JSONObject(response);
                    JSONArray dtl = root.getJSONArray("Bug Detail");
                    Log.d("pk", String.valueOf(dtl));
                    for (int i = 0; i < dtl.length(); i++) {

                        JSONObject myobj = dtl.getJSONObject(i);

                        ts = myobj.getString("projectId");
                        tt = myobj.getString("bugTypes");
                        ta = myobj.getString("bugName");
                        am = myobj.getString("bugDesc");
                        as = myobj.getString("notify");
                        Log.d("deepbhai",ts);
                        Bug p = new Bug();
                        p.setBugProid(ts);
                        p.setBugtyp(tt);
                        p.setBugname(ta);
                        p.setBugdis(am);
                        p.setBugasn(as);
                        vb.add(p);
                    }
                } catch(JSONException e){
                    e.printStackTrace();
                }

                BugAdptr bat=new BugAdptr(DLViewbug.this,vb);
                listView.setAdapter(bat);

            }
        }).execute();


    }
}
