package com.fatecosasco.zedamanga;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class CL_08_numero_pedido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.cl_08_numero_pedido);

        // Encontrar os ImageButtons pelo ID
        Button pedidorecebido = findViewById(R.id.btnPedidoRecebido);
        Button cancelarpedido = findViewById(R.id.btnConcluido);

        // clique no ImageButton5 para ir para a página de EntrarActivity

        cancelarpedido.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CL_08_numero_pedido.this, CL_04_1_produtos.class);
                startActivity(intent);
            }
        });

        pedidorecebido.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CL_08_numero_pedido.this, CLHistoricoPedidosActivity.class);
                startActivity(intent);
            }
        });

        ;}
}
