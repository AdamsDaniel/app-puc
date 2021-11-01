package com.firebaseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();//Esconde a action bar
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btnEnviar);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView box_name = (TextView) findViewById(R.id.box_name);
                TextView box_senha = (TextView) findViewById(R.id.box_senha);
                String name = box_name.getText().toString();
                String senha = box_senha.getText().toString();
                if (name.equals("pedro") && senha.equals("123")){
                    alert("Login realizado com sucesso");

                }else{
                    alert("Nome ou senha inválidos");
                }
            }
        });
    }

    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }

    public void pegaSegundaTela(View view) {
        Intent intent = new Intent(this, SegundaTela.class);
        startActivity(intent);
    }

}