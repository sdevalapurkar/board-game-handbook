package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class bingo extends AppCompatActivity {

    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;
    TextView tv7;
    TextView tv8;
    TextView tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bingo);

        tv = (TextView)findViewById(R.id.rulesofauthors);
        tv1 = (TextView)findViewById(R.id.whatisneeded);
        tv2 = (TextView)findViewById(R.id.objectofgame);
        tv3 = (TextView)findViewById(R.id.objectcontent);
        tv4 = (TextView)findViewById(R.id.cardvaluesandscoring);
        tv5 = (TextView)findViewById(R.id.valuesandscoringcontent);
        tv6 = (TextView)findViewById(R.id.thedeal);
        tv7 = (TextView)findViewById(R.id.thedealcontent);
        tv8 = (TextView)findViewById(R.id.gameplay);
        tv9 = (TextView)findViewById(R.id.gameplaycontent);

        loadText();
    }

    private void loadText() {

        String s1 = "What is Needed";

        tv1.setText(s1);

        String s = "1) Two standard 52-card packs" + "\n"
                + "2) Two or more players" + "\n"
                + "3) Bright spirit ready to have fun";

        tv.setText(s);

        String s2 = "Object of the Game";

        tv2.setText(s2);

        String s3 = "To be the first player to turn all your cards face down and win all the game night glory.";

        tv3.setText(s3);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "From the first deck of cards, five cards are dealt to each player face up. There will be players and one Caller who will call out the card values that players must match in order to complete their Bingo hand." + "\n";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "From the second deck of cards, the Caller will select a card, one at a time, and call out the rank and suit of the card - for example: queen of hearts. The player with the called card turns it face down. The first player to turn all their cards face down wins.";

        tv9.setText(s9);
    }
}
