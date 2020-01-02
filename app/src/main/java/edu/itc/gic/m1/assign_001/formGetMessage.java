package edu.itc.gic.m1.assign_001;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class formGetMessage extends AppCompatActivity {
    private TextView lmail;
    private ActionBar abc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_object);
        lmail = findViewById(R.id.lblMail);

        abc = getSupportActionBar();
        abc.setDisplayShowHomeEnabled(true);
        abc.setTitle("Data was Get");
        abc.setDisplayHomeAsUpEnabled(true);


        try {
            Intent in = getIntent();
            madeMessage model = (madeMessage)in.getSerializableExtra("Mes");
            String strmessage = "Message Time : " + model.getDate()
                    + "\n Topic " + model.getTitle()+
                    "\n "+model.getMessate();
            lmail.setText(strmessage);
        }catch (Exception exp){Msg(exp.toString());}
    }

    public void Msg(String sq){
        Toast.makeText(this, sq, Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
