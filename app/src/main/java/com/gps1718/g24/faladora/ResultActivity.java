package com.gps1718.g24.faladora;

        import android.app.Activity;
        import android.os.Bundle;
        import android.view.View;
        import android.view.Window;
        import android.view.WindowManager;
        import android.widget.TextView;

public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
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
