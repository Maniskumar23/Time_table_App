package com.example.my_timetable;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageButton monImageButton;
    ImageButton tueImageButton;
    ImageButton wedImageButton;
    ImageButton thuImageButton;
    ImageButton friImageButton;
    ImageButton satImageButton;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monImageButton=(ImageButton)findViewById(R.id.mon);
        tueImageButton=(ImageButton)findViewById(R.id.tue);
        wedImageButton=(ImageButton)findViewById(R.id.wed);
        thuImageButton=(ImageButton)findViewById(R.id.thu);
        friImageButton=(ImageButton)findViewById(R.id.fri);
        satImageButton=(ImageButton)findViewById(R.id.sat);

        monImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intentLoadNewActivity);
            }
        });
        tueImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(MainActivity.this, MainActivitytue.class);
                startActivity(intentLoadNewActivity);
            }
        });

        wedImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(MainActivity.this, MainActivity_wed.class);
                startActivity(intentLoadNewActivity);
            }
        });

        thuImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(MainActivity.this, MainActivity_thu.class);
                startActivity(intentLoadNewActivity);
            }
        });

        friImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(MainActivity.this, MainActivity_fri.class);
                startActivity(intentLoadNewActivity);
            }
        });

        satImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(MainActivity.this, MainActivity_sat.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}