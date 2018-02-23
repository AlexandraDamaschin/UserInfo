package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        image view
        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.profil_picture);
    }
}
