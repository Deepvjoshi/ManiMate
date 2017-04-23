package com.example.admin.manimate.HR;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.admin.manimate.R;

public class HRviewjobPost extends AppCompatActivity {
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
        setContentView(R.layout.activity_hrviewjob_post);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        TextView jobtitle=(TextView)findViewById(R.id.hrpostjobtital);
        TextView jobdesc=(TextView)findViewById(R.id.hrpostjobdec);
        TextView jobaval=(TextView)findViewById(R.id.hrpostjobavlable);
    }
}
