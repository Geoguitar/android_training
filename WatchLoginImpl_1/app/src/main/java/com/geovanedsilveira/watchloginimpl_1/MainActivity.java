package com.geovanedsilveira.watchloginimpl_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String loginRegistrado = "Geovane";
    private String senhaRegistrado = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        TextView tLogin = findViewById(R.id.edtLogin);
        TextView tSenha = findViewById(R.id.edtSenha);

        String login = tLogin.getText().toString();
        String senha = tSenha.getText().toString();

        if (loginRegistrado.equals(login) && senhaRegistrado.equals(senha)){
            alert(loginRegistrado + ", bem vindo, acesso realizado com sucesso !");
        }else {
            alert(" Login e/ou senha incorretos!");
        }

    }

    private void alert(String s) {
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
}
