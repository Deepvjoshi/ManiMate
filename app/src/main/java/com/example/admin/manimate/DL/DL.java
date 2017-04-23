package com.example.admin.manimate.DL;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.admin.manimate.AllFaq;
import com.example.admin.manimate.FAQ;
import com.example.admin.manimate.R;

public class DL extends AppCompatActivity {

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
        setContentView(R.layout.activity_dl);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowCustomEnabled(true);

        final Button button=(Button)findViewById(R.id.Dlviewtask) ;
        final Button button1=(Button)findViewById(R.id.DLviewbag) ;
        final Button button2=(Button)findViewById(R.id.Dlrepprojectstatus) ;
        final Button button3=(Button)findViewById(R.id.DLviewleave) ;
        final Button button4=(Button)findViewById(R.id.DLfaq) ;


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent iddf=new Intent(DL.this,DLViewtask.class);
                startActivity(iddf);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iddf=new Intent(DL.this,DLViewbug.class);
                startActivity(iddf);}
            });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn2=button2.getText().toString();
                Intent intent=new Intent(DL.this,DLprojectstat.class);
                startActivity(intent);
                if(strbtn2.isEmpty()){
                    Toast.makeText(DL.this, "Please wait for Report project status", Toast.LENGTH_SHORT).show();
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn3=button3.getText().toString();
                Intent intent=new Intent(DL.this,DLleave.class);
                startActivity(intent);
                if (strbtn3.isEmpty()){
                    Toast.makeText(DL.this, "Please Wait for View Leave", Toast.LENGTH_SHORT).show();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strbtn3=button3.getText().toString();
                Intent intent=new Intent(DL.this,AllFaq.class);
                startActivity(intent);
                if (strbtn3.isEmpty()){
                    Toast.makeText(DL.this, "Please Wait for View Faq", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
