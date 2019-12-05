package com.example.explicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameET, passwordET;
    private Button loginBtn;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //initialize
        usernameET = findViewById(R.id.usernameET);
        passwordET = findViewById(R.id.passwordET);
        loginBtn = findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 username = usernameET.getText().toString().trim();
                 password = passwordET.getText().toString().trim();

                 if (username.equals("motin") && password.equals("1234")){

                     Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                 intent.putExtra("username", username);
                 startActivity(intent);
                     Toast.makeText(LoginActivity.this, "Please Enter your username and password correctly", Toast.LENGTH_SHORT).show();
                 }else {


                 }
            }
        });
    }
}
