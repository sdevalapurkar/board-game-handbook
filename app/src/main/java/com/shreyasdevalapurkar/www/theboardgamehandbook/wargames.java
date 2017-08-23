package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;

public class wargames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wargames);

        populateWarGames();
        onClickForWarGames();
    }

    private void populateWarGames() {
        String[] wargames = {"Battles of Westeros", "Nexus Ops", "Battleship", "Battle Masters", "Star Wars: The Queen's Gambit",
        "BattleLore", "Axis and Allies 1941", "Kemet", "Risk: Legacy", "Memoir '44"};

        Arrays.sort(wargames);

        //build adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,   //context for the activity
                R.layout.cardgames, //layout to use (create)
                wargames); //items to be displayed

        //configure the list

        ListView wargameslist = (ListView) findViewById(R.id.wargameslist);
        wargameslist.setAdapter(adapter);
    }

    private void onClickForWarGames() {
        ListView wargameslist = (ListView)findViewById(R.id.wargameslist);
        wargameslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                TextView textview = (TextView) viewClicked;
                //String message = "You clicked # " + position + ", which is the game: " + textview.getText().toString();

                //Toast.makeText(cardgames.this, message, Toast.LENGTH_LONG).show();

            }
        });
    }
}
