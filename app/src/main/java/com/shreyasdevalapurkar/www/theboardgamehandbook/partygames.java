package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.*;

public class partygames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partygames);

        populatePartyGames();
        onClickForPartyGames();
    }

    private void populatePartyGames() {
        String[] partygames = {"Quelf", "Charades", "Pictionary", "Truth or Dare", "Cards Against Humanity"};

        Arrays.sort(partygames);

        //build adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,   //context for the activity
                R.layout.cardgames, //layout to use (create)
                partygames); //items to be displayed

        //configure the list

        ListView partygameslist = (ListView) findViewById(R.id.partygameslist);
        partygameslist.setAdapter(adapter);
    }

    private void onClickForPartyGames() {
        ListView partygameslist = (ListView)findViewById(R.id.partygameslist);
        partygameslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                TextView textview = (TextView) viewClicked;
                //String message = "You clicked # " + position + ", which is the game: " + textview.getText().toString();

                //Toast.makeText(cardgames.this, message, Toast.LENGTH_LONG).show();

                if (textview.getText().toString() == "Cards Against Humanity") {
                    Intent cardsagainsthumanity = new Intent(partygames.this, cardsagainsthumanity.class);
                    startActivity(cardsagainsthumanity);
                }
            }
        });
    }

}
