package com.example.aluno.calculadora;

import android.support.v7.app.AppCompatActivity;


public class Produto extends AppCompatActivity {

    private String nome;
    private double valor;

    public Produto() {

    }

    // Gets e sets para manipular os atributos privados

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}

