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

}