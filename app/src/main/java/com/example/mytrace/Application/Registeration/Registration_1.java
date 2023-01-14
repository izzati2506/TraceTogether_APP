package com.example.mytrace.Application.Registeration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mytrace.R;

public class Registration_1 extends AppCompatActivity {

    Button button3;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registeration_1);
        button3 = (Button) findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Registration_1.this, Registration_2.class));
            }

        });
    }

    // Registration Intent to get to registration page
    public void openRegistration_2() {

        Intent intent3 = new Intent(Registration_1.this, Registration_2.class);
        startActivity(intent3);
    }
}



