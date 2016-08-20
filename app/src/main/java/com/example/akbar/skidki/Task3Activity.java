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

public class Task3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public void calculate2(View q) {

        EditText et1 = (EditText) findViewById(R.id.editText5);
        TextView tv = (TextView) findViewById(R.id.textView3);

        String num1 = et1.getText().toString();


        if (num1.equals("")) {
            Toast t = Toast.makeText(this, " Заполните поля ", Toast.LENGTH_LONG);
            t.show();
        } else {

            if (Integer.valueOf(num1) == 3 || Integer.valueOf(num1) == 4 || Integer.valueOf(num1) == 5) {

                tv.setText(" Весна ");
            } else if (Integer.valueOf(num1) == 6 || Integer.valueOf(num1) == 7 || Integer.valueOf(num1) == 8) {

                tv.setText(" Лето ");
            } else if (Integer.valueOf(num1) == 9 || Integer.valueOf(num1) == 10 || Integer.valueOf(num1) == 11) {

                tv.setText(" Осень ");
            } else if (Integer.valueOf(num1) == 12 || Integer.valueOf(num1) == 1 || Integer.valueOf(num1) == 2) {

                tv.setText(" Зима ");
            } else {

                tv.setText(" Нет такого месяца ");
            }
        }

    }
}
