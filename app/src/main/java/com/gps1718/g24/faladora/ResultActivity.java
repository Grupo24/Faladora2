package com.gps1718.g24.faladora;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class ResultActivity extends Activity {

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
    MediaPlayer ponto;

    MediaPlayer iguala;
    MediaPlayer div0;
    MediaPlayer big;

    int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_result);

        numum = MediaPlayer.create(ResultActivity.this, R.raw.num1);
        numdois = MediaPlayer.create(ResultActivity.this, R.raw.num2);
        numtres = MediaPlayer.create(ResultActivity.this, R.raw.num3);
        numquatro = MediaPlayer.create(ResultActivity.this, R.raw.num4);
        numcinco = MediaPlayer.create(ResultActivity.this, R.raw.num5);
        numseis = MediaPlayer.create(ResultActivity.this, R.raw.num6);
        numsete = MediaPlayer.create(ResultActivity.this, R.raw.num7);
        numoito = MediaPlayer.create(ResultActivity.this, R.raw.num8);
        numnove = MediaPlayer.create(ResultActivity.this, R.raw.num9);
        numzero = MediaPlayer.create(ResultActivity.this, R.raw.num0);
        ponto = MediaPlayer.create(ResultActivity.this,R.raw.ponto);

        iguala = MediaPlayer.create(ResultActivity.this,R.raw.iguala);
        div0 = MediaPlayer.create(ResultActivity.this,R.raw.div0);
        big = MediaPlayer.create(ResultActivity.this, R.raw.ng);

        TextView tv = (TextView) findViewById(R.id.textView2);

        tv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int error = getIntent().getIntExtra("Erro", 0);
                float result = (float) getIntent().getDoubleExtra("Resultado", 0);
                execFunk(error,result);
            }
        });

        tv.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                finish();
                return true;
            }
        });

        tv.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                int error = getIntent().getIntExtra("Erro", 0);
                float result = (float) getIntent().getDoubleExtra("Resultado", 0);
                if (flag != 0) {
                    execFunk(error, result);
                } else {
                    TextView tv = (TextView) findViewById(R.id.textView2);
                    switch (error) {
                        case 1:
                            tv.setText("Erro: Divisão por Zero");
                            break;
                        case 2:
                            tv.setText("Numero de dimensões grandes: " + result);
                            break;
                        default:
                            tv.setText("" + result);
                            break;
                    }
                    flag++;
                }
            }
        });
    }


    public void execFunk(int error, float result) {

        TextView tv = (TextView) findViewById(R.id.textView2);
        switch (error) {
            case 1:
                div0.start();
                break;
            case 2:
                big.start();
                break;
            default:
                onSoundResult();
                break;
        }

    }

    public void onSoundResult() {

        TextView tv = (TextView) findViewById(R.id.textView2);
        StringBuilder builder = new StringBuilder(tv.getText().toString());
        int i = 0;
        iguala.start();
        do {
            timeOut();
            switch ("" + builder.charAt(i)) {
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
                default:
                    ponto.start();
                    break;
            }
            i++;
        } while (i < builder.length());
    }

    void timeOut() {
        try {
            TimeUnit.MILLISECONDS.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
