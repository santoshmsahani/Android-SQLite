package com.example.santosh.attendance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView add,view,update,delete;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=(CardView)findViewById(R.id.Add);
        view=(CardView)findViewById(R.id.View);
        update=(CardView)findViewById(R.id.Update);
        delete=(CardView)findViewById(R.id.Delete);
        add.setOnClickListener(this);
        view.setOnClickListener(this);
        update.setOnClickListener(this);
        delete.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.Add: i=new Intent(this,AddActivity.class);startActivity(i);break;
            case R.id.View: i=new Intent(this,ViewActivity.class);startActivity(i);break;
            case R.id.Update: i=new Intent(this,UpdateActivity.class);startActivity(i);break;
            case R.id.Delete: i=new Intent(this,DeleteActivity.class);startActivity(i);break;
            default:break;

        }

    }
}














