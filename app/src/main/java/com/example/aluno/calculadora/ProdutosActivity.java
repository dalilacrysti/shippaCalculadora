package com.example.aluno.calculadora;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;


public class ProdutosActivity extends AppCompatActivity {
    private TextView textProdutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);

        textProdutos = (TextView) findViewById(R.id.textProdutos);

        List<Produto> produtos = Produto.listAll(Produto.class);


        String texto = "";

        for(Produto p : produtos){


            texto += p.getNome() + " - R$" + p.getValor() + "\n";

        }


        textProdutos.setText(texto);
    }
}