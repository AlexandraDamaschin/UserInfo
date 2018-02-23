package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        image view
        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.profil_picture);

        //text view with name
        TextView name= (TextView) findViewById(R.id.name);
        name.setText("Alexandra Damaschin");

        //text view with birthday date
        TextView birthday = (TextView) findViewById(R.id.birthday);
        birthday.setText("25 Sept 1996");

        //text view with country
        TextView country = (TextView) findViewById(R.id.country);
        country.setText("Romania/Ireland");
    }
}
