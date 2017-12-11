package com.gps1718.g24.faladora;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText(""+getIntent().getDoubleExtra("Resultado",0));
        tv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //onSoundResult(v);
            }
        });

        tv.setOnLongClickListener(new View.OnLongClickListener() {
            public boolean onLongClick(View v) {
                finish();
                return true;
            }
        });
    }
}
