package com.example.santosh.attendance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateActivity extends AppCompatActivity {

    EditText editTextID;
    DatabaseHelper myDb;
    Button tbtnViewUpdate;
    EditText editName, editSurname, editAttend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        tbtnViewUpdate=(Button) findViewById(R.id.button_Update);
        editTextID =(EditText) findViewById(R.id.editText_id);
        myDb=new DatabaseHelper(this);
        editName=(EditText)findViewById(R.id.editText_name);
        editSurname=(EditText)findViewById(R.id.editText_surname);
        editAttend=(EditText)findViewById(R.id.editText_attendance);

        UpdateData();

    }

    public void UpdateData(){
        tbtnViewUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isUpdate=myDb.updateData(editTextID.getText().toString(),editName.getText().toString(),editSurname.getText().toString(),editAttend.getText().toString());
                if(isUpdate==true){
                    Toast.makeText(UpdateActivity.this,"Data Updated",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(UpdateActivity.this,"Data Not Updated",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}




















