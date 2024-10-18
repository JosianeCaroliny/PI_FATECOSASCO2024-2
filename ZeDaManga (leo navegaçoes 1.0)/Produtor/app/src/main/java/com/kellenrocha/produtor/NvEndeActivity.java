package com.kellenrocha.produtor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class NvEndeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_05_2_novo_endereco);

        // Encontrar os botões pelo ID
        ImageButton btnVoltar = findViewById(R.id.imageButton6);
        ImageButton btnPerfil = findViewById(R.id.imageButton5);
        ImageButton btnHistorico = findViewById(R.id.imageButton4);
        ImageButton btnInicio = findViewById(R.id.imageButton2);
        Button btnNovoEndereco = findViewById(R.id.button1);

        // Ação ao clicar no botão de voltar
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NvEndeActivity.this, EntrarActivity.class);
                startActivity(intent);
                finish(); // Finaliza a atividade atual
            }
        });

        // Ação ao clicar no botão de perfil
        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NvEndeActivity.this, CLPerfilActivity.class);
                startActivity(intent);
            }
        });

        // Ação ao clicar no botão de histórico de pedidos
        btnHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NvEndeActivity.this, CLHistoricoPedidosActivity.class);
                startActivity(intent);
            }
        });

        // Ação ao clicar no botão de início
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NvEndeActivity.this, ZMActivity.class);
                startActivity(intent);
            }
        });

        // Ação ao clicar no botão de novo endereço
        btnNovoEndereco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NvEndeActivity.this, NvEndeActivity.class);
                startActivity(intent);
            }
        });
    }
}
