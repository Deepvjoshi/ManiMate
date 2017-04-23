package com.example.admin.manimate.PM;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.manimate.R;

import static com.example.admin.manimate.R.id.PmLeavesubj;

public class PMLeave extends AppCompatActivity {
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
        setContentView(R.layout.activity_pmleave);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        final EditText ed1=(EditText)findViewById(PmLeavesubj);
        final EditText ed2=(EditText)findViewById(R.id.PmLeavedat);
        final EditText ed3=(EditText)findViewById(R.id.PmLeaveDec);
        Button button=(Button)findViewById(R.id.BtPmsubmit) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PMLeavesub = ed1.getText().toString();
                String PMLeavedate = ed2.getText().toString();
                String PMLeavedec = ed3.getText().toString();

                if (PMLeavesub.isEmpty()) {
                    Toast.makeText(PMLeave.this, "UserName can't be empty", Toast.LENGTH_SHORT).show();
                } else if (PMLeavedate.isEmpty()) {
                    Toast.makeText(PMLeave.this, "Emailid can't be empty", Toast.LENGTH_SHORT).show();

                } else if (PMLeavedec.isEmpty()) {
                    Toast.makeText(PMLeave.this, "mobile can't be empty", Toast.LENGTH_SHORT).show();


                }
            }


        });
    }
}
