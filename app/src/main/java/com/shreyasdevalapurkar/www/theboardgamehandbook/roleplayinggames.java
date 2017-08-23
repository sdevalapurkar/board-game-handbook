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

public class roleplayinggames extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roleplayinggames);

        populateRolePlayingGames();
        onClickForRolePlayingGames();
    }

    private void populateRolePlayingGames() {
        String[] roleplayinggames = {"Avalon", "Coup", "Mafia (Werewolf)"};

        Arrays.sort(roleplayinggames);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,   //context for the activity
                R.layout.cardgames, //layout to use (create)
                roleplayinggames); //items to be displayed

        ListView roleplayinggameslist = (ListView) findViewById(R.id.roleplayinggameslist);
        roleplayinggameslist.setAdapter(adapter);
    }

    private void onClickForRolePlayingGames() {
        ListView roleplayinggameslist = (ListView)findViewById(R.id.roleplayinggameslist);
        roleplayinggameslist.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
                TextView textview = (TextView) viewClicked;

                if (textview.getText().toString() == "Avalon") {
                    Intent avalon = new Intent(roleplayinggames.this, avalonrules.class);
                    startActivity(avalon);
                }
            }
        });
    }
}
