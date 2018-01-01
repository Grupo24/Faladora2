package com.gps1718.g24.faladora;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;


public class MainActivity extends Activity {
    //lastOperation grava a operação a realizar
    String lastOperation = "";
    //firstOperation diz se é o primeira operação da conta (não é possivel haver mais que uma)
    boolean firstOperation = true;
    //variavel que coleta as informações do ecrã/resultado da conta
    double soma = 0;

    MediaPlayer numum;
    MediaPlayer numdois;
    MediaPlayer numtres;
    MediaPlayer numquatro;
    MediaPlayer numcinco;
    MediaPlayer numseis;
    MediaPlayer numsete;
    MediaPlayer numoito;
    MediaPlayer numnove;
    MediaPlayer numzero;

    MediaPlayer somar;
    MediaPlayer sub;
    MediaPlayer mult;
    MediaPlayer div;
    MediaPlayer apagar;
    MediaPlayer apagado;
    MediaPlayer intro;
    MediaPlayer apagart;
    MediaPlayer tutintro;
    MediaPlayer igual;
    MediaPlayer tdapagado;

    MediaPlayer notif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Por a calculadora em fullscreen
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        numum = MediaPlayer.create(MainActivity.this, R.raw.num1);
        numdois = MediaPlayer.create(MainActivity.this, R.raw.num2);
        numtres = MediaPlayer.create(MainActivity.this, R.raw.num3);
        numquatro = MediaPlayer.create(MainActivity.this, R.raw.num4);
        numcinco = MediaPlayer.create(MainActivity.this, R.raw.num5);
        numseis = MediaPlayer.create(MainActivity.this, R.raw.num6);
        numsete = MediaPlayer.create(MainActivity.this, R.raw.num7);
        numoito = MediaPlayer.create(MainActivity.this, R.raw.num8);
        numnove = MediaPlayer.create(MainActivity.this, R.raw.num9);
        numzero = MediaPlayer.create(MainActivity.this, R.raw.num0);
        somar = MediaPlayer.create(MainActivity.this, R.raw.soma);
        sub = MediaPlayer.create(MainActivity.this, R.raw.sub);
        mult = MediaPlayer.create(MainActivity.this, R.raw.mult);
        div = MediaPlayer.create(MainActivity.this, R.raw.div);
        apagar = MediaPlayer.create(MainActivity.this, R.raw.apagar);
        apagado = MediaPlayer.create(MainActivity.this, R.raw.apagado);
        apagart = MediaPlayer.create(MainActivity.this, R.raw.apagartudo);
        igual = MediaPlayer.create(MainActivity.this, R.raw.igual);
        notif = MediaPlayer.create(MainActivity.this, R.raw.notif);
        intro = MediaPlayer.create(MainActivity.this, R.raw.intro);
        tutintro = MediaPlayer.create(MainActivity.this, R.raw.tut1);
        tdapagado = MediaPlayer.create(MainActivity.this, R.raw.tudoapagado);


        //Definição de todos os botões click e long press
        //Butão 1
        Button btt1;
        btt1 = findViewById(R.id.butaoUm);
        btt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
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
                onSound(v);
            }
        });

        bttCE.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                tdapagado.start();
                onCE(v);
                return true;
            }
        });

        //Butão =
        Button bttEq;
        bttEq = (Button) findViewById(R.id.butaoIgual);
        bttEq.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                onSound(v);
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
                onSound(v);
            }
        });

        bttTut.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {

                DialogFragment newFragment = new onTut();
                newFragment.show(getFragmentManager(), "Tut");
                return true;
            }
        });

    }

    //Função long press dos botões dos numeros (sem componente de som)
    public void onNumero(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        if (tv.getText().equals("") || Double.parseDouble(tv.getText().toString()) < 10000) {
            String str = b.getText().toString();
            tv.setText(tv.getText() + str);
            intro.start();
            lastNum();
        } else {
            playPling();
        }
    }

    //Função long press dos botões dos operadores (sem componente de som)
    public void onOperador(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        if (firstOperation && (tv.getText().toString() != "")) {
            soma = Double.parseDouble(tv.getText().toString());
            tv.setText("");
            lastOperation = b.getText().toString();
            intro.start();
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            switch (lastOperation) {
                case "+":
                    somar.start();
                    break;
                case "-":
                    sub.start();
                    break;
                case "X":
                    mult.start();
                    break;
                case "/":
                    div.start();
                    break;
            }
            firstOperation = false;
        } else {
            playPling();
        }
    }

    //Função long press do botão igual (com componente de som)
    public void onEqual(View v) {
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        int error = 0; //Sem erros

        if (lastOperation != "" && (tv.getText().toString() != "")) {
            if (Double.parseDouble(tv.getText().toString()) == 0 && lastOperation.equals("/")) {
                error = 1; //Erro divisão por 0
            } else {
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
            }
            if (soma > 1000000000 || soma < -100000000) {
                error = 2; //Numero dimensões grandes
            }
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("Resultado", soma);
            intent.putExtra("Erro", error);
            startActivity(intent);
            onCE(v);
        } else {
            playPling();
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
            apagado.start();
            lastNum();
            aux.deleteCharAt(aux.length() - 1);
            tv.setText(aux.toString());
        } else {
            playPling();
        }
    }

    public void onSound(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textoVisor);

        switch ((String) b.getText()) {
            case "1":
                numum.start();
                break;
            case "2":
                numdois.start();
                break;
            case "3":
                numtres.start();
                break;
            case "4":
                numquatro.start();
                break;
            case "5":
                numcinco.start();
                break;
            case "6":
                numseis.start();
                break;
            case "7":
                numsete.start();
                break;
            case "8":
                numoito.start();
                break;
            case "9":
                numnove.start();
                break;
            case "0":
                numzero.start();
                break;
            case "+":
                somar.start();
                break;
            case "-":
                sub.start();
                break;
            case "X":
                mult.start();
                break;
            case "/":
                div.start();
                break;
            case "=":
                igual.start();
                break;
            case "CE":
                apagart.start();
                break;
            case "C":
                if (tv.getText().equals("")) {
                    playPling();
                } else {
                    apagar.start();
                    lastNum();
                }
                break;
            case "?":
                tutintro.start();
                break;
            default:
                playPling();
                break;

        }


    }

    public void playPling() {
        try {
            Uri notification = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone r = RingtoneManager.getRingtone(getApplicationContext(), notification);
            r.play();
            if (!r.isPlaying()) {
                notif.start();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void lastNum() {
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        StringBuilder aux = new StringBuilder(tv.getText());
        try {
            TimeUnit.MILLISECONDS.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        switch ("" + aux.charAt(aux.length() - 1)) {
            case "1":
                numum.start();
                break;
            case "2":
                numdois.start();
                break;
            case "3":
                numtres.start();
                break;
            case "4":
                numquatro.start();
                break;
            case "5":
                numcinco.start();
                break;
            case "6":
                numseis.start();
                break;
            case "7":
                numsete.start();
                break;
            case "8":
                numoito.start();
                break;
            case "9":
                numnove.start();
                break;
            case "0":
                numzero.start();
                break;
        }

    }

    //Função long press do botão Tutorial (sem componente de som)
    public static class onTut extends DialogFragment {
        MediaPlayer tutlido;

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage("Selecionou a opção tutorial: As teclas com números estão dispostos na parte esquerda do ecrã e as operações na parte direita. Os números pares são os botões mais escuros com números brancos e os números ímpares são os botões mais claros com números pretos. As operações que pode realizar são as seguintes por esta ordem, de cima para baixo: Soma, Subtração, Multiplicação e Divisão. Quando pretender finalizar a operação carregue no botão igual no canto inferior direito, que vai abrir uma janela a mostrar o resultado do seu cálculo. Os números e sinais que escrever antes de pressionar o botão “=”  vão aparecer no display no canto superior direito da aplicação");


            tutlido = MediaPlayer.create(builder.getContext(), R.raw.tut);
            tutlido.start();

            return builder.create();
        }

        @Override
        public void onDismiss(DialogInterface dialog) {
            tutlido.stop();
            super.onDismiss(dialog);
        }
    }

}
