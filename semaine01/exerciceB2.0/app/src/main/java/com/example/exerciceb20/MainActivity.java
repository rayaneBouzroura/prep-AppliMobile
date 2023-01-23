package com.example.exerciceb20;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("activite1");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.activite1:
                Intent i = new Intent(this,MainActivity.class);
                startActivity(i);
                return true;
            case R.id.activite2:
                Intent i2 = new Intent(this,MainActivity2.class);
                startActivity(i2);
                return true;
            case R.id.activite3:
                Intent i3 = new Intent(this,MainActivity3.class);
                startActivity(i3);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}