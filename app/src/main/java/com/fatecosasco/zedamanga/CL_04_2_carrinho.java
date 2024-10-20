package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CL_04_2_carrinho extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.cl_04_2_carrinho);

        // Encontrar os ImageButtons pelo ID
        ImageButton imagebutton = findViewById(R.id.adicionar);
        Button enviarPedido = findViewById(R.id.btn_enviarPedido);


        // clique no ImageButton5 para ir para a página de EntrarActivity

        imagebutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CL_04_2_carrinho.this, CL_04_1_produtos.class);
                startActivity(intent);
            }
        });

       enviarPedido.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CL_04_2_carrinho.this, CL_06_metodo_pagamento.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);

        // Define ações para cada botão
        imageButton1.setOnClickListener(v -> navegarParaNovaTela(CL_04_1_produtos.class));
        imageButton2.setOnClickListener(v -> navegarParaNovaTela(CL_04_2_carrinho.class));
        imageButton4.setOnClickListener(v -> navegarParaNovaTela(CLHistoricoPedidosActivity.class));
        imageButton5.setOnClickListener(v -> navegarParaNovaTela(CLPerfilActivity.class));
    }

    // Método genérico para navegação entre telas
    private void navegarParaNovaTela(Class<?> novaTela) {
        Intent intent = new Intent(CL_04_2_carrinho.this, novaTela);
        startActivity(intent);
    }
}