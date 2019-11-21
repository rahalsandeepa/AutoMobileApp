package com.example.automobileassits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button supplier;
    Button client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        supplier = findViewById(R.id.button2);
        client = findViewById(R.id.button);

        supplier.setOnClickListener(this);


    }

    protected void onResume(){
        super.onResume();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button2:
                Intent i = new Intent(this, RegView.class);
                startActivity(i);
                break;
        }
    }
}
