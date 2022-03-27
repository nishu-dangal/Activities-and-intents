package com.example.twoactivitieschallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final int TEXT_REQUEST = 1;

    private static final String LOG_TAG =
            MainActivity.class.getSimpleName();
    private Button mReplyHeadTextView;
    private Button mReplyTextView;

    public static final String EXTRA_MESSAGE = "com.example.android.TwoActivities.extra.MESSAGE";

    private Button mMessageEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        String message = null;
        if (view.getId() == R.id.button_first){
            message = "1";
        }
        else if (view.getId() == R.id.button_second){
            message = "2";
        }
        else if (view.getId() == R.id.button_third){
            message = "3";
        }
        intent.putExtra("button_id",message);
        startActivity(intent);
    }
    }

