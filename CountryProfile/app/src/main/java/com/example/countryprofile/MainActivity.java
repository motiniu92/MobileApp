package com.example.countryprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangladeshBtn, indiaBtn, pakistanBtn;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshBtn = findViewById(R.id.bangladeshBtn);
        indiaBtn = findViewById(R.id.indiaBtn);
        pakistanBtn = findViewById(R.id.pakistanBtn);

        bangladeshBtn.setOnClickListener(this);
        indiaBtn.setOnClickListener(this);
        pakistanBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.bangladeshBtn) {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "bangladesh");
            startActivity(intent);
        }

        if (view.getId() == R.id.indiaBtn) {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "india");
            startActivity(intent);
        }

        if (view.getId() == R.id.pakistanBtn) {
            intent = new Intent(MainActivity.this, ProfileActivity.class);
            intent.putExtra("name", "pakistan");
            startActivity(intent);
        }
    }
}