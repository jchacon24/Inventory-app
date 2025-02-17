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

public class ProveedoresAPI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_proveedores_api);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button volverGestionInv = findViewById(R.id.btnVolverGestionInventario);

        //Evento para volver a gestión inventario
        volverGestionInv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volverDashGestionInv = new Intent(ProveedoresAPI.this, GestionInventario.class);
                startActivity(volverDashGestionInv);
            }
        });
    }
}