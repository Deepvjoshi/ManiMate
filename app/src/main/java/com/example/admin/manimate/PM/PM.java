package com.example.admin.manimate.PM;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.admin.manimate.AllFaq;
import com.example.admin.manimate.HR.HR;
import com.example.admin.manimate.HR.HRleave;
import com.example.admin.manimate.R;

public class PM extends AppCompatActivity {
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
        setContentView(R.layout.activity_pm);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        final Button button=(Button)findViewById(R.id.PMviewproject) ;
        final Button button1=(Button)findViewById(R.id.PMpostproject) ;
        final Button button2=(Button)findViewById(R.id.PMclcommunication) ;
        final Button button3=(Button)findViewById(R.id.PMassigntask) ;
        final Button button4=(Button)findViewById(R.id.PMleave) ;
        final Button button5=(Button)findViewById(R.id.PMfaq) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent idf=new Intent(PM.this,PMViewproject.class);
                startActivity(idf);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn1=button1.getText().toString();
                if (strbtn1.isEmpty()){
                    Toast.makeText(PM.this, "Please wait for viewjobpost", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn2=button2.getText().toString();
                if(strbtn2.isEmpty()){
                    Toast.makeText(PM.this, "Please wait for sharejobpost", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idsd=new Intent(PM.this,PMAssigntask.class);
                startActivity(idsd);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn4=button4.getText().toString();
                Intent intent=new Intent(PM.this,PMLeave.class);
                startActivity(intent);
                if (strbtn4.isEmpty()){
                    Toast.makeText(PM.this, "Please Wait for view payroll", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn4=button5.getText().toString();
                Intent intent=new Intent(PM.this,AllFaq.class);
                startActivity(intent);
                if (strbtn4.isEmpty()){
                    Toast.makeText(PM.this, "Please Wait for HR for FAQ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


