package com.geovanedsilveira.whatchlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String loginRegistrado = "Geovane";
    private String senhaRegistrada = "123";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btLogin = findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = findViewById(R.id.edtLogin);
                TextView tSenha = findViewById(R.id.edtSenha);

                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if (loginRegistrado.equals(login) && senhaRegistrada.equals(senha)){
                    alert(loginRegistrado + " Login realizado com sucesso!");
                }else{
                    alert(login + ",login e/ou senha incorretos");
                }
            }

            private void alert(String s) {
                Toast.makeText( s, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
