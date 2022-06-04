package com.ilellis.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){ // criando uma função chamada sortearNumero, ident

        TextView texto = findViewById(R.id.textoResultado);
        int x = new Random().nextInt(101); // gerando um numero aleatorio, através da random(). e com o .nextInt() gera-se numero inteiros

        texto.setText("Numero:"+ x);//set na variavel que altera o campo determinado, a randomização .

    }

}