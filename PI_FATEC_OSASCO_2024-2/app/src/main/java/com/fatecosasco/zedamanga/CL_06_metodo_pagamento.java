package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class CL_06_metodo_pagamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_06_metodo_pagamento);

        // Associa os botões
        ImageButton imageButton6 = findViewById(R.id.imageButton6);
        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton4);
        ImageButton imageButton4 = findViewById(R.id.imageButton4);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);

        // Define ações para cada botão
        imageButton6.setOnClickListener(v -> navegarParaNovaTela(NvEndeActivity.class));
        imageButton1.setOnClickListener(v -> navegarParaNovaTela(ConfPediActivity.class));
        //imageButton2.setOnClickListener(v -> navegarParaNovaTela(Cl_01_zm_pr.class));
        //imageButton3.setOnClickListener(v -> navegarParaNovaTela(Cl_09_2_perfil.class));
        imageButton4.setOnClickListener(v -> navegarParaNovaTela(CLHistoricoPedidosActivity.class));
        imageButton5.setOnClickListener(v -> navegarParaNovaTela(CLPerfilActivity.class));
    }

    // Método genérico para navegação entre telas
    private void navegarParaNovaTela(Class<?> novaTela) {
        Intent intent = new Intent(CL_06_metodo_pagamento.this, novaTela);
        startActivity(intent);
    }
}

