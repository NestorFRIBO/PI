package com.example.nfb.pi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;

public class Registre extends AppCompatActivity {

    CheckBox chec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registre);
        getSupportActionBar().hide();

        //chec = (CheckBox) findViewById(R.id.ok);

    }
}
