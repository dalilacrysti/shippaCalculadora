package com.example.aluno.calculadora;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;
import android.widget.Button;
import android.widget.TextView;

class calculadora extends AppCompatActivity {

    final Double precoSalgado = 3.8;

    Button buttonMaisSalgado;
    Button buttonMenosSalgado;
    TextView qtdeSalgado;
    TextView total;

    final Double precoRefri = 3.0;

    Button buttonMaisRefri;
    Button buttonMenosRefri;
    TextView qtdeRefri;

    final Double precoBolo = 2.0;

    Button buttonMaisBolo;
    Button buttonMenosBolo;
    TextView qtdeBolo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonMaisSalgado = findViewById(R.id.maisSalgado);
        buttonMenosSalgado = findViewById(R.id.menosSalgado);
        total = findViewById(R.id.total);
        qtdeSalgado = findViewById(R.id.qtdeSalgado);

        buttonMaisRefri = findViewById(R.id.maisRefri);
        buttonMenosRefri = findViewById(R.id.menosRefri);
        total = findViewById(R.id.total);
        qtdeRefri = findViewById(R.id.qtdeRefri);

        buttonMaisBolo = findViewById(R.id.maisBolo);
        buttonMenosBolo = findViewById(R.id.menosBolo);
        total = findViewById(R.id.total);
        qtdeBolo = findViewById(R.id.qtdeBolo);


        buttonMaisSalgado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(qtdeSalgado.getText().toString()) != '0' )  {
                    qtdeSalgado.setText(Integer.toString(Integer.parseInt(qtdeSalgado.getText().toString()) + 1 ));
                    total.setText( Double.toString(Double.parseDouble(total.getText().toString()) + precoSalgado ));
                }



            }
        });

        buttonMenosSalgado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(qtdeSalgado.getText().toString()) != '0' )  {
                    qtdeSalgado.setText(Integer.toString(Integer.parseInt(qtdeSalgado.getText().toString()) - 1 ));
                    total.setText( Double.toString(Double.parseDouble(total.getText().toString()) - precoSalgado )) ;
                }



            }
        });

        buttonMaisRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(qtdeRefri.getText().toString()) != '0' )  {
                    qtdeRefri.setText(Integer.toString(Integer.parseInt(qtdeRefri.getText().toString()) + 1 ));
                    total.setText( Double.toString(Double.parseDouble(total.getText().toString()) + precoRefri ));
                }



            }
        });
        buttonMenosRefri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(qtdeRefri.getText().toString()) != '0' )  {
                    qtdeRefri.setText(Integer.toString(Integer.parseInt(qtdeRefri.getText().toString()) - 1 ));
                    total.setText( Double.toString(Double.parseDouble(total.getText().toString()) - precoRefri )) ;
                }



            }
        });


        buttonMaisBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(qtdeBolo.getText().toString()) != '0' )  {
                    qtdeBolo.setText(Integer.toString(Integer.parseInt(qtdeBolo.getText().toString()) + 1 ));
                    total.setText( Double.toString(Double.parseDouble(total.getText().toString()) + precoBolo ));
                }



            }
        });
        buttonMenosBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Integer.parseInt(qtdeBolo.getText().toString()) != '0' )  {
                    qtdeBolo.setText(Integer.toString(Integer.parseInt(qtdeBolo.getText().toString()) - 1 ));
                    total.setText( Double.toString(Double.parseDouble(total.getText().toString()) - precoBolo )) ;
                }



            }
        });
    }
}
