package com.kellenrocha.produtor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ZMActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_01_zm_pr);

        // Navegação para EntrarActivity
        Button btnIrParaEntrar = findViewById(R.id.button3);
        btnIrParaEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZMActivity.this, EntrarActivity.class);
                startActivity(intent);
            }
        });

        // Navegação para CadastrarActivity
        Button btnIrParaCadastrar = findViewById(R.id.button4);
        btnIrParaCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZMActivity.this, CadastrarActivity.class);
                startActivity(intent);
            }
        });
    }
}
