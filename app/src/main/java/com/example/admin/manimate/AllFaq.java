package com.example.admin.manimate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AllFaq extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_faq);

        final TextView que1=(TextView)findViewById(R.id.TVque1);
        TextView que2=(TextView)findViewById(R.id.TVque2);
        TextView que3=(TextView)findViewById(R.id.TVque3);
        TextView que4=(TextView)findViewById(R.id.TVque4);
        TextView que5=(TextView)findViewById(R.id.TVque5);
        TextView que6=(TextView)findViewById(R.id.TVque6);
        EditText any=(EditText) findViewById(R.id.ETother);
        Button bt1=(Button)findViewById(R.id.BTFaq);
    }
}
