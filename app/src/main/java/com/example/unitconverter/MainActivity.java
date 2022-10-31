package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView1;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        textView1 = findViewById(R.id.textView1);
        editText = findViewById(R.id.editText);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "Hi, Click Listener Worked!", Toast.LENGTH_SHORT).show();
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pounds = 2.205 * kg;
//                textView1.setText("The corresponding value in pounds is " + pounds);
//            }
//        });
    }

    public void convertKgToPounds(View view){
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pounds = 2.205 * kg;
        textView1.setText("The corresponding value in pounds is " + pounds);
    }
}