package com.example.inventarioapp.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.inventarioapp.MainActivity;
import com.example.inventarioapp.R;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        Button btnConsultas =findViewById(R.id.btnConsults);
        Button btnExit = findViewById(R.id.btnExit);
        Button btnConfiguracion = findViewById(R.id.btnConfiguration);
        Button btnRegistrarPro = findViewById(R.id.btnGestionInventory);

        //Evento para acceder a gestión de inventario
        btnRegistrarPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registrarPro = new Intent(Dashboard.this, GestionInventario.class);
                startActivity(registrarPro);
            }
        });

        //Evento para acceder a consultas
        btnConsultas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent consults = new Intent(Dashboard.this, Consultas.class);
                startActivity(consults);
            }
        });
        //Evento para acceder a configuración
        btnConfiguracion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent config = new Intent(Dashboard.this, Configuracion.class);
                startActivity(config);
            }
        });
        //Evento para salir de la sesión
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(Dashboard.this, MainActivity.class);
                startActivity(login);
            }
        });


    }
}