package com.example.admin.manimate.HR;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.admin.manimate.Adptr.Lvado;
import com.example.admin.manimate.Model.Lv;
import com.example.admin.manimate.R;

import java.util.ArrayList;
import java.util.List;

public class HRleave extends AppCompatActivity {
    List<Lv> all=new ArrayList<>();
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hrleave);
        ListView lw = (ListView) findViewById(R.id.hrlv);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);


        Lv l = new Lv();
        all.add(l);
        Lvado lc = new Lvado(HRleave.this, all);
        lw.setAdapter(lc);


    }
    }

