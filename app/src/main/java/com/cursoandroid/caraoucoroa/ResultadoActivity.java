package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {
    private ImageView imageMoeda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        imageMoeda = findViewById(R.id.imageMoeda);
        Bundle dados = getIntent().getExtras();
        sortearMoeda(dados.getInt("randomico"));
    }
    private void sortearMoeda(int randomico){
        if(randomico == 0)
            imageMoeda.setImageResource(R.drawable.moeda_cara);
        else if(randomico == 1)
            imageMoeda.setImageResource(R.drawable.moeda_coroa);
    }
    public void voltar(View view){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}