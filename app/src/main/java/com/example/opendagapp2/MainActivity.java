package com.example.opendagapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final Button Agendabutton = findViewById(R.id.AgendaButton);
        Agendabutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AgendaActivity.class));
            }
        });

        final Button OpleidingenButton = findViewById(R.id.OpleidingenButton);
        OpleidingenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OpleidingActivity.class));
            }
        });

        final Button GebouwenButton = findViewById(R.id.GebouwenButton);
        GebouwenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GebouwenActivity.class));
            }
        });
        final Button SettingsButton = findViewById(R.id.SettingsButton);
        SettingsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            }
        });






















    }

    //TesttestJurriaan HIERRRRRRRRR
}
