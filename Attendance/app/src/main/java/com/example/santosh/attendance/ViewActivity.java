package com.example.santosh.attendance;

import android.database.Cursor;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewActivity extends AppCompatActivity {
    DatabaseHelper myDb;
    Button btnViewAll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        myDb=new DatabaseHelper(this);
        btnViewAll=(Button)findViewById(R.id.button_viewAll);
        viewAll();
    }
    public void viewAll(){
        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res=myDb.getAllData();
                if(res.getCount()==0) {
                    showMessage("Error!!!", "Nothing Found");
                    return;
                }
                StringBuffer buffer=new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("ID: "+res.getString(0)+"\n");
                    buffer.append("Name: "+res.getString(1)+"\n");
                    buffer.append("Surname: "+res.getString(2)+"\n");
                    buffer.append("Attendance: "+res.getString(3)+"\n\n");
                }
                showMessage("Data",buffer.toString());
            }
        });
    }

    public void showMessage(String title, String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

}
