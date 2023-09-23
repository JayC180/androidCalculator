package com.cs407.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void addf(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        String sn1 = num1.getText().toString();
        String sn2 = num2.getText().toString();
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        int r = n1 + n2;
        String n = Integer.toString(r);
        goToActivity(n);
    }

    public void subf(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        String sn1 = num1.getText().toString();
        String sn2 = num2.getText().toString();
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        int r = n1 - n2;
        String n = Integer.toString(r);
        goToActivity(n);
    }

    public void mulf(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        String sn1 = num1.getText().toString();
        String sn2 = num2.getText().toString();
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        int r = n1 * n2;
        String n = Integer.toString(r);
        goToActivity(n);
    }

    public void divf(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        String sn1 = num1.getText().toString();
        String sn2 = num2.getText().toString();
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        if (n2 == 0) {
            errActivity();
        }
        else {
            double r = (double)n1 / (double)n2;
            String n = Double.toString(r);
            goToActivity(n);
        }
    }

    public void goToActivity(String n) {
        Intent intent = new Intent(this, result.class);
        intent.putExtra("result", n);
        startActivity(intent);
    }

    public void errActivity() {
        Intent intent = new Intent(this, result.class);
        intent.putExtra("result", "You can't divide by zero.");
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}