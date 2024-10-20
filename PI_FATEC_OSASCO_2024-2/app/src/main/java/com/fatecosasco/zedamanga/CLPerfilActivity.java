package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class CLPerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_09_1_perfil);

        Button Button1 = findViewById(R.id.button1);
        Button Button2 = findViewById(R.id.btnConcluido);
        Button Button4 = findViewById(R.id.btnPedidoRecebido);
        Button Button5 = findViewById(R.id.button4);

        Button1.setOnClickListener(v -> proximaTela(CLPerfil2Activity.class));
        Button2.setOnClickListener(v -> proximaTela(NvEndeActivity.class));
        Button4.setOnClickListener(v -> proximaTela(CLPerfil2Activity.class));
        Button5.setOnClickListener(v -> proximaTela(ZMActivity.class));


        // Encontrar os ImageButtons pelo ID

        ImageButton imageButton1 = findViewById(R.id.imageButton2);
        ImageButton imageButton2 = findViewById(R.id.imageButton4);
        ImageButton imageButton4 = findViewById(R.id.imageButton7);
        ImageButton imageButton5 = findViewById(R.id.imageButton5);

        // Define ações para cada botão
        imageButton1.setOnClickListener(v -> navegarParaNovaTela(CL_04_1_produtos.class));
        imageButton2.setOnClickListener(v -> navegarParaNovaTela(CL_04_2_carrinho.class));
        imageButton4.setOnClickListener(v -> navegarParaNovaTela(CLHistoricoPedidosActivity.class));
        imageButton5.setOnClickListener(v -> navegarParaNovaTela(CLPerfilActivity.class));
    }

    // Método genérico para navegação entre telas
    private void navegarParaNovaTela(Class<?> novaTela) {
        Intent intent = new Intent(CLPerfilActivity.this, novaTela);
        startActivity(intent);
    }

    private void proximaTela(Class<?> proximaTela) {
        Intent intent = new Intent(CLPerfilActivity.this, proximaTela);
        startActivity(intent);
    }
    }


