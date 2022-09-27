package com.example.diceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private Random rng = new Random();
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber = rng.nextInt(20) + 1;
        textView = findViewById(R.id.critical_hit);

        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                textView.setVisibility(View.VISIBLE);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 7:
                imageViewDice.setImageResource(R.drawable.dice7);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 8:
                imageViewDice.setImageResource(R.drawable.dice8);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 9:
                imageViewDice.setImageResource(R.drawable.dice9);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 10:
                imageViewDice.setImageResource(R.drawable.dice10);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 11:
                imageViewDice.setImageResource(R.drawable.dice11);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 12:
                imageViewDice.setImageResource(R.drawable.dice12);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 13:
                imageViewDice.setImageResource(R.drawable.dice13);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 14:
                imageViewDice.setImageResource(R.drawable.dice14);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 15:
                imageViewDice.setImageResource(R.drawable.dice15);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 16:
                imageViewDice.setImageResource(R.drawable.dice16);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 17:
                imageViewDice.setImageResource(R.drawable.dice17);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 18:
                imageViewDice.setImageResource(R.drawable.dice18);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 19:
                imageViewDice.setImageResource(R.drawable.dice19);
                textView.setVisibility(View.INVISIBLE);
                break;
            case 20:
                imageViewDice.setImageResource(R.drawable.dice20);
                textView.setVisibility(View.VISIBLE);
                break;
        }
    }
}