package com.firebaseapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);
        getSupportActionBar().hide();//Esconde a action bar

    }

    private void alert(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }

    public void pegaSegundaTela(View view) {
        Intent intent = new Intent(this, SegundaTela.class);
        TextView box_name = (TextView) findViewById(R.id.box_name);
        TextView box_senha = (TextView) findViewById(R.id.box_senha);
        String name = box_name.getText().toString();
        String senha = box_senha.getText().toString();
        if (name.equals("") && senha.equals("")){
            alert("Nome e senha inválidos");
        }else if (name.equals("")){
            alert("Nome inválido");
        }else if (senha.equals("")){
            alert("Senha inválida");
        }else{
            alert("Login realizado com sucesso");
            startActivity(intent);
        }
    }

}