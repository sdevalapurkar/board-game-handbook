package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class crazyeights extends AppCompatActivity {

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
        setContentView(R.layout.activity_crazyeights);

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

        String s3 = "The goal is to be the first player to get rid of all the cards in his hand.";

        tv3.setText(s3);

        String s4 = "Card Values/Scoring";

        tv4.setText(s4);

        String s5 = "The player who is the first to have no cards left wins the game. The winning player collects from each other player the value of the cards remaining in that player’s hand as follows:"
                + "\n" + "\n" + "Each eight = 50 points" + "\n" + "\n" + "Each K, Q, J, or 10 = 10 points" + "\n" + "\n" +
                "Each ace = 1 point" + "\n" + "\n" + "Each other card is the pip value.";

        tv5.setText(s5);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "Deal 5 cards one at a time, face down, beginning with the player to the left. The balance of the pack is placed face down in the center of the table and forms the stock." +
                "\n" + "\n"
                + "The dealer turns up the top card and places it in a separate pile; this card is the “starter.” If an eight is turned, it is buried in the middle of the pack and the next card is turned." + "\n";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "Starting to the dealer’s left, each player must place one card face up on the starter pile. Each card played (other than an eight) must match the card showing on the starter pile, either in suit or in denomination." + "\n" + "\n"
                + "Example: If the Q of Clubs is the starter, any club may be played on it or any Queen." + "\n" + "\n"
                + "If unable to play, cards are drawn from the top of the stock until a play is possible, or until the stock is exhausted. If unable to play when the stock is exhausted, the player must pass. A player may draw from the stock, even though there may be a playable card in the player’s hand." + "\n" + "\n"
                + "All eights are wild! That is, an eight may be played at any time in turn, and the player need only specify a suit for it (but never a number). The next player must play either a card of the specified suit or an eight.";

        tv9.setText(s9);
    }
}
