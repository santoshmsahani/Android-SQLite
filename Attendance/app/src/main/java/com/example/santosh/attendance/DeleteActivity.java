package com.example.santosh.attendance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteActivity extends AppCompatActivity {


    Button btnDelete;
    EditText editTextID;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        myDb=new DatabaseHelper(this);
        editTextID=(EditText)findViewById(R.id.editText_id);
        btnDelete=(Button) findViewById(R.id.button_Delete);
        DeleteData();
    }

    public void DeleteData(){

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer deleteRows=myDb.deleteData(editTextID.getText().toString());
                if(deleteRows>0){
                    Toast.makeText(DeleteActivity.this,"Data Successfully Deleted",Toast.LENGTH_LONG).show();

                }
                else
                {
                    Toast.makeText(DeleteActivity.this,"Data Not Deleted",Toast.LENGTH_LONG).show();
                }
            }
        });
















    }
}
