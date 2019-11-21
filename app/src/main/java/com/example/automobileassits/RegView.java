package com.example.automobileassits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.MalformedParameterizedTypeException;

public class RegView extends AppCompatActivity{

    Button register1;
    Button sign;
    Button view;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_view);
        sign = (Button) findViewById(R.id.button5);
        register1 = (Button)findViewById(R.id.button3);

    }

    protected void onResume (){
        super.onResume();

        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(),Registrationpage.class);
                startActivity(i);
            }
        });
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getBaseContext(), Login_page.class);
                startActivity(i);
            }
        });
    }

}
