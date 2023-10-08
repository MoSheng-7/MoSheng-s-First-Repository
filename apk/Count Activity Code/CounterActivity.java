package com.example.myapplication;

import android.os.Bundle;
import androidx.annotation.Nullable;

import androidx.appcompat.app.AppCompatActivity;


import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

public class CounterActivity extends AppCompatActivity {
    private int count = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);

        final TextView tvCount = findViewById(R.id.tvCount);

        Button btncount = findViewById(R.id.btn_counter);
        btncount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                {tvCount.setText(Integer.toString(++count));
                }
            }
        });
    }
}
