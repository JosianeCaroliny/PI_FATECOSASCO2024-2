package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class PRPerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_04_1_perfil);

        // Encontrar os botões e imagebuttons pelo ID
        ImageButton imageButton1 = findViewById(R.id.imageButton1); // Vai para cl_03_cadastrar
        ImageButton imageButton4 = findViewById(R.id.imageButton4); // Vai para cl_02_entrar_pr
        ImageButton imageButton3 = findViewById(R.id.imageButton4); // Vai para pr_02_pedidos_home
        Button button1 = findViewById(R.id.button1); // Vai para pr_04_2_perfil
        Button button2 = findViewById(R.id.btnConcluido); // Vai para cl_05_2_novo_endereco
        Button button4 = findViewById(R.id.button4); // Vai para zm (ZMActivity)

        // Redirecionar ImageButton1 para a página de cadastro (cl_03_cadastrar)
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPerfilActivity.this, PR_02_pedidos_home.class); // Substitua com a classe correta de cl_03_cadastrar
                startActivity(intent);
            }
        });

        // Redirecionar ImageButton4 para a página de login (cl_02_entrar_pr)
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPerfilActivity.this, PRPerfilActivity.class); // Substitua com a classe correta de cl_02_entrar_pr
                startActivity(intent);
            }
        });

        // Redirecionar ImageButton3 para a página de pedidos (pr_02_pedidos_home)
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPerfilActivity.this, PR_02_pedidos_home.class); // Substitua com a classe correta de pr_02_pedidos_home
                startActivity(intent);
            }
        });

        // Redirecionar Button1 para a página de perfil (pr_04_2_perfil)
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPerfilActivity.this, PRPerfil2Activity.class); // Substitua com a classe correta de pr_04_2_perfil
                startActivity(intent);
            }
        });


        // Redirecionar Button4 para a página principal (zm - ZMActivity)
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPerfilActivity.this, ZMActivity.class); // Substitua com a classe correta de zm (ZMActivity)
                startActivity(intent);
            }
        });
    }
}
