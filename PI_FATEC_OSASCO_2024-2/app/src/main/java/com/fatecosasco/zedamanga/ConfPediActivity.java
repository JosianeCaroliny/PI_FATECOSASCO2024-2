package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ConfPediActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_07_confirmacao_pedido); // Certifique-se de que o layout correto esteja sendo chamado

        // imageButton6 vai para cl_06_metodo_pagamento
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfPediActivity.this, CL_06_metodo_pagamento.class);
                startActivity(intent);
            }
        });

        // imageButton2 vai para a página zm (ZMActivity)
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfPediActivity.this, CL_04_1_produtos.class);
                startActivity(intent);
            }
        });

        // imageButton4 vai para cl_10_historico_pedidos
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfPediActivity.this, CLHistoricoPedidosActivity.class);
                startActivity(intent);
            }
        });
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfPediActivity.this, CL_04_2_carrinho.class);
                startActivity(intent);
            }
        });

        // imageButton5 vai para cl_09_1_perfil
        ImageButton imageButton5 = findViewById(R.id.imageButton5);
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfPediActivity.this, CLPerfilActivity.class);
                startActivity(intent);
            }
        });

        // button5 mostra pop-up "PEDIDO FINALIZADO" e vai para cl_08_numero_pedido
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Exibir pop-up
                Toast.makeText(ConfPediActivity.this, "PEDIDO FINALIZADO", Toast.LENGTH_SHORT).show();

                // Ir para cl_08_numero_pedido
                Intent intent = new Intent(ConfPediActivity.this, CLHistoricoPedidosActivity.class);
                startActivity(intent);
            }
        });
    }

}
