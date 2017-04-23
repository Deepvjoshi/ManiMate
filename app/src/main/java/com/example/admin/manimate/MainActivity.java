package com.example.admin.manimate;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.admin.manimate.AsyncTasks.AsyncResponse;
import com.example.admin.manimate.AsyncTasks.WebserviceCall;
import com.example.admin.manimate.Helper.Utils;
import com.example.admin.manimate.Model.FrPassword;
import com.example.admin.manimate.Model.Login;
import com.example.admin.manimate.Model.SignUp;
import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {
    Button B1;
    EditText ed1, ed2;
    TextView sign, forgot;
    View dialogView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B1 = (Button) findViewById(R.id.login_button);
        ed1 = (EditText) findViewById(R.id.user_name);
        ed2 = (EditText) findViewById(R.id.forgot);
        sign = (TextView) findViewById(R.id.signup);
        forgot = (TextView) findViewById(R.id.forgotv);


        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                String stremail = ed1.getText().toString();
                String strpwd = ed2.getText().toString();



                if (stremail.isEmpty())

                {
                    Toast.makeText(MainActivity.this, "Email cannot be empty!", Toast.LENGTH_SHORT).show();

                } else if (strpwd.isEmpty())

                {
                    Toast.makeText(MainActivity.this, "Password cannot be empty", Toast.LENGTH_SHORT).show();

                } else

                {
                    String[] keys = new String[]{"mode", "emailId","password"};
                    String[] values = new String[]{"login",stremail,strpwd };
                    String jsonRequest = Utils.createJsonRequest(keys, values);

                    String URL = "http://development.ifuturz.com/core/iflameapi/pms/admin/webservice.php";

                    new WebserviceCall(MainActivity.this, URL, jsonRequest, "Logging in", true, new AsyncResponse() {
                        @Override
                        public void onCallback(String response) {
                            Log.d("myapp", response);
                            Login model = new Gson().fromJson(response, Login.class);
                            Toast.makeText(MainActivity.this, model.getMessage(), Toast.LENGTH_SHORT).show();
                            if (model.getStatus() == 1) {
                                Intent intent = new Intent(MainActivity.this, Home.class);

                                startActivity(intent);
                            }

                        }
                    }).execute();

                }

                }


        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Registration.class);
                startActivity(i);
            }
        });
        forgot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//
                showForgotPasswordDialog();
            }
        });
    }


    private void showForgotPasswordDialog() {
        dialogView= LayoutInflater.from(this).inflate(R.layout.dailog_forgot_pwd,null);

        AlertDialog alertDialog=new AlertDialog.Builder(this)
                .setTitle("Email")
                .setView(dialogView)
                .setPositiveButton("Verify", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        handleDialog(dialogView);
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        alertDialog.show();


    }

    private void handleDialog(View dialogView) {
        EditText verifyEmailET = (EditText) dialogView.findViewById(R.id.forgot_et_email);
        String stremaill = verifyEmailET.getText().toString();
        String[] keys = new String[]{"mode","emailId"};
        String[] values = new String[]{"forgotPassword",stremaill};

        String jsonRequest = Utils.createJsonRequest(keys, values);

       // String jsonRequest = String.valueOf(object);
//        String URL = "http://development.ifuturz.com/core/FLAT_TEST/stone_galary/admin/webservice.php";
        String URL = "http://development.ifuturz.com/core/iflameapi/pms/admin/webservice.php";
        new WebserviceCall(MainActivity.this, URL, jsonRequest, "Send Email...", true,new AsyncResponse() {
            @Override
            public void onCallback(String response) {
               FrPassword model = new Gson().fromJson(response,FrPassword.class);
             if(model.getStatus() == 1) {
               Toast.makeText(MainActivity.this,  model.getMessage(), Toast.LENGTH_SHORT).show();
              }
            }

        }).execute();
    }
}


