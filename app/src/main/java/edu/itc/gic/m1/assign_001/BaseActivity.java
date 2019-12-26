package edu.itc.gic.m1.assign_001;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


public class BaseActivity extends AppCompatActivity {
    ActionBar abar;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        abar = getSupportActionBar();
        abar.setDisplayShowHomeEnabled(true);
        abar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId()== android.R.id.home)
        {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void setTitle(int titleId) {
         abar.setTitle(titleId);
    }

    @Override
    public void setTitle(CharSequence title) {
        abar.setTitle(title);
    }

}
