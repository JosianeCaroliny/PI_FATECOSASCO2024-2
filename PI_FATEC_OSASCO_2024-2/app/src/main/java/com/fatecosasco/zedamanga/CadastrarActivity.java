package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class CadastrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_03_cadastrar);

        // Encontrar os campos de texto e o botão pelo ID
        EditText etNome = findViewById(R.id.textInputEditText2);
        EditText etTelefone = findViewById(R.id.editTextPhone);
        EditText etCPF = findViewById(R.id.editTextNumber);
        EditText etEmail = findViewById(R.id.editTextTextEmailAddress);
        EditText etSenha = findViewById(R.id.editTextTextPassword01);
        EditText etConfSenha = findViewById(R.id.editTextTextPassword02);
        Button btnCadastrar = findViewById(R.id.btnPedidoRecebido);

        // Encontrar o ImageButton para ir para a página ZM
        ImageButton imageButtonZm = findViewById(R.id.imageButton5);

        // Ação quando o botão de cadastrar for clicado
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Capturar os dados dos campos
                String nome = etNome.getText().toString();
                String telefone = etTelefone.getText().toString();
                String cpf = etCPF.getText().toString();
                String email = etEmail.getText().toString();
                String senha = etSenha.getText().toString();

                // Verificar se todos os campos estão preenchidos
                if(nome.isEmpty() || telefone.isEmpty() || cpf.isEmpty() || email.isEmpty() || senha.isEmpty()) {
                    Toast.makeText(CadastrarActivity.this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
                } else {
                    // Aqui você pode inserir a lógica de salvar os dados no banco de dados

                    Toast.makeText(CadastrarActivity.this, "Cadastro realizado com sucesso!", Toast.LENGTH_SHORT).show();

                    // Se necessário, pode navegar para outra Activity após o cadastro
                    // Intent intent = new Intent(CadastrarActivity.this, OutraActivity.class);
                    // startActivity(intent);
                }
            }
        });

        // Ação quando o botão voltar for clicado
        imageButtonZm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para abrir a página ZmActivity
                Intent intent = new Intent(CadastrarActivity.this, ZMActivity.class);
                startActivity(intent);
            }
        });
    }
}
