package com.example.unknown.myservices;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText)findViewById(R.id.editText);
    }

    public void startService(View view){
        Intent intent = new Intent(MainActivity.this,TheService.class);
        startService(intent);
    }


    public void stopService(View view){
        Intent intent = new Intent(MainActivity.this,TheService.class);
        stopService(intent);
    }
}
