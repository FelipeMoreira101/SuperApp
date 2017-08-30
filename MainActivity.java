package com.example.felipe.superapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton calculadora;
    private ImageButton triangulos;
    private ImageButton sobre;
    private ImageButton lampadas;
    private ImageButton cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculadora = (ImageButton) findViewById(R.id.altCalc);
        triangulos  = (ImageButton) findViewById(R.id.altTri);
        sobre       = (ImageButton) findViewById(R.id.altSobre);
        lampadas    = (ImageButton) findViewById(R.id.altLampada);
        cadastro    = (ImageButton) findViewById(R.id.altCadt);

        lampadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, lampada.class);
                startActivity(intent);
            }
        });
        calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, calc.class);
                startActivity(intent);
            }
        });
        triangulos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, triangulo.class);
                startActivity(intent);
            }
        });
        sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, sobre.class);
                startActivity(intent);
            }
        });
        cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, cad.class);
                startActivity(intent);
            }
        });
    }
}
