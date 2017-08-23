package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstPage extends AppCompatActivity {

    public Button but1;
    public Button but2;
    public Button but3;
    public Button but4;
    public Button but5;
    public Button but6;
    public Button but7;
    public Button but8;
    public Button but9;
    public Button but10;
    public Button but11;

    public void showcardgames() {

        but1 = (Button)findViewById(R.id.cardgamesbutton);
        but2 = (Button)findViewById(R.id.mindgamesbutton);
        but3 = (Button)findViewById(R.id.wordgamesbutton);
        but4 = (Button)findViewById(R.id.roleplayinggamesbutton);
        but5 = (Button)findViewById(R.id.horrorgamesbutton);
        but6 = (Button)findViewById(R.id.historicalgamesbutton);
        but7 = (Button)findViewById(R.id.wargamesbutton);
        but8 = (Button)findViewById(R.id.sportsgamesbutton);
        but9 = (Button)findViewById(R.id.partygamesbutton);
        but10 = (Button)findViewById(R.id.triviagamesbutton);
        but11 = (Button)findViewById(R.id.murdermysterygamesbutton);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, cardgames.class);
                startActivity(toy);

            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, mindgames.class);
                startActivity(toy);

            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, wordgames.class);
                startActivity(toy);

            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, roleplayinggames.class);
                startActivity(toy);
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, horrorgames.class);
                startActivity(toy);
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, historicalgames.class);
                startActivity(toy);
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, wargames.class);
                startActivity(toy);
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, sportsgames.class);
                startActivity(toy);
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, partygames.class);
                startActivity(toy);
            }
        });

        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, triviagames.class);
                startActivity(toy);
            }
        });

        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent toy = new Intent(FirstPage.this, murdermysterygames.class);
                startActivity(toy);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        showcardgames();
    }
}
