package com.example.intentsv3;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textViewNombre1;
    private TextView textViewTelefono1;
    private TextView textViewMail1;
    private TextView textViewContraseña1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
textViewNombre1=findViewById(R.id.textViewNombre);
textViewTelefono1=findViewById(R.id.textViewTelefono);
textViewMail1=findViewById(R.id.textViewMail);
textViewContraseña1=findViewById(R.id.textViewContraseña);




        Button btnRegistro=findViewById(R.id.btnRegistro);
        btnRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                startActivityForResult(intent,1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1){
            if (resultCode==RESULT_OK){
                String Nombree=data.getStringExtra("Nombre");
                textViewNombre1.setText(Nombree);
                String telefono12=data.getStringExtra("Telefono");
                textViewTelefono1.setText(telefono12);
                String correo=data.getStringExtra("Mail");
                textViewMail1.setText(correo);
                String pass=data.getStringExtra("Contraseña");
                textViewContraseña1.setText(pass);

            }
            if (resultCode==RESULT_CANCELED){
                textViewNombre1.setText("nada de nada");
            }
        }
    }
}