package com.example.akbar.skidki;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Task1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void calculate(View q) {
        EditText et1 = (EditText) findViewById(R.id.editText);
        EditText et2 = (EditText) findViewById(R.id.editText2);
        EditText et3 = (EditText) findViewById(R.id.editText3);
        TextView tv = (TextView) findViewById(R.id.textView);

        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();
        String day = et3.getText().toString();

        double sumResult = 0;
        double discount = 0;

        if (day.equals("") || num1.equals("") || num2.equals("")) {
            Toast t = Toast.makeText(Task1Activity.this, "Нет такого дня недели, введите день недели и остальные поля", Toast.LENGTH_LONG);
            t.show();

        } else {
            if (day.equals("Saturday") || day.equals("Sunday")) {
                sumResult = Integer.valueOf(num1) * Double.valueOf(num2) * 0.8;
                discount = Integer.valueOf(num1) * Double.valueOf(num2) * 0.2;
                tv.setText("Ваша скидка " + discount + " сом. " + "Счет за разговоры с учетом скидки " +
                        sumResult + " сом");


            } else {
                sumResult = Integer.valueOf(num1) * Double.valueOf(num2);

                tv.setText("Ваша скидка " + discount + " сом. " + "Счет за разговоры с учетом скидки " +
                        sumResult + " сом");


            }
        }

    }


}


