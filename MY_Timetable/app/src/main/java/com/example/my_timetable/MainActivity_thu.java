package com.example.my_timetable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity_thu extends AppCompatActivity {

    ImageButton monImageButton;
    ImageButton tueImageButton;
    ImageButton wedImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_thu);

        monImageButton=(ImageButton)findViewById(R.id.bx);
        tueImageButton=(ImageButton)findViewById(R.id.by);
        wedImageButton=(ImageButton)findViewById(R.id.bz);

        monImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(MainActivity_thu.this, MainActivity_bx_thu.class);
                startActivity(intentLoadNewActivity);
            }
        });

        tueImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(MainActivity_thu.this, MainActivity_by_thu.class);
                startActivity(intentLoadNewActivity);
            }
        });

        wedImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentLoadNewActivity=new Intent(MainActivity_thu.this, MainActivity_bz_thu.class);
                startActivity(intentLoadNewActivity);
            }
        });
    }
}