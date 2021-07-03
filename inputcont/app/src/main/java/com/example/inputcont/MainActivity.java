package com.example.inputcont;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageButton img1;
RadioGroup radiog;
RadioButton radiob1,radiob2;
LinearLayout l1;
Switch s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l1=findViewById(R.id.l1);
        s=findViewById(R.id.s1);
                radiog =findViewById(R.id.rg1);
        radiob1=findViewById(R.id.rb1);
        radiob2=findViewById(R.id.rb2);
        radiog.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb1:
                        Toast.makeText(MainActivity.this, "Male",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rb2:
                        Toast.makeText(MainActivity.this, "Female",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        img1=findViewById(R.id.img1);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "get ur way",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void changecolor(View view) {
        if (s.isChecked()) {
            l1.setBackgroundColor(Color.GREEN);
        } else {
            l1.setBackgroundColor(Color.YELLOW);
        }
    }
}