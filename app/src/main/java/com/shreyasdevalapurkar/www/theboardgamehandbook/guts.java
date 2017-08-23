package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class guts extends AppCompatActivity {

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
        setContentView(R.layout.activity_guts);

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
                + "3) Bright spirit ready to have fun" + "\n"
                + "4) Must be of age 18+";

        tv.setText(s);

        String s2 = "Object of the Game";

        tv2.setText(s2);

        String s3 = "Be the player with the best cards. (Easier said than done)";

        tv3.setText(s3);

        String s4 = "Card Values/Scoring";

        tv4.setText(s4);

        String s5 = "Aces are high" + "\n" + "\n"
                + "Any pair of equal cards beats any two unequal cards" + "\n" + "\n"
                + "A higher pair beats a lower pair" + "\n" + "\n"
                + "Between two non-pair hands, the hand with the highest card wins" + "\n" + "\n"
                + "If two hands have equal high cards, the hand whose other card is higher wins.";

        tv5.setText(s5);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "Each player is dealt 2 cards; face down, starting with the player to the left of the dealer." + "\n";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "Each round starts with an ante. Starting with the player to dealer's left and continuing clockwise around the table, ending with the dealer, each player in turn says either in or out." +
                "\n" + "\n" +
                "Players who say out cannot win the pot, but do not lose any extra money. If more than one player says in, all those who are in show their cards, and the player with the best cards wins the pot.";

        tv9.setText(s9);
    }
}
