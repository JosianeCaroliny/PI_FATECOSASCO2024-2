package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class PR_03_3_det_pedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.pr_03_3_det_pedido);

        // Encontrar os ImageButtons pelo ID
        Button button1 = findViewById(R.id.btnConcluido);
        ImageButton imagebutton = findViewById(R.id.imageButton1);


        // clique no ImageButton5 para ir para a página de EntrarActivity
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PR_03_3_det_pedido.this, PR_02_pedidos_home.class);
                startActivity(intent);
            }
        });

        imagebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PR_03_3_det_pedido.this, PR_02_pedidos_home.class);
                startActivity(intent);
            }
        });

        ;}
}

