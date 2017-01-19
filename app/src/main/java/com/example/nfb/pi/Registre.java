package com.example.nfb.pi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class Registre extends AppCompatActivity {

    CheckBox chec;
    Button registro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registre);
        getSupportActionBar().hide();

        chec = (CheckBox) findViewById(R.id.checkBox);
        registro = (Button) findViewById(R.id.btnRegis);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Inici.class);
                if (chec.isChecked()){
                    startActivity(i);

                }
            }
        });

    }
}
