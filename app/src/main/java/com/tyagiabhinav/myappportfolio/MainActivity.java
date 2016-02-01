package com.tyagiabhinav.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((Button) findViewById(R.id.spotifyBtn)).setOnClickListener(this);
        ((Button) findViewById(R.id.footballScoreBtn)).setOnClickListener(this);
        ((Button) findViewById(R.id.libraryBtn)).setOnClickListener(this);
        ((Button) findViewById(R.id.buildBiggerBtn)).setOnClickListener(this);
        ((Button) findViewById(R.id.readerBtn)).setOnClickListener(this);
        ((Button) findViewById(R.id.capstoneBtn)).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.spotifyBtn:
                Toast.makeText(this,"This button will launch "+ getResources().getString(R.string.app_spotify_streamer) + " app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.footballScoreBtn:
                Toast.makeText(this,"This button will launch "+ getResources().getString(R.string.app_football_scores) + " app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.libraryBtn:
                Toast.makeText(this,"This button will launch "+ getResources().getString(R.string.app_library) + " app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buildBiggerBtn:
                Toast.makeText(this,"This button will launch "+ getResources().getString(R.string.app_build_it_bigger) + " app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.readerBtn:
                Toast.makeText(this,"This button will launch "+ getResources().getString(R.string.app_xyz_reader) + " app!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstoneBtn:
                Toast.makeText(this,"This button will launch "+ getResources().getString(R.string.app_capstone) + " app!", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
