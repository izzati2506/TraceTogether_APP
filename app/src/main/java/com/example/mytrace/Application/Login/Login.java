package com.example.mytrace.Application.Login;


import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
//import android.widget.ArrayAdapter;
//import android.widget.Button;
//import android.widget.EditText;
//import android.widget.Spinner;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mytrace.MainActivity;
import com.example.mytrace.R;

//import com.example.mytrace.R;

public class Login extends AppCompatActivity {
EditText email , password;
Button btn_login;
Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);




        email=(EditText) findViewById(R.id.email);
        password=(EditText) findViewById(R.id.password);
        btn_login=(Button) findViewById(R.id.btn_login);
        spinner=(Spinner) findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this, R.array.usertype, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item  );

         spinner.setAdapter(adapter);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String item= spinner.getSelectedItem().toString();
                if(email.getText().toString().equals("Admin")&&password.getText().toString().equals("Admin")&&item.equals("Admin")){

                     //Intent intent=new Intent(activity_home_page.this,home_page.class);
                }
            }
        });


    }

}
