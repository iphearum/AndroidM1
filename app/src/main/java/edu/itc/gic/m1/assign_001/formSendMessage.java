package edu.itc.gic.m1.assign_001;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import java.util.Date;


public class formSendMessage extends AppCompatActivity {
    private ActionBar actionbar;
    private EditText tTo, tTitle,tMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_obj_message);
        actionbar = getSupportActionBar();

        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setDisplayShowHomeEnabled(true);
        actionbar.setTitle("Get dataSend object");


        tTo = findViewById(R.id.txtTitle);
        tTitle = findViewById(R.id.txtTitle);
        tMessage = findViewById(R.id.txtMess);

    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void seObject(View view) {
        Date d = new Date();

        String to = tTo.getText().toString();
        String ti = tTitle.getText().toString();
        String tm = tMessage.getText().toString();

        if(to.isEmpty()==true || ti.isEmpty() == true || tm.isEmpty()==true){
            return ;
        }
        Intent in = new Intent(formSendMessage.this,formGetMessage.class);
        madeMessage md = new madeMessage(to,ti,tm,d);
        in.putExtra("Mes",md);
        startActivity(in);
        finish();
    }
}
