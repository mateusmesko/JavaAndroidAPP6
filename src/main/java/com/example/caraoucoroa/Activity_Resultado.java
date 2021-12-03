package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Activity_Resultado extends AppCompatActivity {

    private Button resultadoBotao;
    private ImageView imagemResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__resultado);

        resultadoBotao = findViewById(R.id.resultadoBT);
        Bundle dados = getIntent().getExtras();
        imagemResultado = findViewById(R.id.image);

        int numero = dados.getInt("numero");
        if (numero==0){
            imagemResultado.setImageResource(R.drawable.moeda_cara);
        }else{
            imagemResultado.setImageResource(R.drawable.moeda_coroa);
        }
        resultadoBotao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }

        });

    }
}
