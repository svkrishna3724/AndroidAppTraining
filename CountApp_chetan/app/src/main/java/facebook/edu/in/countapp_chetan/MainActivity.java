package facebook.edu.in.countapp_chetan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
int count1=0;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text1);
    }

    public void count(View view) {
        count1++;
        textView.setText(""+count1);


    }

    public void toast(View view) {
        /*dispaly message in specific duration*/
        Toast.makeText(this,"Good Morning",Toast.LENGTH_LONG).show();
    }
}