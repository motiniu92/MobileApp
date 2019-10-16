package com.example.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    /*
    1.declare the variables
    2.create the initialize method
    3. setOnclick listener for the button and keep the data inside a variable
    4. create an object of intent and setAction, setData inside the button listerner and start the activity
     */


    private EditText phoneNumber;
    private Button callBtn;
    private String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // invoked the init method
        init();
        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number = phoneNumber.getText().toString().trim();

                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:"+number));
                startActivity(intent);
            }
        });
    }

    //initialize the method
    public void init(){
        phoneNumber = findViewById(R.id.phoneNumberET);
        callBtn = findViewById(R.id.callBtn);
    }
}
