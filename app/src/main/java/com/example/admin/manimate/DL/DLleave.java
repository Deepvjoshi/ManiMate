package com.example.admin.manimate.DL;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.admin.manimate.PM.PMLeave;
import com.example.admin.manimate.R;

import static com.example.admin.manimate.R.id.PmLeavesubj;

public class DLleave extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dlleave);



        final EditText ed1=(EditText)findViewById(R.id.DLleaveSub);
        final EditText ed2=(EditText)findViewById(R.id.DLlevedate);
        final EditText ed3=(EditText)findViewById(R.id.DLleaveDec);
        Button button=(Button)findViewById(R.id.BTDLsub) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PMLeavesub = ed1.getText().toString();
                String PMLeavedate = ed2.getText().toString();
                String PMLeavedec = ed3.getText().toString();

                if (PMLeavesub.isEmpty()) {
                    Toast.makeText(DLleave.this, "Leave subject can't be empty", Toast.LENGTH_SHORT).show();
                } else if (PMLeavedate.isEmpty()) {
                    Toast.makeText(DLleave.this, "Leave Date can't be empty", Toast.LENGTH_SHORT).show();

                } else if (PMLeavedec.isEmpty()) {
                    Toast.makeText(DLleave.this, "Leave Descprition can't be empty", Toast.LENGTH_SHORT).show();


                }
            }


        });
    }
}
