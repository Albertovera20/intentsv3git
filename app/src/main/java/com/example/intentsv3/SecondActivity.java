package com.example.intentsv3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditText txtNombreee,txtTelef,txtmai,txtcontra;
        txtNombreee = findViewById(R.id.txtNombre);
        txtTelef = findViewById(R.id.txtTelefono);
        txtmai = findViewById(R.id.txtMail);
        txtcontra = findViewById(R.id.txtContraseña);


        setTitle("actividad 2");


        Button botondeVuelta=findViewById(R.id.btnRegistrodevuelta);
        botondeVuelta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombretexts = txtNombreee.getText().toString();
                String telefonotext = txtTelef.getText().toString();
                String mailcom = txtmai.getText().toString();
                String contraseña = txtcontra.getText().toString();


Intent DAtos=new Intent();
DAtos.putExtra("Nombre",nombretexts);
              DAtos.putExtra("Telefono",telefonotext);
                DAtos.putExtra("Mail",mailcom);
                DAtos.putExtra("Contraseña",contraseña);

setResult(RESULT_OK,DAtos);
finish();
            }
        });
    }
}