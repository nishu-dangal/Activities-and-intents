package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String message = intent.getStringExtra("button_id");
        TextView textView = findViewById(R.id.text_message);
        if (message.equals("1")) {
            textView.setText(getResources().getString(R.string.TextOneMessage));

        } else if (message.equals("2")) {
            textView.setText(getResources().getString(R.string.TextTwoMessage));

        } else if (message.equals("3")) {
            textView.setText(getResources().getString(R.string.TextThreeMessage));
        }
    }
    }

