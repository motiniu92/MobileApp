package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView showUserNameTV;
    private String username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        showUserNameTV = findViewById(R.id.showUsernameTV);
        username = getIntent().getStringExtra("username");
        showUserNameTV.setText("Hello  " + username);
    }
}
