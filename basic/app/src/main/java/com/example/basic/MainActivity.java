package com.example.basic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    int inc=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
    }

    public void inc(View view) {
        inc++;
        t1.setText(""+inc);
    }

    public void mes(View view) {
        Toast.makeText(this,"have fun",Toast.LENGTH_LONG).show();
    }

    public void ini(View view) {
        int ini=0;
        inc=ini;
        t1.setText(""+ini);
    }

    public void de(View view) {
        int de;
        de=inc;
        inc--;
        t1.setText(""+de);

    }
}