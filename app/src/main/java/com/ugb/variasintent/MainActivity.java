package com.ugb.variasintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //crear los objetos que serviran para enlazar con las vistas en la activity
        final EditText rNombre = (EditText)findView(R.id.etNombre);
        Button btnEnviar =(Button)findViewById(R.id.btnEnviar);
        //crear el evento clic para el boton
        btnEnviar.setOnClickListener(new View.OnClickListener()) {
            @Override
                    public void onClick(View view) {
            //necesitamos capturar en una variable el valor a enviar

            }
        }
    }
}