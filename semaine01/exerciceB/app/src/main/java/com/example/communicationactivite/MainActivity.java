package com.example.communicationactivite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.communicationactivite.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText text;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        btn = binding.btn01;
        text = binding.textEnvoyer;
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("t",text.getText().toString());
                startActivity(i);
            }
        });
    }

}