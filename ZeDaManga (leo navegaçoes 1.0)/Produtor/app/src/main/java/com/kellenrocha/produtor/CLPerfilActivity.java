package com.kellenrocha.produtor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class CLPerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_09_1_perfil);

        // Encontrar os ImageButtons pelo ID
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);

        // clique no ImageButton5 para ir para a página de EntrarActivity
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLPerfilActivity.this, EntrarActivity.class);
                startActivity(intent);
            }
        });

        // clique no ImageButton2 para ir para a página ZMActivity
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLPerfilActivity.this, ZMActivity.class);
                startActivity(intent);
            }
        });

        // Clique no ImageButton4 para ir para a página cl_10_historico_pedido
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLPerfilActivity.this, CLHistoricoPedidosActivity.class);
                startActivity(intent);
            }
        });
    }
}

