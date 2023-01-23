package com.example.communicationactivite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.communicationactivite.databinding.ActivityMainBinding;
import com.example.communicationactivite.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
    TextView tv;
    ActivitySecondBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Intent i = getIntent();
        tv = binding.tvAct2;
        String msg = i.getStringExtra("t");
        tv.setText(msg);
    }
}