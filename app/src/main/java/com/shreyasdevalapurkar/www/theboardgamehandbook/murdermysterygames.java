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

public class murdermysterygames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murdermysterygames);

        populateMurderGames();
        onClickForMurderGames();
    }

    private void populateMurderGames() {
        String[] murdergames = {"Clue", "Mystery Express", "Murder of Crows", "Spy", "How to Host a Murder"};

        Arrays.sort(murdergames);

        //build adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,   //context for the activity
                R.layout.cardgames, //layout to use (create)
                murdergames); //items to be displayed

        //configure the list

        ListView murdergameslist = (ListView) findViewById(R.id.murdergameslist);
        murdergameslist.setAdapter(adapter);
    }

    private void onClickForMurderGames() {
        ListView murdergameslist = (ListView)findViewById(R.id.murdergameslist);
        murdergameslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                TextView textview = (TextView) viewClicked;
                //String message = "You clicked # " + position + ", which is the game: " + textview.getText().toString();

                //Toast.makeText(cardgames.this, message, Toast.LENGTH_LONG).show();

                if (textview.getText().toString() == "Clue") {
                    Intent clue = new Intent(murdermysterygames.this, clue.class);
                    startActivity(clue);
                }
            }
        });
    }
}
