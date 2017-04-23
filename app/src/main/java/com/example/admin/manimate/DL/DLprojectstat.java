package com.example.admin.manimate.DL;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.manimate.R;

public class DLprojectstat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dlprojectstat);



        final EditText ed1 = (EditText) findViewById(R.id.DLprojecttitle);
        final EditText ed2 = (EditText) findViewById(R.id.DLprojectstatus);
        final EditText ed3 = (EditText) findViewById(R.id.DLprojectdec);
        Button button = (Button) findViewById(R.id.BTDlsubmit);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String proTitle = ed1.getText().toString();
                String ProStat = ed2.getText().toString();
                String Prodec = ed3.getText().toString();

                if (proTitle.isEmpty()) {
                    Toast.makeText(DLprojectstat.this, "Project Title can't be empty", Toast.LENGTH_SHORT).show();
                } else if (ProStat.isEmpty()) {
                    Toast.makeText(DLprojectstat.this, "Project Status can't be empty", Toast.LENGTH_SHORT).show();

                } else if (Prodec.isEmpty()) {
                    Toast.makeText(DLprojectstat.this, "Project Description can't be empty", Toast.LENGTH_SHORT).show();


                }
            }
        });
    }
}
