package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView4 = (TextView) findViewById(R.id.textView4);
        Intent intent = getIntent();

        String str = intent.getStringExtra("message");
        textView4.setText(str);
    }
}