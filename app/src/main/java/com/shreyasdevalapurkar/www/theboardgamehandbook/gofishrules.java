package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class gofishrules extends AppCompatActivity {

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
        setContentView(R.layout.activity_gofishrules);

        tv = (TextView)findViewById(R.id.rulesofgofish1);
        tv1 = (TextView)findViewById(R.id.whatisneeded);
        tv2 = (TextView)findViewById(R.id.objectofgame);
        tv3 = (TextView)findViewById(R.id.objectcontent);
        tv4 = (TextView)findViewById(R.id.rankofcards);
        tv5 = (TextView)findViewById(R.id.rankcontent);
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

        String s3 = "The goal is to win the most \"books\" of cards. A book is any four of a kind, such as four kings, four aces, and so on";

        tv3.setText(s3);

        String s4 = "Rank of Cards";

        tv4.setText(s4);

        String s5 = "The cards rank from ace (high) to two (low). The suits are not important, only the card numbers are relevant, such as two 3s, two 10s, and so on";

        tv5.setText(s5);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "Any player deals one card face up to each player. The player with the lowest card is the dealer. The dealer shuffles the cards, and the player on his right cuts them"
                + "\n" + "\n"
                + "The dealer completes the cut and deals the cards clockwise one at a time, face down, beginning with the player to his left. If two or three people are playing, each player receives seven cards. If four or five people are playing, each receives five cards. The remainder of the pack is placed face down on the table to form the stock" + "\n";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "The player to the left of the dealer looks directly at any opponent and says, for example, Give me your kings, usually addressing the opponent by name and specifying the rank he wants, from ace down to two. The player who is fishing must have at least one card of the rank he asked for in his hand. The player who is addressed must hand over all the cards requested. If he has none, he says, Go fish! and the player who made the request draws the top card of the stock and places it in his hand." +
                "\n" + "\n"
                + "If a player gets one or more cards of the named rank he asked for, he is entitled to ask the same or another player for a card. He can ask for the same card or a different one. So long as he succeeds in getting cards (makes a catch), his turn continues. When a player makes a catch, he must reveal the card so that the catch is verified. If a player gets the fourth card of a book, he shows all four cards, places them on the table face up in front of him, and plays again."
                + "\n" + "\n"
                + "If the player goes fishing without making a catch (does not receive a card he asked for), the turn passes to his left"
                + "\n" + "\n" + "The game ends when all thirteen books have been won.";

        tv9.setText(s9);
    }
}
