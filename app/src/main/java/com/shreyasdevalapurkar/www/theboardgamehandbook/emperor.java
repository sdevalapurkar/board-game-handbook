package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class emperor extends AppCompatActivity {

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
        setContentView(R.layout.activity_emperor);

        tv = (TextView)findViewById(R.id.rulesofemperor);
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

        String s = "1) Two standard 52-card packs that are shuffled together" + "\n"
                + "2) One player" + "\n"
                + "3) One bright spirit ready to have fun";

        tv.setText(s);

        String s2 = "Object of the Game";

        tv2.setText(s2);

        String s3 = "The goal is to get all eight foundations built up from ace through king.";

        tv3.setText(s3);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "Deal Ten piles of four cards each, dealt by rows, the first three rows face down, and the last row face up. Remaining cards are placed in a pile to form the Stock.";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "Cards are turned up one at a time from the top of the stock and may be placed on the piles or foundations. Cards from the stock that cannot be used are placed face up in a pile below the rows to form the waste pile. The top card of the waste pile is always available for building onto the piles or foundations. The player may overlap the waste pile cards so that all of them can be seen." + "\n" + "\n"
                + "All aces are placed in a Foundation row above the Ten dealt piles as soon as the player can release them from the piles." + "\n" + "\n"
                + "Only the top card of a pile may be moved. The removal of a card releases the one below it. A card may be placed only on a card of the opposite color and next-lower in rank." + "\n" + "\n"
                + "Example: A 7 of Clubs may be placed only on 6 of Hearts." + "\n" + "\n"
                + "A king may not be built on an ace, and aces must be placed as foundations as soon as possible. Foundations are built up in suit and sequence from ace through king. When any of the ten piles is entirely cleared away, any movable card may be placed in the space.";

        tv9.setText(s9);
    }
}
