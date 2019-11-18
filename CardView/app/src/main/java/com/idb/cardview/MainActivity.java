package com.idb.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button kesonoBtn, bagoraBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kesonoBtn = findViewById(R.id.kasenoBtn);
        bagoraBtn = findViewById(R.id.bagoraBtn);

        kesonoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,KesenoDetails.class);
                startActivity(intent);

            }
        });

        bagoraBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,BogoraDetails.class);
                startActivity(intent);
            }
        });
    }
}
