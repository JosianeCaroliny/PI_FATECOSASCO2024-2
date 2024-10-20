package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CLPerfil2Activity extends AppCompatActivity {

    private EditText nomeEditText, telefoneEditText, emailEditText;
    private Button atualizarButton;
    private ImageButton btnVoltar, btnHistorico, btnPerfil, btnInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_09_2_perfil);

        // Capturando os campos de entrada pelo ID
        nomeEditText = findViewById(R.id.textInputEditText2);
        telefoneEditText = findViewById(R.id.editTextPhone);
        emailEditText = findViewById(R.id.editTextTextEmailAddress);
        atualizarButton = findViewById(R.id.btnPedidoRecebido);

        // Botões de navegação
        btnInicio = findViewById(R.id.imageButton2);
        btnHistorico = findViewById(R.id.imageButton4);
        btnPerfil = findViewById(R.id.imageButton5);
        btnVoltar = findViewById(R.id.imageButton1);

        // Redirecionar botão "Início" para ZMActivity (cl_01_zm_pr)
        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLPerfil2Activity.this, ZMActivity.class);
                startActivity(intent);
            }
        });

        // Redirecionar botão "Histórico" para CLHistoricoPedidosActivity (cl_10_historico_pedidos)
        btnHistorico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLPerfil2Activity.this, CLHistoricoPedidosActivity.class);
                startActivity(intent);
            }
        });

        // Redirecionar botão "Perfil" para CLPerfilActivity (cl_09_1_perfil)
        btnPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLPerfil2Activity.this, CLPerfilActivity.class);
                startActivity(intent);
            }
        });

        // Redirecionar botão "Voltar" para CLPerfilActivity (cl_09_1_perfil)
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CLPerfil2Activity.this, CLPerfilActivity.class);
                startActivity(intent);
            }
        });

        // Configurando o botão de atualizar
        atualizarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = nomeEditText.getText().toString().trim();
                String telefone = telefoneEditText.getText().toString().trim();
                String email = emailEditText.getText().toString().trim();

                if (nome.isEmpty() || telefone.isEmpty() || email.isEmpty()) {
                    Toast.makeText(CLPerfil2Activity.this, "Preencha todos os campos", Toast.LENGTH_SHORT).show();
                } else {
                    atualizarPerfil(nome, telefone, email);
                }
            }
        });
    }

    private void atualizarPerfil(String nome, String telefone, String email) {
        // Método de atualização
        Toast.makeText(this, "Nome: " + nome + "\nTelefone: " + telefone + "\nEmail: " + email, Toast.LENGTH_LONG).show();
    }
}
