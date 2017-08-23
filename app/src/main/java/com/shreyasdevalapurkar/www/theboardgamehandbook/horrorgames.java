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

public class horrorgames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horrorgames);

        populateHorrorGames();
        onClickForHorrorGames();
    }

    private void populateHorrorGames() {
        String[] horrorgames = {"Ultimate Werewolf", "Eldritch Horror", "Escape from the Aliens in Outer Space",
        "Betrayal at House on the Hill", "Arkham Horror", "City of Horror", "Carnival Zombie"
                , "Fury of Dracula", "Smash Up", "Hecatomb"};

        Arrays.sort(horrorgames);

        //build adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,   //context for the activity
                R.layout.cardgames, //layout to use (create)
                horrorgames); //items to be displayed

        //configure the list

        ListView horrorgameslist = (ListView) findViewById(R.id.horrorgameslist);
        horrorgameslist.setAdapter(adapter);
    }

    private void onClickForHorrorGames() {
        ListView horrorgameslist = (ListView)findViewById(R.id.horrorgameslist);
        horrorgameslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                TextView textview = (TextView) viewClicked;
                //String message = "You clicked # " + position + ", which is the game: " + textview.getText().toString();

                //Toast.makeText(cardgames.this, message, Toast.LENGTH_LONG).show();

                if (textview.getText().toString() == "Hecatomb") {
                    Intent hecatomb = new Intent(horrorgames.this, hecatomb.class);
                    startActivity(hecatomb);
                }
            }
        });
    }
}
