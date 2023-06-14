package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {


    TextView resultTv,solutionTv;
    MaterialButton buttonC,buttonBrackOpen,buttonBrackClose;
    MaterialButton button0,button1,button2,button3,button4,button5,button6,button7,button8,button9;
    MaterialButton buttonAc,buttonDot;
    MaterialButton buttonEquals,buttonPlus,buttonMinus,buttonMultiply,buttonDivide;
    String data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultTv=findViewById(R.id.result_tv);
        solutionTv=findViewById(R.id.solution_tv);

        buttonMinus=findViewById(R.id.button_minus);
        buttonPlus=findViewById(R.id.button_plus);
        buttonMultiply=findViewById(R.id.button_multiply);
        buttonDivide=findViewById(R.id.button_divide);
        buttonDot=findViewById(R.id.button_dot);
        buttonC=findViewById(R.id.button_c);
        buttonAc=findViewById(R.id.button_AC);
        buttonBrackClose=findViewById(R.id.button_close_bracket);
        buttonBrackOpen=findViewById(R.id.button_open_bracket);

        button0=findViewById(R.id.button_0);
        button1=findViewById(R.id.button_1);
        button2=findViewById(R.id.button_2);
        button3=findViewById(R.id.button_3);
        button4=findViewById(R.id.button_4);
        button5=findViewById(R.id.button_5);
        button6=findViewById(R.id.button_6);
        button7=findViewById(R.id.button_7);
        button8=findViewById(R.id.button_8);
        button9=findViewById(R.id.button_9);

        buttonEquals=findViewById(R.id.button_equal);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              data=solutionTv.getText().toString();
              solutionTv.setText(data+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"9");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+".");
            }
        });

        buttonBrackOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"(");
            }
        });

        buttonBrackClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+")");
            }
        });

        buttonAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solutionTv.setText("");
                resultTv.setText("");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data.substring(0,data.length()-1));
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"/");
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"*");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"-");
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data=solutionTv.getText().toString();
                solutionTv.setText(data+"+");
            }
        });

buttonEquals.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        data=solutionTv.getText().toString();

        Context rhino=Context.enter();
        rhino.setOptimizationLevel(-1);
        String final_result;
        Scriptable scriptable=rhino.initStandardObjects();
        final_result=rhino.evaluateString(scriptable,data,"Javascript",1,null).toString();
        resultTv.setText(final_result);
    }
});



    }


}



