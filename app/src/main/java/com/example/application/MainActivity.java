package com.example.application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnOurButton;
    TextView txtOurTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOurButton = findViewById(R.id.button);
        txtOurTextView = findViewById(R.id.textView);
        btnOurButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtOurTextView.setText("button clicked");
                txtOurTextView.setVisibility(View.VISIBLE);
                Toast.makeText(MainActivity.this,"click the button",Toast.LENGTH_LONG).show();
            }
        });
    }
}