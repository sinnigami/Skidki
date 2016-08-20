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

public class Task2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void calculate2(View q) {
        EditText et4 = (EditText) findViewById(R.id.editText4);
        TextView tv = (TextView) findViewById(R.id.textView2);

        String num1 = et4.getText().toString();

        double sumResult = 0;
        double discount = 0;
        if (num1.equals("")) {
            Toast t = Toast.makeText(this, " Заполните поля ", Toast.LENGTH_LONG);
            t.show();
        } else {
            if (Integer.valueOf(num1) >= 500 && Integer.valueOf(num1) < 1000) {
                sumResult = Integer.valueOf(num1) * 0.97;
                discount = Integer.valueOf(num1) * 0.03;
                tv.setText(" Ваша скидка " + discount + " сом. " + " Сумма покупки с учетем скидки " + String.valueOf(sumResult) + " сом ");
            } else if (Integer.valueOf(num1) >= 1001) {
                sumResult = Integer.valueOf(num1) * 0.95;
                discount = Integer.valueOf(num1) * 0.05;
                tv.setText(" Ваша скидка " + discount + " сом. " + " Сумма покупки с учетем скидки " + String.valueOf(sumResult) + " сом ");
            } else {
                sumResult = Integer.valueOf(num1);
                tv.setText(" Ваша скидка " + discount + "сом. " + " Сумма покупки " + String.valueOf(sumResult) + " сом ");
            }
        }
    }


}
