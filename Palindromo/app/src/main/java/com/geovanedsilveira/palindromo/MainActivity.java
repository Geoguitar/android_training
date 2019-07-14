package com.geovanedsilveira.palindromo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.geovanedsilveira.palindromo.domain.Palindromo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "TrainingBook";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btVerificar = findViewById(R.id.bt_verificar); //Casting de Button será redundante
        btVerificar.setOnClickListener(this);

        Log.v(TAG, "log de verbose");
        Log.d(TAG, "log de debug");
        Log.i(TAG, "log de info");
        Log.w(TAG, "log de alerta");
        Log.e(TAG, "log de erro", new RuntimeException(" testes de erro!"));

    }

    @Override
    public void onClick(View v) {
        EditText etPalindromo = findViewById(R.id.et_palindromo); //Casting de EditText será redundante
        TextView tvResposta = findViewById(R.id.tv_resposta); //Casting de TextView será redundante

        Palindromo palindromo = new Palindromo(etPalindromo.getText().toString());
        String resposta;

        if (palindromo.ehPalindromo()){
            resposta = " , é um palíndromo !";
        }else{
            resposta = " , NÃO é um palíndromo!";
        }

        resposta = palindromo.getConteudo() + resposta;
        tvResposta.setText(resposta);

    }
}
