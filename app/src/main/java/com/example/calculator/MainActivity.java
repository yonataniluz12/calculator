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
    String str;
    int op = -1;
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

    public boolean isNum(){
        str= etnd.getText().toString();
        etnd.setText("");
        if (str.matches("-?\\d+(\\.\\d+)?")) {
            num2 = Double.parseDouble(str);
            return true;
        }
        return false;
    }
    public void arithmetic_operations(){
        if (op == 1) {num += num2;}
        else if (op == 2) {num -= num2;}
        else if (op == 3) {num *= num2;}
        else if (op == 4) {num /= num2;}
    }
    public void go1(View view) {
        if (op != 5) {
            if (isNum()) {
                if (op != -1)
                    arithmetic_operations();
                else
                    num = num2;
                etnd.setHint("" + num + "+");
                op=1;
            }
        }
        else if(str=="") {
            etnd.setText("");
            etnd.setHint(""+num+"+");
            op = 1;
        }

    }
    public void go2(View view) {
        if (op != 5) {
            if (isNum()) {
                if (op != -1)
                    arithmetic_operations();
                else
                    num = num2;
                etnd.setHint("" + num + "-");
                op=2;
            }
        }
        else if(str=="") {
            etnd.setText("");
            etnd.setHint(""+num+"-");
            op = 2;
        }
    }
    public void go3(View view) {
        if (op != 5) {
            if (isNum()) {
                if (op != -1)
                    arithmetic_operations();
                else
                    num = num2;
                etnd.setHint("" + num + "*");
                op=3;
            }
        }
        else if(str=="") {
            etnd.setText("");
            etnd.setHint(""+num+"*");
            op = 3;
        }
    }
    public void go4(View view) {
        if (op != 5) {
            if (isNum()) {
                if (op != -1)
                    arithmetic_operations();
                else
                    num = num2;
                etnd.setHint("" + num + "/");
                op = 4;
            }
        }
        else if(str=="") {
            etnd.setText("");
            etnd.setHint(""+ num+"/");
            op = 4;
        }
    }
    public void go5(View view) {
        if (isNum()) {
            if (op != -1) {
                if (op != 5)
                    arithmetic_operations();
            }
            else
                num = num2;
            etnd.setHint(""+num);
            op = 5;
            str = "";
        }
    }
    public void go6(View view) {
        op=-1; num=0;
        etnd.setText("");
        etnd.setHint("");
    }
    public void histori(View view) {
        Intent si = new Intent(this, History_results.class);
        si.putExtra("a",num);
        startActivity(si);
    }
}