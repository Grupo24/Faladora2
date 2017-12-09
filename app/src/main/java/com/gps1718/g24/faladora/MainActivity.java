package com.gps1718.g24.faladora;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    String lastOperation = "";
    boolean firstOperation = true;
    double soma = 0, valor1 = 0, valor2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onNumero(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        String str = b.getText().toString();

        tv.setText(tv.getText() + str);
    }

    public void onSoma(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        if (firstOperation) {
            soma += Double.parseDouble(tv.getText().toString());
            tv.setText("");
            lastOperation = b.getText().toString();
        } else {
            tv.setText("");
            lastOperation = b.getText().toString();
            firstOperation = true;
        }
    }

    public void onSub(View v) {
        Button b = (Button) v;
        TextView tv = (TextView) findViewById(R.id.textoVisor);

        if (firstOperation) {
            soma -= Double.parseDouble(tv.getText().toString());
            tv.setText("");
            lastOperation = b.getText().toString();
        } else {
            tv.setText("");
            lastOperation = b.getText().toString();
            firstOperation = true;
        }
    }

    public void onEqual(View v) {
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        switch (lastOperation) {
            case "+":
                soma += Double.parseDouble(tv.getText().toString());
                tv.setText(String.valueOf(soma));
                break;
            case "-":
                soma -= Double.parseDouble(tv.getText().toString());
                tv.setText(String.valueOf(soma));

                break;
        }
        lastOperation = "";
        firstOperation = false;
    }

    public void onClear(View v) {
        TextView tv = (TextView) findViewById(R.id.textoVisor);
        tv.setText("");
        soma = 0;
        firstOperation = true;
    }
}
