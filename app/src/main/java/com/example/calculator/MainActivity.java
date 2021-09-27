package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickFunction1(View view){
        EditText myTextField = (EditText) findViewById(R.id.editText);
        EditText myTextField2 = (EditText) findViewById(R.id.editText2);

        Integer int1 = Integer.parseInt(myTextField.getText().toString());
        Integer int2 = Integer.parseInt(myTextField2.getText().toString());


        goToActivity1(int1, int2);
    }

    public void goToActivity1(Integer s, Integer t){
        Intent intent = new Intent(this, MainActivity2.class);
        Integer val = s+t;
        String str1 = val.toString();
        intent.putExtra("message", str1);
        startActivity(intent);
    }

    public void clickFunction2(View view){
        EditText myTextField = (EditText) findViewById(R.id.editText);
        EditText myTextField2 = (EditText) findViewById(R.id.editText2);

        Integer int1 = Integer.parseInt(myTextField.getText().toString());
        Integer int2 = Integer.parseInt(myTextField2.getText().toString());

        goToActivity2(int1, int2);
    }

    public void goToActivity2(Integer s, Integer t){
        Intent intent = new Intent(this, MainActivity2.class);
        Integer val = s-t;
        String str1 = val.toString();
        intent.putExtra("message", str1);
        startActivity(intent);
    }
    public void clickFunction3(View view){
        EditText myTextField = (EditText) findViewById(R.id.editText);
        EditText myTextField2 = (EditText) findViewById(R.id.editText2);

        Double int1 = Double.parseDouble(myTextField.getText().toString());
        Double int2 = Double.parseDouble(myTextField2.getText().toString());

        goToActivity3(int1, int2);
    }

    public void goToActivity3(Double s, Double t){
        Intent intent = new Intent(this, MainActivity2.class);
        Double val = s*t;
        String str1 = val.toString();
        intent.putExtra("message", str1);
        startActivity(intent);
    }
    public void clickFunction4(View view){
        EditText myTextField = (EditText) findViewById(R.id.editText);
        EditText myTextField2 = (EditText) findViewById(R.id.editText2);

        Double int1 = Double.parseDouble(myTextField.getText().toString());
        Double int2 = Double.parseDouble(myTextField2.getText().toString());

        goToActivity4(int1, int2);
    }

    public void goToActivity4(Double s, Double t){
        Intent intent = new Intent(this, MainActivity2.class);
        Double val = s/t;
        String str1 = val.toString();
        intent.putExtra("message", str1);
        startActivity(intent);
    }
}