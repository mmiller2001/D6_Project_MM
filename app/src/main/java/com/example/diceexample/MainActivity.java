package com.example.diceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import kotlinx.coroutines.MainCoroutineDispatcher;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView textView;
    MediaPlayer player;

    private static int SPLASH_TIME_OUT = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //player.stop();

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });

//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                Intent homeIntent = new Intent(SplashActivity.this, MainActivity.class);
//                startActivity(homeIntent);
//                finish();
//            }
//        }, SPLASH_TIME_OUT);
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;
        textView = findViewById(R.id.critical_hit);

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                textView.setVisibility(View.VISIBLE);
                textView.setText(R.string.criticalMiss);
                player = MediaPlayer.create(this, R.raw.erenjaegar);
                player.start();
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                textView.setVisibility(View.INVISIBLE);
                player = MediaPlayer.create(this, R.raw.rollingdice);
                player.start();
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                textView.setVisibility(View.VISIBLE);
                textView.setText(R.string.criticalHit);
                player = MediaPlayer.create(this, R.raw.oioioi);
                player.start();
                break;
        }
    }
}