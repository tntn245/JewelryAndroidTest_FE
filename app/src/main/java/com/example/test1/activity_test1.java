package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class activity_test1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);

        Intent intent = getIntent();
        String str = intent.getStringExtra("name");

        EditText textView = findViewById(R.id.textView);
        textView.setText(str);
    }
}