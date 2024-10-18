package com.kellenrocha.produtor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class EntrarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cl_02_entrar_pr);

        // ImageButton com o ID imageButton5
        ImageButton imageButtonZm = findViewById(R.id.imageButton5);

        // clique no ImageButton para ir para a página ZMActivity
        imageButtonZm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para abrir a página ZMActivity
                Intent intent = new Intent(EntrarActivity.this, ZMActivity.class);
                startActivity(intent);
            }
        });

        //redirecionamento da página de cadastro ao clicar em "Cadastrar"
        TextView textViewCadastrar = findViewById(R.id.textView6);
        textViewCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para abrir a página de cadastro
                Intent intent = new Intent(EntrarActivity.this, CadastrarActivity.class);
                startActivity(intent);
            }
        });

        // redirecionamento do button3 para a página CLPerfilActivity *ALTERAR DEPOIS*
        Button buttonEntrar = findViewById(R.id.button3);
        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent para abrir a página CLPerfilActivity
                Intent intent = new Intent(EntrarActivity.this, CLPerfilActivity.class);
                startActivity(intent);
            }
        });
    }
}

