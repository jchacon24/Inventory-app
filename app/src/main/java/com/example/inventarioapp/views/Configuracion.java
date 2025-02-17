package com.example.inventarioapp.views;

import static com.example.inventarioapp.R.id.btnExit;

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

public class Configuracion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_configuracion);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnExit = findViewById(R.id.btnCerrarSesion);
        Button btnCambiarPass = findViewById(R.id.btnCambiarPass);
        //Evento para ir a cambiar contraseña
        btnCambiarPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiarPass = new Intent(Configuracion.this, CambiarPass.class);
                startActivity(cambiarPass);
            }
        });
        //Evento para salir de la sesión
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(Configuracion.this, MainActivity.class);
                startActivity(login);
            }
        });
    }
}