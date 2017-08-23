package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class rum extends AppCompatActivity {

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
        setContentView(R.layout.activity_rum);

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
                + "2) Two or more players" + "\n"
                + "3) Bright spirit ready to have fun";

        tv.setText(s);

        String s2 = "Object of the Game";

        tv2.setText(s2);

        String s3 = "The goal is to lay matched number sets of 3 or 4 and/or sequences of 3 or more cards of the same suit to be the first player to obtain 500 total net points";

        tv3.setText(s3);

        String s4 = "Card Values/Scoring";

        tv4.setText(s4);

        String s5 = "Score points by laying down and laying off cards as in regular Rummy, in matched number sets of 3 or 4, and in sequences of 3 or more cards of the same suit. For example, three or four 7s can be laid or a sequence of 3, 4, 5 of diamonds can be laid."
                + "\n" + "\n" +
                "When any player gets rid of all his cards, the play immediately ends. Each player’s score is then figured as follows: The player is credited with the point value of all cards that the player has showing on the table. From this figure is subtracted the point value of all cards remaining in his hand. The difference is added or subtracted from the player’s score."
                + "\n" + "\n" +
                "For example: If the cards showing for a player total 87 points, and the cards left in the player’s hand total 90 points, 3 points are subtracted from the player’s previous net score."
                + "\n" + "\n" +
                "The first player whose score reaches +500 wins the game and collects from each opponent the difference between their final scores. If two or more players reach 500 on the same hand, the one with the highest score is the winner";

        tv5.setText(s5);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "Deal seven cards to each player (except in the two player game, in which each player receives 13 cards). Place undealt cards face down in the center of the table, forming the stock. The top card is turned face up and is placed beside the stock as the up card to start the discard pile. The discard pile should be slightly spread, so that players can readily see all the cards it contains" + "\n";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "Each player, beginning with the player to the left of the dealer, may draw either the top card of the stock or any card from the discard pile." +
                "\n" + "\n"
                + "There are two conditions when drawing a card from the discard pile: 1) the player must take all the cards above the selected card and 2) the drawn card must immediately be used, either by laying it down in a set or by laying it off on a set already on the table. The remaining cards taken with the discard may be melded in the same turn or simply added to the player’s hand."
                + "\n" + "\n"
                + "Each player in turn, after drawing but before discarding, may lay down any matched set or may lay off any card that matches a set already on the table."
                + "\n" + "\n" + "Cards that are laid off are kept on the table in front of the player. Sequences may not “go round the corner”; thus, A, K, Q or A, 2, 3 may be melded, but not K, A, 2.";

        tv9.setText(s9);
    }
}
