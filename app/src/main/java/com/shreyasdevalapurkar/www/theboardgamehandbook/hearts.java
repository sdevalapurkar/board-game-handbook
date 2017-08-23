package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hearts extends AppCompatActivity {

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
        setContentView(R.layout.activity_hearts);

        tv = (TextView)findViewById(R.id.rulesofrum);
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
                + "2) Three or more players" + "\n"
                + "3) Bright spirit ready to have fun";

        tv.setText(s);

        String s2 = "Object of the Game";

        tv2.setText(s2);

        String s3 = "The goal is to be the player with the lowest score at the end of the game. When one player hits the agreed-upon score or higher, the game ends; and the player with the lowest score wins.";

        tv3.setText(s3);

        String s4 = "Card Values/Scoring";

        tv4.setText(s4);

        String s5 = "At the end of each hand, players count the number of hearts they have taken as well as the queen of spades, if applicable. Hearts count as one point each and the queen counts 13 points."
                + "\n" + "\n" + "Each heart - 1 point" + "\n" + "\n" + "The Q - 13 points" + "\n" + "\n" +
                "The aggregate total of all scores for each hand must be a multiple of 26. The game is usually played to 100 points (some play to 50)."
                + "\n" + "\n" +
                "When a player takes all 13 hearts and the queen of spades in one hand, instead of losing 26 points, that player scores zero and each of his opponents score an additional 26 points.";

        tv5.setText(s5);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "Deal the cards one at a time, face down, clockwise. In a four-player game, each is dealt 13 cards; in a three-player game, the 2 of diamonds should be removed, and each player gets 17 cards; in a five-player game, the 2 of diamonds and 2 of clubs should be removed so that each player will get 10 cards." + "\n";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "The player holding the 2 of clubs after the pass makes the opening lead. If the 2 has been removed for the three handed game, then the 3 of clubs is led." + "\n" + "\n"
                + "Each player must follow suit if possible. If a player is void of the suit led, a card of any other suit may be discarded. However, if a player has no clubs when the first trick is led, a heart or the queen of spades cannot be discarded. The highest card of the suit led wins a trick and the winner of that trick leads next. There is no trump suit." + "\n" + "\n"
                + "The winner of the trick collects it and places it face down. Hearts may not be led until a heart or the queen of spades has been discarded. The queen does not have to be discarded at the first opportunity." + "\n" + "\n"
                + "The queen can be led at any time.";

        tv9.setText(s9);
    }
}
