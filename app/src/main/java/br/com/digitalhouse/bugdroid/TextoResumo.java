package br.com.digitalhouse.bugdroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TextoResumo extends AppCompatActivity {

    private Button btnlermais;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_texto_resumo);

        btnlermais = (Button) findViewById(R.id.btn_lermais);

        btnlermais.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TextoResumo.this, TextoCompleto.class));
            }
        });





    }
}
