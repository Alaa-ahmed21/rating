package com.example.ratingpage;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tex_rate,tex_rec,tex_issue;
    ImageView image_rating;
    RatingBar ratingBar;
    EditText ET_COMMENT;
    Button SUP;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tex_rate = findViewById(R.id.rate);
        tex_rec = findViewById(R.id.rate_rec);
        tex_issue= findViewById(R.id.issue);
        image_rating= findViewById(R.id.r_image);
        ratingBar=findViewById(R.id.rate_bar);
        ET_COMMENT= findViewById(R.id.comment);
        SUP= findViewById(R.id.submite);
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                if (rating==1||rating==1.5)
                {
                    tex_rec.setText("Bad");
                }
                else if (rating==2||rating==2.5)
                {
                    tex_rec.setText("NOT BAD");
                }
                else if (rating==3||rating==3.5)
                {
                    tex_rec.setText("GOOD");
                }
                else if (rating==4||rating==4.5)
                {
                    tex_rec.setText("EXCELLENT");
                }
                else {
                    tex_rec.setText("AMAZING");
                }
            }
        });
        SUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity2();

            }
        });

    }
    public void openMainActivity2(){
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}