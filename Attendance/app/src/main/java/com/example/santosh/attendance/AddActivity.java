package com.example.santosh.attendance;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {

    DatabaseHelper myDb;
    EditText editName, editSurname, editAttend;
    Button btnAddData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        myDb=new DatabaseHelper(this);

        editName=(EditText)findViewById(R.id.editText_name);
        editSurname=(EditText)findViewById(R.id.editText_surname);
        editAttend=(EditText)findViewById(R.id.editText_attendance);
        btnAddData=(Button)findViewById(R.id.button_Add);

        AddData();
    }


    public void AddData(){
        btnAddData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isInserted=myDb.insertData(editName.getText().toString(),editSurname.getText().toString(),editAttend.getText().toString());
                if(isInserted==true)
                    Toast.makeText(AddActivity.this,"Data Inserted",Toast.LENGTH_LONG).show();
            }
        });
    }

















}
