package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OutputActivity extends AppCompatActivity {
    private TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output2);

        output = findViewById(R.id.output);

        Intent intent = getIntent();
        String result = intent.getStringExtra("message_key");
        output.setText("The Answer is \n"+result);

    }
}
