package com.example.atvcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvNumeros;
    Button btLimpar, btZero, btUm, btDois, btTres, btQuatro, btCinco, btSeis, btSete, btOito, btNove, btPonto, btMultiplicacao, btDivisao, btSubtracao, btSoma, btResultado;
    double numero = 0;
    String num1 = " ", num2 = " ", calc="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNumeros = findViewById(R.id.tvNumeros);
        btZero = (Button) findViewById(R.id.btZero);
        btUm = (Button) findViewById(R.id.btUm);
        btDois = (Button) findViewById(R.id.btDois);
        btTres = (Button) findViewById(R.id.btTres);
        btQuatro = (Button) findViewById(R.id.btQuatro);
        btCinco = (Button) findViewById(R.id.btCinco);
        btSeis = (Button) findViewById(R.id.btSeis);
        btSete = (Button) findViewById(R.id.btSete);
        btOito = (Button) findViewById(R.id.btOito);
        btNove = (Button) findViewById(R.id.btNove);
        btMultiplicacao = (Button) findViewById(R.id.btMultiplicar);
        btDivisao = (Button) findViewById(R.id.btDivisao);
        btSoma = (Button) findViewById(R.id.btSoma);
        btSubtracao = (Button) findViewById(R.id.btSubtracao);
        btPonto = (Button) findViewById(R.id.btPonto);
        btResultado = (Button) findViewById(R.id.btResultado);
        btLimpar = (Button) findViewById(R.id.btLimpar);
    }

    void armazenar (String dado){
        num1 = dado;
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btZero:
                armazenar("0");

                break;
            case R.id.btUm:
                armazenar("1");
                break;
        }
    }
}