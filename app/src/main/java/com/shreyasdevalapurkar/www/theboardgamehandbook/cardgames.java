package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.util.*;
import java.lang.String;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
For list of card games:
    - need array of options --> ArrayAdapter --> ListView

    List View: {views: cardgames.xml}
*/

public class cardgames extends AppCompatActivity {

    //EditText editText;
    //ArrayAdapter<String> adapter;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardgames);

        populateCardGames();
        onClickForCardGames();

        /*
        editText = (EditText) findViewById(R.id.txtsearch);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (s.toString().equals("")) {
                    //reset list view
                    populateCardGames();
                } else {
                    //perform search
                    searchItem(s.toString());
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /*
    public void searchItem(String texttosearch) {

        String[] cardGames = {"Go Fish", "Solitaire", "Signal", "President", "Castle", "Cribbage", "Hearts", "Blackjack",
                "Crazy Eights", "Euchre", "Spades", "War", "Canasta", "Pinochle", "Old Maid", "Spit", "Slapjack",
                "500 Rum", "Guts", "Bridge", "Emperor", "Pepper", "Snap", "Bingo", "Pig", "Authors", "Klondike"};

        for(int i = 0; i < cardGames.length; i++) {
            if(texttosearch == cardGames[i]) {
                adapter.notifyDataSetChanged();
            }
        }

    }
    */
    }
    private void populateCardGames() {
        //get list view to work with and then populate

        //create list

        String[] cardGames = {"Go Fish", "Solitaire", "Signal", "President", "Castle", "Cribbage", "Hearts", "Blackjack",
                "Crazy Eights", "Euchre", "Spades", "War", "Canasta", "Pinochle", "Old Maid", "Spit", "Slapjack",
                "500 Rum", "Guts", "Bridge", "Emperor", "Pepper", "Snap", "Bingo", "Pig", "Authors", "Klondike"};

        Arrays.sort(cardGames);

        //build adapter

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,   //context for the activity
                R.layout.cardgames, //layout to use (create)
                cardGames); //items to be displayed

        //configure the list

        ListView cardgamelist = (ListView) findViewById(R.id.cardgamelist);
        cardgamelist.setAdapter(adapter);
    }

    private void onClickForCardGames() {
        ListView cardgamelist = (ListView) findViewById(R.id.cardgamelist);
        cardgamelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                TextView textview = (TextView) viewClicked;
                //String message = "You clicked # " + position + ", which is the game: " + textview.getText().toString();

                //Toast.makeText(cardgames.this, message, Toast.LENGTH_LONG).show();

                if (textview.getText().toString() == "Go Fish") {
                    Intent gofish = new Intent(cardgames.this, gofishrules.class);
                    startActivity(gofish);
                }

                if (textview.getText().toString() == "500 Rum") {
                    Intent rum = new Intent(cardgames.this, rum.class);
                    startActivity(rum);
                }

                if (textview.getText().toString() == "Hearts") {
                    Intent hearts = new Intent(cardgames.this, hearts.class);
                    startActivity(hearts);
                }

                if (textview.getText().toString() == "Authors") {
                    Intent authors = new Intent(cardgames.this, authors.class);
                    startActivity(authors);
                }

                if (textview.getText().toString() == "Crazy Eights") {
                    Intent crazyeights = new Intent(cardgames.this, crazyeights.class);
                    startActivity(crazyeights);
                }

                //NOTE: still need to implement bridge.class
                if (textview.getText().toString() == "Bridge") {
                    Intent bridge = new Intent(cardgames.this, bridge.class);
                    startActivity(bridge);
                }

                if (textview.getText().toString() == "Bingo") {
                    Intent bingo = new Intent(cardgames.this, bingo.class);
                    startActivity(bingo);
                }

                if (textview.getText().toString() == "Emperor") {
                    Intent emperor = new Intent(cardgames.this, emperor.class);
                    startActivity(emperor);
                }

                if (textview.getText().toString() == "Guts") {
                    Intent guts = new Intent(cardgames.this, guts.class);
                    startActivity(guts);
                }

                if (textview.getText().toString() == "Old Maid") {
                    Intent oldmaid = new Intent(cardgames.this, oldmaid.class);
                    startActivity(oldmaid);
                }

                if (textview.getText().toString() == "Pepper") {
                    Intent pepper = new Intent(cardgames.this, pepper.class);
                    startActivity(pepper);
                }

                if (textview.getText().toString() == "Spit") {
                    Intent spit = new Intent(cardgames.this, spit.class);
                    startActivity(spit);
                }

                if(textview.getText().toString() == "Klondike") {
                    Intent klondike = new Intent(cardgames.this, klondike.class);
                    startActivity(klondike);
                }
            }
        });
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    /*
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("cardgames Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
    */
}
