package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void jogar(View view){
        Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);
        //vamos gerar o numero randomico aqui, mesmo sem necessidade, apenas para treinarmos
        int numero = new Random().nextInt(2);
        intent.putExtra("randomico", numero);
        startActivity(intent);
    }
}