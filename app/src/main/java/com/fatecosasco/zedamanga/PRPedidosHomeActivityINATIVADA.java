package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class PRPedidosHomeActivityINATIVADA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pr_02_pedidos_home);

        // Encontrar os ImageButtons pelo ID
        ImageButton imageButton3 = findViewById(R.id.imageButton4); // Vai para pr_04_1_perfil
        ImageButton imageButton2 = findViewById(R.id.imageButton2); // Vai para pr_02_pedidos_home

        // Redirecionar ImageButton3 para a página de perfil (pr_04_1_perfil)
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPedidosHomeActivityINATIVADA.this, PRPerfilActivity.class); // Substitua com a classe correta de pr_04_1_perfil
                startActivity(intent);
            }
        });

        // Redirecionar ImageButton2 para a página de pedidos (pr_02_pedidos_home)
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRPedidosHomeActivityINATIVADA.this, PRPedidosHomeActivityINATIVADA.class); // Substitua com a classe correta de pr_02_pedidos_home
                startActivity(intent);
            }
        });
    }
}
