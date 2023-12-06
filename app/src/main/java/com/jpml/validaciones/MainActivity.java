package com.jpml.validaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText Signos;
    Button consultar=findViewById(R.id.btnConsultar);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Signos=findViewById(R.id.txtSigno);
        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String signo=Signos.getText().toString();
                Bundle parametros= new Bundle();
                parametros.putString("Signos",signo);

                Intent intent= new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra(parametros);
                startActivities(intent);

            }
        });




    }
}