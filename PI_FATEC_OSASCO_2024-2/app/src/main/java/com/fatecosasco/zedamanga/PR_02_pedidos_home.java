package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class PR_02_pedidos_home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_02_pedidos_home);

        // Encontrar o TextView pelo ID
        TextView textview = findViewById(R.id.txtOrderNumber);

        // Clique no TextView para ir para a página de PR_03_1_det_pedido
        textview.setOnClickListener(v -> {
            Intent intent = new Intent(PR_02_pedidos_home.this, PR_03_1_det_pedido.class);
            startActivity(intent);
        });

        // Encontrar os ImageButtons pelo ID
        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        ImageButton imageButton2 = findViewById(R.id.imageButton2);
        ImageButton imageButton3 = findViewById(R.id.imageButton4);

        // Define ações para cada botão
        imageButton1.setOnClickListener(v -> navegarParaNovaTela(PR_02_pedidos_home.class)); // Confirme se deseja manter
        imageButton2.setOnClickListener(v -> navegarParaNovaTela(PR_02_pedidos_home.class)); // Confirme se deseja manter
        imageButton3.setOnClickListener(v -> navegarParaNovaTela(PRPerfilActivity.class)); // Correto
    }

    // Método genérico para navegação entre telas
    private void navegarParaNovaTela(Class<?> novaTela) {
        Intent intent = new Intent(PR_02_pedidos_home.this, novaTela);
        startActivity(intent);
    }
}
