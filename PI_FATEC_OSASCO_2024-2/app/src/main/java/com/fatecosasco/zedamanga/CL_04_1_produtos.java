package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class CL_04_1_produtos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_04_1_produtos);

        // Encontrar os ImageButtons pelo ID
        ImageButton imageButtonAdicionar = findViewById(R.id.adicionar);

        // Clique no botão adicionar para ir para a página de CL_04_2_carrinho
        imageButtonAdicionar.setOnClickListener(v -> {
            Intent intent = new Intent(CL_04_1_produtos.this, CL_04_2_carrinho.class);
            startActivity(intent);
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
        Intent intent = new Intent(CL_04_1_produtos.this, novaTela);
        startActivity(intent);
    }
}
