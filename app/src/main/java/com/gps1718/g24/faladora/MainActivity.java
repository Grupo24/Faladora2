package com.gps1718.g24.faladora;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    //lastOperation grava a operação a realizar
    String lastOperation = "";
    //firstOperation diz se é o primeira operação da conta (não é possivel haver mais que uma)
    boolean firstOperation = true;
    //variavel que coleta as informações do ecrã/resultado da conta
    double soma = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Por a calculadora em fullscreen
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Definição de todos os botões click e long press
        //Butão 1
        Button btt1;
        btt1 = findViewById(R.id.butaoUm);
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
        Button btt2;
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
        Button btt3;
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
        Button btt4;
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
        Button btt5;
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
        Button btt6;
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
        Button btt7;
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
        Button btt8;
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
        Button btt9;
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
        Button btt0;
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
        Button bttMais;
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
        Button bttMenos;
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
        Button bttMult;
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
        Button bttDiv;
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
        Button bttC;
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
        Button bttCE;
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
        Button bttEq;
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

        //Butão Tutorial
        Button bttTut;
        bttTut = (Button) findViewById(R.id.butaoTut);
        bttTut.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSound(v);
            }
        });

        bttTut.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {

                DialogFragment newFragment = new onTut();
                newFragment.show(getFragmentManager(), "Missiles");

                return true;
            }
        });

    }

    //Função long press dos botões dos numeros (sem componente de som)
    public void onNumero(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        String str = b.getText().toString();
        tv.setText(tv.getText() + str);
    }

    //Função long press dos botões dos operadores (sem componente de som)
    public void onOperador(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        if (firstOperation && (tv.getText().toString() != "")) {
            soma = Double.parseDouble(tv.getText().toString());
            tv.setText("");
            lastOperation = b.getText().toString();
            firstOperation = false;
        } else {
            //playPling
        }
    }

    //Função long press do botão igual (sem componente de som)
    public void onEqual(View v) {
        TextView tv = (TextView) findViewById(R.id.textoVisor);

        if (lastOperation != "" && (tv.getText().toString() != "")) {
            switch (lastOperation) {
                case "+":
                    soma += Double.parseDouble(tv.getText().toString());
                    break;
                case "-":
                    soma -= Double.parseDouble(tv.getText().toString());

                    break;
                case "X":
                    soma = soma * Double.parseDouble(tv.getText().toString());

                    break;
                case "/":
                    soma = soma / Double.parseDouble(tv.getText().toString());


                    break;
            }

            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("Resultado", soma);
            startActivity(intent);

            soma = 0;
            tv.setText("");
            lastOperation = "";
            firstOperation = true;
        } else {
            //playPling
        }
    }

    //Função long press do botão Apagar Tudo (sem componente de som)
    public void onCE(View v) {
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        tv.setText("");
        soma = 0;
        lastOperation = "";
        firstOperation = true;
    }

    //Função long press do botão Apagar (sem componente de som)
    public void onC(View v) {
        TextView tv = (TextView) findViewById(R.id.textoVisor);

        if (tv.getText().toString() != "") {
            StringBuilder aux = new StringBuilder(tv.getText());
            aux.deleteCharAt(aux.length() - 1);
            tv.setText(aux.toString());
        } else {
            //playPling
        }
    }

    //Função long press do botão Tutorial (sem componente de som)
    public static class onTut extends DialogFragment {
        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage("Selecionou a opção tutorial: As teclas com números estão dispostos na parte esquerda do ecrã e as operações na parte direita. Os números pares são os botões mais escuros com números brancos e os números ímpares são os botões mais claros com números pretos. As operações que pode realizar são as seguintes por esta ordem, de cima para baixo: Soma, Subtração, Multiplicação e Divisão. Quando pretender finalizar a operação carregue no botão igual no canto inferior direito, que vai abrir uma janela a mostrar o resultado do seu cálculo. Os números e sinais que escrever antes de pressionar o botão “=”  vão aparecer no display no canto superior direito da aplicação");
            return builder.create();
        }
    }

}
