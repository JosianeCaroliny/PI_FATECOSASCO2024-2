package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class PRPerfil2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_04_2_perfil);

        // Encontrar os ImageButtons pelo ID
        ImageButton imageButton3 = findViewById(R.id.imageButton4); // Botão que vai para pr_02_pedidos_home
        ImageButton imageButton4 = findViewById(R.id.imageButton4); // Botão que vai para cl_02_entrar_pr
        ImageButton imageButton5 = findViewById(R.id.imageButton5); // Botão que vai para pr_04_1_perfil
        ImageButton imageButton1 = findViewById(R.id.imageButton1);
        Button button1 = findViewById(R.id.btnPedidoRecebido);

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPerfil2Activity.this, PRPerfilActivity.class); // Substitua com a classe correta da tela pr_02_pedidos_home
                startActivity(intent);
            }
        });


        // clique no ImageButton3 para ir para a página PRPedidosHomeActivity (pr_02_pedidos_home)
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPerfil2Activity.this, PRPedidosHomeActivityINATIVADA.class); // Substitua com a classe correta da tela pr_02_pedidos_home
                startActivity(intent);
            }
        });

        // clique no ImageButton4 para ir para a página EntrarActivity (cl_02_entrar_pr)
        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPerfil2Activity.this, EntrarActivity.class); // Substitua com a classe correta da tela cl_02_entrar_pr
                startActivity(intent);
            }
        });

        // clique no ImageButton5 para ir para a página PRPerfilActivity (pr_04_1_perfil)
        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPerfil2Activity.this, PRPerfilActivity.class); // Substitua com a classe correta da tela pr_04_1_perfil
                startActivity(intent);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPerfil2Activity.this, PRPerfilActivity.class); // Substitua com a classe correta da tela pr_04_1_perfil
                startActivity(intent);
            }
        });

    }
}
