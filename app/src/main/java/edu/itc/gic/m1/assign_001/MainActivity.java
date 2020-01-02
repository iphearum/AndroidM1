package edu.itc.gic.m1.assign_001;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView lblD;
    private EditText txtMess;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMess = findViewById(R.id.txtSend);
        lblD = findViewById(R.id.lblbackMessage);


    }

    public void SendMessage(View view) {
        String mes = txtMess.getText().toString();
        if(mes.isEmpty()==true)
            return;
        Intent in = new Intent(MainActivity.this,messageActivity.class);
        in.putExtra("mess",mes);
        startActivityForResult(in,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        assert data!=null;

        if (resultCode == RESULT_OK) {
            if (requestCode == 1 && data!=null) {
                assert data!=null;
                lblD.setText(data.getStringExtra("A"));
            }
        }
    }


    public void SendObject(View view) {

        Intent in = new Intent(MainActivity.this,formSendMessage.class);
        try {
            //startActivityForResult(in,2);
            startActivity(in);
        }catch (Exception exo){
            Toast.makeText(this, exo.toString(), Toast.LENGTH_SHORT).show();
        }
        //madeMessage msg = new madeMessage();
    }
}
