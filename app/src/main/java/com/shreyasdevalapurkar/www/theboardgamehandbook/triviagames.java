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

public class triviagames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triviagames);

        populateTriviaGames();
        onClickForTriviaGames();
    }

    private void populateTriviaGames() {
        String[] triviagames = {"Jeopardy", "Scene It", "Pass the Popcorn", "Family Feud"};

        Arrays.sort(triviagames);

        //build adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,   //context for the activity
                R.layout.cardgames, //layout to use (create)
                triviagames); //items to be displayed

        //configure the list

        ListView triviagameslist = (ListView) findViewById(R.id.triviagameslist);
        triviagameslist.setAdapter(adapter);
    }

    private void onClickForTriviaGames() {
        ListView triviagameslist = (ListView)findViewById(R.id.triviagameslist);
        triviagameslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                TextView textview = (TextView) viewClicked;
                //String message = "You clicked # " + position + ", which is the game: " + textview.getText().toString();

                //Toast.makeText(cardgames.this, message, Toast.LENGTH_LONG).show();

                if (textview.getText().toString() == "Family Feud") {
                    Intent familyfeud = new Intent(triviagames.this, familyfeud.class);
                    startActivity(familyfeud);
                }
            }
        });
    }

}
