package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button additionButton, divisionButton, subtractionButton, multiplicationButton;
    private EditText input1, input2;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        input1 = findViewById(R.id.inputNum1);
        input2 = findViewById(R.id.inputNum2);


        additionButton = findViewById(R.id.additionButton);
        subtractionButton = findViewById(R.id.subtractionButton);
        divisionButton = findViewById(R.id.divisionButton);
        multiplicationButton = findViewById(R.id.multiplicationButton);


        additionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int num1 = Integer.parseInt(input1.getText().toString());
                int num2 = Integer.parseInt(input2.getText().toString());

                int res = num1 + num2;
                String result = res + "";

                Intent intent = new Intent(getApplicationContext(), OutputActivity.class);
                intent.putExtra("message_key", result);
                startActivity(intent);


            }


        });
        subtractionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int num1 = Integer.parseInt(input1.getText().toString());
                int num2 = Integer.parseInt(input2.getText().toString());

                int res = num1 - num2;
                String result = res + "";

                Intent intent = new Intent(getApplicationContext(), OutputActivity.class);
                intent.putExtra("message_key", result);
                startActivity(intent);


            }
        });
        multiplicationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int num1 = Integer.parseInt(input1.getText().toString());
                int num2 = Integer.parseInt(input2.getText().toString());

                int res = num1 * num2;
                String result = res + "";

                Intent intent = new Intent(getApplicationContext(), OutputActivity.class);
                intent.putExtra("message_key", result);
                startActivity(intent);


            }
        });
        divisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int num1 = Integer.parseInt(input1.getText().toString());
                int num2 = Integer.parseInt(input2.getText().toString());

                int res = num1 / num2;
                String result = res + "";

                Intent intent = new Intent(getApplicationContext(), OutputActivity.class);
                intent.putExtra("message_key", result);
                startActivity(intent);


            }
        });
    }
    }







