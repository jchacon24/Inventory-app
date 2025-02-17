package com.example.inventarioapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.inventarioapp.views.CambiarPass;
import com.example.inventarioapp.views.Dashboard;
import com.example.inventarioapp.views.Registro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnAcceder = findViewById(R.id.btnAcceder);
        var tvRecuperarPass = findViewById(R.id.tvRecuperarPass);
        var tvRegistrarse = findViewById(R.id.tvRegistrarse);

        //Evento para recuparar contraseña
        tvRecuperarPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recuperarPass = new Intent(MainActivity.this, CambiarPass.class);
                startActivity(recuperarPass);
            }
        });

        //Evento para ir a registrarse
        tvRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrarUser = new Intent(MainActivity.this, Registro.class);
                startActivity(registrarUser);
            }
        });

        //Evento para iniciar la sesión
        btnAcceder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dashboard = new Intent(MainActivity.this, Dashboard.class);
                startActivity(dashboard);
            }
        });
    }
}