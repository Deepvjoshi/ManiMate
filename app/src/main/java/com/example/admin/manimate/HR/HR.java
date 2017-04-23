package com.example.admin.manimate.HR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.admin.manimate.AllFaq;
import com.example.admin.manimate.Home;
import com.example.admin.manimate.PM.PM;
import com.example.admin.manimate.R;

public class HR extends AppCompatActivity {

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
        setContentView(R.layout.activity_hr);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        final Button button=(Button)findViewById(R.id.HRtimeshee) ;
        final Button button1=(Button)findViewById(R.id.HRsharejobpost) ;
        final Button button2=(Button)findViewById(R.id.HRViewjobpost) ;
        final Button button3=(Button)findViewById(R.id.HRviewleave) ;
        final Button button4=(Button)findViewById(R.id.HRpayrole) ;
        final Button button5=(Button)findViewById(R.id.HRfaq) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn=button.getText().toString();
                if (strbtn.isEmpty()){
                    Toast.makeText(HR.this, "Please wait for Time sheet", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn1=button1.getText().toString();
                Intent intent=new Intent(HR.this,HRjobpost.class);
                startActivity(intent);
                if (strbtn1.isEmpty()){
                    Toast.makeText(HR.this, "Please wait for viewjobpost", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn2=button2.getText().toString();
                Intent intent=new Intent(HR.this,HRviewjobPost.class);
                startActivity(intent);
                if(strbtn2.isEmpty()){
                    Toast.makeText(HR.this, "Please wait for sharejobpost", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn3=button3.getText().toString();
                Intent intent=new Intent(HR.this,HRleave.class);
                startActivity(intent);
                if (strbtn3.isEmpty()){
                    Toast.makeText(HR.this, "Please Wait for View Leave", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn4=button4.getText().toString();
                if (strbtn4.isEmpty()){
                    Toast.makeText(HR.this, "Please Wait for view payroll", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn4=button5.getText().toString();
                Intent intent=new Intent(HR.this,AllFaq.class);
                startActivity(intent);
                if (strbtn4.isEmpty()){
                    Toast.makeText(HR.this, "Please Wait for HR for FAQ", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
