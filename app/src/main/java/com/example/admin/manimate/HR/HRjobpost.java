package com.example.admin.manimate.HR;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.manimate.R;

import static com.example.admin.manimate.R.id.HRJobtital;

public class HRjobpost extends AppCompatActivity {

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
        setContentView(R.layout.activity_hrjobpost);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        final EditText ed1=(EditText)findViewById(HRJobtital);
        final EditText ed2=(EditText)findViewById(R.id.HRjobdec);
        final EditText ed3=(EditText)findViewById(R.id.HRjobAveb);
        Button button=(Button)findViewById(R.id.BTHRjobpost) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String JobTitle = ed1.getText().toString();
                String JobDec = ed2.getText().toString();
                String JobAvavi = ed3.getText().toString();

                if (JobTitle.isEmpty()) {
                    Toast.makeText(HRjobpost.this, "UserName can't be empty", Toast.LENGTH_SHORT).show();
                } else if (JobDec.isEmpty()) {
                    Toast.makeText(HRjobpost.this, "Emailid can't be empty", Toast.LENGTH_SHORT).show();

                } else if (JobAvavi.isEmpty()) {
                    Toast.makeText(HRjobpost.this, "mobile can't be empty", Toast.LENGTH_SHORT).show();


                }
            }


        });

    }
}
