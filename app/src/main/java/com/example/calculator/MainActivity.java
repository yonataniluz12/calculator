package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    EditText etnd;
    double num = 0.0;
    double num2 =  0.0;
    Intent si = new Intent(this,History_results.class);
    double sum = 0.0;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        etnd = findViewById(R.id.etnd);
    }
    public boolean Input_test(String str){
        if(str == "+" ){
            if(str.equals("-")){
                if(str == "x"){
                    if(str.equals("/")){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static double opp(double num, int op){
        double sum = 1;
        if(op == 0){
            sum = num;
            return sum;
        }
        if(op == 1){
            sum = sum-1 + num;
            return sum;
        }
        if(op == 2){
            sum = sum-1 - num;
            return sum;
        }
        if(op == 3){
            sum = sum * num;
            return sum;
        }
        if(op == 4){
            sum = sum / num;
            return sum;
        }
        return 0;
    }
    int op = 0;
    public void input(View view) {
        String str = etnd.getText().toString();
        etnd.setHint(str);
        num = Double.parseDouble(str);
        if (op == 0) {
            opp(num, op);
        }
    }
    public void plus(View view) {
        str = etnd.getText().toString();
        if(Input_test(str)) {
            num2 = Double.parseDouble(str);
            if (op == 0) {
                sum = num2;
            } else {
                opp(num2, op);
            }
            op = 1;
            etnd.setText(" ");
            etnd.setHint(str + "  +");
        }
        else {
            etnd.setHint("ERROR");
        }
    }

    public void minus(View view) {
        str = etnd.getText().toString();
        if(Input_test(str)) {
            num2 = Double.parseDouble(str);
            if (op == 0) {
                sum = num2;
            } else {
                opp(num2, op);
            }
            op = 2;
            etnd.setText(" ");
            etnd.setHint(str + "  -");
        }
        else {
            etnd.setHint("ERROR");
        }
    }


    public void kaful(View view) {
        str = etnd.getText().toString();
        if(Input_test(str)) {
            num2 = Double.parseDouble(str);
            if (op == 0) {
                sum = num2;
            } else {
                opp(num2, op);
            }
            op = 3;
            etnd.setText(" ");
            etnd.setHint(str + "x");
        }
        else {
            etnd.setHint("ERROR");
        }
    }

    public void helkey(View view) {
        str = etnd.getText().toString();
        if(Input_test(str)) {
            num2 = Double.parseDouble(str);
            if (op == 0) {
                sum = num2;
            } else {
                opp(num2, op);
            }
            op = 4;
            etnd.setText(" ");
            etnd.setHint(str + "/");
        }
        else {
            etnd.setHint("ERROR");
        }
    }

    public void mehika(View view) {
        etnd.setHint("0");
        sum =0;
        op = 19;
    }

    public void shave(View view) {
        if(Input_test(str)){
            num2 = Double.parseDouble(str);
            etnd.setText(" ");
            etnd.setText(str);
        }
        else {
            etnd.setHint("ERROR");
        }
    }

    public void histori(View view) {
        si.putExtra("a",sum);
        startActivity(si);
    }
}