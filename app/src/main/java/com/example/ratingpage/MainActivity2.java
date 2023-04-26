package com.example.ratingpage;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView tnx,prob;
    ImageView starimage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tnx =(TextView)findViewById(R.id.thanks);
        prob=(TextView)findViewById(R.id.problem);
        starimage=(ImageView) findViewById(R.id.star);


    }
}