package com.example.mytrace.Application.Home_Page;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mytrace.Application.Dependent.DependentPage;
import com.example.mytrace.Application.Profile.UserProfile;
import com.example.mytrace.R;

public class User_homepage extends AppCompatActivity {

ImageView Profile_img_pag, icon_depen ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_homepage);

        Profile_img_pag=(ImageView) findViewById(R.id.language_img_pag);
        icon_depen=(ImageView) findViewById(R.id.icon_depen);

     // this listener to get to user profile page
        Profile_img_pag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_homepage.this, UserProfile.class));
            }
        });
        // this listener to get to Dependent page
        icon_depen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(User_homepage.this, DependentPage.class));
            }
        });

    }

    // this Intent to get to user profile page
    public void openUserProfile() {
        Intent intent3 = new Intent(User_homepage.this, UserProfile.class);
        startActivity(intent3);
    }
    // this intent to get to Dependent  page
    public void openDependentPage() {
        Intent intent3 = new Intent(User_homepage.this, DependentPage.class);
        startActivity(intent3);
    }

}

