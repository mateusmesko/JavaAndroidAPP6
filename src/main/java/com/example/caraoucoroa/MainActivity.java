package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button botaojogar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaojogar= findViewById(R.id.botaoJogar);

        botaojogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity_Resultado.class);

                int numero = new Random().nextInt(2);
                intent.putExtra("numero",numero);

                startActivity(intent);
            }
        });

    }


}
