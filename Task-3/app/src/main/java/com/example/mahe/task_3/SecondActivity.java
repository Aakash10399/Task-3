package com.example.mahe.task_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.Snackbar;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Snackbar.make(findViewById(R.id.coordinatorLayout), getResources().getString(R.string.snacktext), Snackbar.LENGTH_LONG).show();
    }
}
