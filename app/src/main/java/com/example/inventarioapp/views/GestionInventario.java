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

import com.example.inventarioapp.R;

public class GestionInventario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_gestion_inventario);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnVolverDashboard = findViewById(R.id.btnVolverDashboard);
        Button ingresoAPI = findViewById(R.id.btnApiResProveedor);

        //Evento para volver a Dashboard
        btnVolverDashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volverDash = new Intent(GestionInventario.this, Dashboard.class);
                startActivity(volverDash);
            }
        });

        //Evento para ir a ver productos en API
        ingresoAPI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ingresoAlAPI = new Intent(GestionInventario.this, ProveedoresAPI.class);
                startActivity(ingresoAlAPI);
            }
        });
    }
}