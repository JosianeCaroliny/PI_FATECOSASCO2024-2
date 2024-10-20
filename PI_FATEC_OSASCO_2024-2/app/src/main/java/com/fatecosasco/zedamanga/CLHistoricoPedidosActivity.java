package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CLHistoricoPedidosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_10_historico_pedidos);


        // Associa os botões
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton7 = findViewById(R.id.imageButton7);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);


        // Define ações para cada botão
        imageButton2.setOnClickListener(v -> navegarParaNovaTela(CL_04_1_produtos.class));
        imageButton7.setOnClickListener(v -> navegarParaNovaTela(CL_04_2_carrinho.class));
        imageButton4.setOnClickListener(v -> navegarParaNovaTela(CLHistoricoPedidosActivity.class));
        imageButton5.setOnClickListener(v -> navegarParaNovaTela(CLPerfilActivity.class));
    }

    // Método genérico para navegação entre telas
    private void navegarParaNovaTela(Class<?> novaTela) {
        Intent intent = new Intent(CLHistoricoPedidosActivity.this, novaTela);
        startActivity(intent);
    }
}


