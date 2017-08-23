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

public class historicalgames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historicalgames);

        populateHistoricalGames();
        onClickForHistoricalGames();
    }

    private void populateHistoricalGames() {
        String[] historicalgames = {"Tafl", "The Landlord's Game (Monopoly)", "Vaikuntapaali (Snakes and Ladders)",
                "Agricola", "Archipelago", "Asgard's Chosen", "Catan: Settlers of America - Trails to Rails",
                "Dominion", "Eketorp"};

        Arrays.sort(historicalgames);

        //build adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,   //context for the activity
                R.layout.cardgames, //layout to use (create)
                historicalgames); //items to be displayed

        //configure the list

        ListView historicalgameslist = (ListView) findViewById(R.id.historicalgameslist);
        historicalgameslist.setAdapter(adapter);
    }

    private void onClickForHistoricalGames() {
        ListView historicalgameslist = (ListView)findViewById(R.id.historicalgameslist);
        historicalgameslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                TextView textview = (TextView) viewClicked;
                //String message = "You clicked # " + position + ", which is the game: " + textview.getText().toString();

                //Toast.makeText(cardgames.this, message, Toast.LENGTH_LONG).show();

                if (textview.getText().toString() == "Eketorp") {
                    Intent eketorp = new Intent(historicalgames.this, eketorp.class);
                    startActivity(eketorp);
                }
            }
        });
    }
}
