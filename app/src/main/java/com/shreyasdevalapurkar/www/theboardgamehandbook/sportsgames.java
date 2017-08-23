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

public class sportsgames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sportsgames);

        populateSportsGames();
        onClickForSportsGames();
    }

    private void populateSportsGames() {
        String[] sportsgames = {"NFL Game Day", "Decision Day Fantasy Basketball", "Topps Match Attax Trading Card Game",
        "Spot It - NHL Edition"};

        Arrays.sort(sportsgames);

        //build adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,   //context for the activity
                R.layout.cardgames, //layout to use (create)
                sportsgames); //items to be displayed

        //configure the list

        ListView sportsgameslist = (ListView) findViewById(R.id.sportsgameslist);
        sportsgameslist.setAdapter(adapter);
    }

    private void onClickForSportsGames() {
        ListView sportsgameslist = (ListView)findViewById(R.id.sportsgameslist);
        sportsgameslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                TextView textview = (TextView) viewClicked;
                //String message = "You clicked # " + position + ", which is the game: " + textview.getText().toString();

                //Toast.makeText(cardgames.this, message, Toast.LENGTH_LONG).show();

                if (textview.getText().toString() == "NFL Game Day") {
                    Intent nflgameday = new Intent(sportsgames.this, nflgameday.class);
                    startActivity(nflgameday);
                }
            }
        });
    }
}
