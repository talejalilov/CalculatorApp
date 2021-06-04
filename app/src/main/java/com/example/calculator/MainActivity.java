package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    Button btnClear, btnBracket, btnPercent, btnDivision, btnMultiply, btnMinus, btnPlus, btnEqual, btnPoint, btn0,btn1, btn2, btn3, btn4, btn5, btn6,
    btn7, btn8, btn9;
    TextView tvInput, tvOutput;
    String process;
    Boolean checkBracket =true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClear = findViewById(R.id.clearBtn);
        btnBracket = findViewById(R.id.btnBracket);
        btnPercent = findViewById(R.id.btnPercent);
        btnDivision = findViewById(R.id.btnDivision);
        btnMultiply = findViewById(R.id.btnMultiply);
        btnMinus= findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnEqual = findViewById(R.id.btnEqual);
        btnPoint = findViewById(R.id.btnPoint);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        tvInput = findViewById(R.id.tv_input);
        tvOutput = findViewById(R.id.tv_output);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
            }
        });

        btnBracket.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if(checkBracket) {
                    process = tvInput.getText().toString();
                    tvInput.setText(process+ "(");
                    checkBracket =false;
                }else {
                    process = tvInput.getText().toString();
                    tvInput.setText( process+ ")");
                    checkBracket=true;
                }

            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "%");
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "÷");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "×");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "+");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "-");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "4");
            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "5");
            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "6");
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  "0");
            }
        });

        btnPoint.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();
                tvInput.setText(process +  ".");
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = tvInput.getText().toString();

                process = process.replaceAll("×","*");
                process = process.replaceAll("%","/100");
                process = process.replaceAll("÷","/");

                Context  rhino = Context.enter();

                rhino.setOptimizationLevel(-1);

                String finalResult = "";

                try{

                    Scriptable scriptable = rhino.initStandardObjects();
                    finalResult = rhino.evaluateString(scriptable,process, "javascript", 1,null).toString();

                }catch (Exception e){
                    e.printStackTrace();
                    finalResult="0";
                }
                tvOutput.setText(finalResult);
            }
        });







    }
}