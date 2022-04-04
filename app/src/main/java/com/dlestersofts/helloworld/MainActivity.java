package com.dlestersofts.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView textView = findV

    }
    public void greetUser(View view){
        TextView myText = findViewById(R.id.textView2);
        EditText userName = findViewById(R.id.editTextName);
        myText.setText("hello " + userName.getText().toString() + " Welcome to android Development! ");

    }
    public void userDetails(View view) {
        TextView textView3 = findViewById(R.id.textView3);
        TextView textView4 = findViewById(R.id.textView4);
        TextView textView5 = findViewById(R.id.textView5);

        EditText first_name = findViewById(R.id.firstName);
        EditText last_name = findViewById(R.id.latsName);
        EditText email = findViewById(R.id.editEmail);

        textView3.setText(first_name.getText().toString());
        textView4.setText(last_name.getText().toString());
        textView5.setText(email.getText().toString());




    }

}