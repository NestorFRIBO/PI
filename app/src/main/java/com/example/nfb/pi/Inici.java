package com.example.nfb.pi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inici extends AppCompatActivity {

    Button Entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inici);
        getSupportActionBar().hide();

        Entrar= (Button) findViewById(R.id.Registrar);

        Entrar.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent pasar = new Intent(getApplicationContext(), Registre.class);
                startActivity(pasar);
            }
        });
    }
}
