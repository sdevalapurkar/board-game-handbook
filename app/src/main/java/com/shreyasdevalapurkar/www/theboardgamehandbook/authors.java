package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class authors extends AppCompatActivity {

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
        setContentView(R.layout.activity_authors);

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

        String s = "1) A standard 52-card pack" + "\n"
                + "2) Two or more players" + "\n"
                + "3) Bright spirit ready to have fun";

        tv.setText(s);

        String s2 = "Object of the Game";

        tv2.setText(s2);

        String s3 = "To be the first player to lay down all your cards.";

        tv3.setText(s3);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "The whole deck is dealt, as nearly evenly as possible." + "\n";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "Beginning with the player to the left of the dealer, each player requests a desired card by rank and suit. Example: Give me the Queen of Diamonds." + "\n" + "\n"
                + "If the opponent has the card, they must hand it over." + "\n" + "\n"
                + "The player's turn continues so long as the player receives the card requested. If not, the turn passes to the left." + "\n" + "\n"
                + "As soon as a player collects four cards of the same rank, such as four 3s or four Queen, he lays them face down." + "\n" + "\n"
                + "The game continues until all cards have been laid down.";

        tv9.setText(s9);
    }
}
