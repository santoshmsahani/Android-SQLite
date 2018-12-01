package com.example.santosh.attendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button btn;
    EditText uname,pass,u,p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn=(Button) findViewById(R.id.btnlogin);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(uname.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
                {
                    Intent i=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(LoginActivity.this,"Invalid Credential",Toast.LENGTH_LONG).show();
                }


            }
        });

        uname=(EditText) findViewById(R.id.username);
        pass=(EditText) findViewById(R.id.password);














    }
}








