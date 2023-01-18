package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class History_results extends AppCompatActivity {
    Button btn;
    TextView tv;
    double x;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_results);
        btn = findViewById(R.id.btn);
        tv = findViewById(R.id.tv);
        Intent hi = getIntent();
        x = hi.getIntExtra("a", -999);
        tv.setText("The final result is: " + x);
    }


    public void go(View view) {
        Intent back = new Intent(this, MainActivity.class);
        startActivity(back);
    }
}