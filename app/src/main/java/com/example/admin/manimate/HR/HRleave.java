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
import static com.example.admin.manimate.R.id.HRleaveSub;

public class HRleave extends AppCompatActivity {
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

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        final EditText ed1=(EditText)findViewById(HRleaveSub);
        final EditText ed2=(EditText)findViewById(R.id.HRleaveDate);
        final EditText ed3=(EditText)findViewById(R.id.HrleaveDec);
        Button button=(Button)findViewById(R.id.BtHRleaveSub) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String HRleavesub = ed1.getText().toString();
                String HRleavedate = ed2.getText().toString();
                String HRleavedec = ed3.getText().toString();

                if (HRleavesub.isEmpty()) {
                    Toast.makeText(HRleave.this, "UserName can't be empty", Toast.LENGTH_SHORT).show();
                } else if (HRleavedate.isEmpty()) {
                    Toast.makeText(HRleave.this, "Emailid can't be empty", Toast.LENGTH_SHORT).show();

                } else if (HRleavedec.isEmpty()) {
                    Toast.makeText(HRleave.this, "mobile can't be empty", Toast.LENGTH_SHORT).show();


                }
            }


        });
    }
}
