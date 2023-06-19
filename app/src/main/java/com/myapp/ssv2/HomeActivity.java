package com.myapp.ssv2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button callSignUp = findViewById(R.id.signup_screen);
        callSignUp.setOnClickListener(view -> {
            Intent intent = new Intent(HomeActivity.this,SignUp.class);
            startActivity(intent);
        });

    }
}