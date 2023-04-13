package com.example.atvcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvNumeros;
    Button btZero, btUm, btDois, btTres, btQuatro, btCinco, btSeis, btSete, btOito, btNove, btPonto, btMultiplicacao, btSoma, btSubtracao, btResultado;
    double numero = 0;
    String num1 = " ", num2 = " ", calc="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public void onClick(View v) {

    }
}