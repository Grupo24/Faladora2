package com.gps1718.g24.faladora;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    String lastOperation = "";
    boolean firstOperation = true;
    double soma = 0, valor1 = 0, valor2 = 0;

    Button btt1, btt2, btt3, btt4, btt5, btt6, btt7, btt8, btt9, btt0, bttMais, bttMenos, bttMult, bttDiv, bttC, bttCE, bttEq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Butão 1
        btt1 = (Button) findViewById(R.id.butaoUm);
        btt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt1.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão 1
        btt1 = (Button) findViewById(R.id.butaoUm);
        btt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt1.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão 2
        btt2 = (Button) findViewById(R.id.butaoDois);
        btt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt2.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão 3
        btt3 = (Button) findViewById(R.id.butaoTres);
        btt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt3.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão 4
        btt4 = (Button) findViewById(R.id.butaoQuatro);
        btt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt4.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão 5
        btt5 = (Button) findViewById(R.id.butaoCinco);
        btt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt5.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão 6
        btt6 = (Button) findViewById(R.id.butaoSeis);
        btt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt6.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão 7
        btt7 = (Button) findViewById(R.id.butaoSete);
        btt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt7.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão 8
        btt8 = (Button) findViewById(R.id.butaoOito);
        btt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt8.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão 9
        btt9 = (Button) findViewById(R.id.butaoNove);
        btt9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt9.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão 0
        btt0 = (Button) findViewById(R.id.butaoZero);
        btt0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        btt0.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onNumero(v);
                return true;
            }
        });

        //Butão +
        bttMais = (Button) findViewById(R.id.butaoMais);
        bttMais.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        bttMais.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onOperador(v);
                return true;
            }
        });

        //Butão -
        bttMenos = (Button) findViewById(R.id.butaoMenos);
        bttMenos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        bttMenos.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onOperador(v);
                return true;
            }
        });

        //Butão X
        bttMult = (Button) findViewById(R.id.butaoVezes);
        bttMult.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        bttMult.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onOperador(v);
                return true;
            }
        });

        //Butão /
        bttDiv = (Button) findViewById(R.id.butaoDiv);
        bttDiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        bttDiv.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onOperador(v);
                return true;
            }
        });

        //Butão C
        bttC = (Button) findViewById(R.id.butaoApagar);
        bttC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        bttC.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onC(v);
                return true;
            }
        });

        //Butão CE
        bttCE = (Button) findViewById(R.id.butaoApagTudo);
        bttCE.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        bttCE.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onCE(v);
                return true;
            }
        });

        //Butão =
        bttEq = (Button) findViewById(R.id.butaoIgual);
        bttEq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        bttEq.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                onEqual(v);
                return true;
            }
        });

    }

    public void onNumero(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        String str = b.getText().toString();

        tv.setText(tv.getText() + str);
    }

    public void onOperador(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        if (firstOperation) {
            soma = Double.parseDouble(tv.getText().toString());
            tv.setText("");
            lastOperation = b.getText().toString();
            firstOperation = false;
        } else {
            //playPling
        }
    }

    public void onEqual(View v) {
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        switch (lastOperation) {
            case "+":
                soma += Double.parseDouble(tv.getText().toString());
                break;
            case "-":
                soma -= Double.parseDouble(tv.getText().toString());

                break;
            case "X":
                soma = soma*Double.parseDouble(tv.getText().toString());

                break;
            case "/":
                soma = soma/Double.parseDouble(tv.getText().toString());


                break;
        }

        Intent intent = new Intent(this,ResultActivity.class);
        intent.putExtra("Resultado",soma);
        startActivity(intent);

        soma=0;
        tv.setText("");
        lastOperation = "";
        firstOperation = true;
    }

    public void onCE(View v) {
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        tv.setText("");
        soma = 0;
        firstOperation = true;
    }
    
    public void onC(View v){
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        StringBuilder aux = new StringBuilder(tv.getText());
        aux.deleteCharAt(aux.length() - 1);
        tv.setText(aux.toString());
    }
}
