package com.example.atvcalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView tvNumeros;
    Button btLimpar, btZero, btUm, btDois, btTres, btQuatro, btCinco, btSeis, btSete, btOito, btNove, btMultiplicacao, btDivisao, btSubtracao, btSoma, btResultado;

    boolean operacao=false;
    String num1 = " ", num2 = " ", calc="",tela = "";

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
        btResultado = (Button) findViewById(R.id.btResultado);
        btLimpar = (Button) findViewById(R.id.btLimpar);

        btZero.setOnClickListener(this);
        btUm.setOnClickListener(this);
        btDois.setOnClickListener(this);
        btTres.setOnClickListener(this);
        btQuatro.setOnClickListener(this);
        btCinco.setOnClickListener(this);
        btSeis.setOnClickListener(this);
        btSete.setOnClickListener(this);
        btOito.setOnClickListener(this);
        btNove.setOnClickListener(this);
        btLimpar.setOnClickListener(this);
        btDivisao.setOnClickListener(this);
        btMultiplicacao.setOnClickListener(this);
        btSubtracao.setOnClickListener(this);
        btSoma.setOnClickListener(this);
        btResultado.setOnClickListener(this);
    }

    void mostrarTela(String tela){
        tvNumeros.setText(tela);
    }
    void armazenar (String dado){
        if(operacao){
            num2 += dado;
            tela=num2;
            operacao=false;
        } else{
            num1 += dado;
            tela=num1;
        }
        tvNumeros.setText(tela);
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

            case R.id.btDois:
                armazenar("2");
                break;

            case R.id.btTres:
                armazenar("3");
                break;

            case R.id.btQuatro:
                armazenar("4");
                break;

            case R.id.btCinco:
                armazenar("5");
                break;

            case R.id.btSeis:
                armazenar("6");
                break;

            case R.id.btSete:
                armazenar("7");
                break;

            case R.id.btOito:
                armazenar("8");
                break;

            case R.id.btNove:
                armazenar("9");
                break;

            case R.id.btLimpar:
                num1 = "";
                num2= "";
                tela="";
                tvNumeros.setText(tela);
                break;

            case R.id.btDivisao:
                tela+="/";
                mostrarTela(tela);
                operacao = true;
                calc="/";
                break;

            case R.id.btSubtracao:
                tela+="-";
                mostrarTela(tela);
                operacao = true;
                calc="-";
                break;

            case R.id.btSoma:
                tela+="+";
                calc="+";

                mostrarTela(tela);
                operacao = true;
                break;

            case R.id.btMultiplicar:
                tela+="*";
                mostrarTela(tela);
                operacao = true;
                calc="*";
                break;


            case R.id.btResultado:
                switch(calc) {
                    case "+":
                        tela = "" + (Double.parseDouble(num1) + Double.parseDouble(num2));
                        mostrarTela(tela);
                        break;

                    case "-":
                        tela = "" + (Double.parseDouble(num1) - Double.parseDouble(num2));
                        mostrarTela(tela);
                        break;

                    case "*":
                        tela = "" + (Double.parseDouble(num1) * Double.parseDouble(num2));
                        mostrarTela(tela);
                        break;

                    case "/":
                        tela = "" + (Double.parseDouble(num1) / Double.parseDouble(num2));
                        mostrarTela(tela);
                        break;

                }
                num1=tela;
                num2="";
                calc="";
                break;
    }



}
}