package com.example.sobrecargametodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator obj_calculator = new Calculator();

        obj_calculator.add(5, 4);
        Log.i("MyTag", Integer.toString(obj_calculator.getSum()));
        obj_calculator.add(9, 10, 3);
        Log.i("MyTag", Integer.toString(obj_calculator.getSum()));
        obj_calculator.add(5.3f, 8.3f);
        Log.i("MyTag", Integer.toString(obj_calculator.getSum()));
        obj_calculator.add(4.6, 7.8);
        Log.i("MyTag", Integer.toString(obj_calculator.getSum()));
    }
}