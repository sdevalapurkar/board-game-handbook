package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class oldmaid extends AppCompatActivity {

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
    TextView tv10;
    TextView tv11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldmaid);

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
        tv10 = (TextView)findViewById(R.id.irregularities);
        tv11 = (TextView)findViewById(R.id.irregularitiescontent);

        loadText();
    }

    private void loadText() {

        String s1 = "What is Needed";

        tv1.setText(s1);

        String s = "1) A standard 52-card pack is used, however, one of the four queens is removed, leaving a total of 51 cards" + "\n"
                + "2) Two or more players" + "\n"
                + "3) Bright spirit ready to have fun";

        tv.setText(s);

        String s2 = "Object of the Game";

        tv2.setText(s2);

        String s3 = "The goal is to form and discard pairs of cards, and not to be left with the odd card (a queen) at the end.";

        tv3.setText(s3);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "Any player shuffles the pack and deals them around, one at a time to each player, until all the cards have been handed out. Players do not need to have an equal number of cards." + "\n";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "Each player removes all pairs from his hand face down. If a player has three-of-a-kind, he removes only two of those three cards. The dealer then offers his hand, spread out face down, to the player on his left, who draws one card from it." + "\n" + "\n"
                + "This player discards any pair that may have been formed by the drawn card. He then offers his own hand to the player on his left. Play proceeds in this way until all cards have been paired except one - the odd queen, which cannot be paired - and the player who has that card is the Old Maid!" + "\n";

        tv9.setText(s9);

        String s10 = "Irregularities";

        tv10.setText(s10);

        String s11 = "If any player is found to have discarded two cards that are not a pair, (thus causing three unpaired cards instead of one to remain at the end), the player who made the mistake loses and becomes the Old Maid.";

        tv11.setText(s11);
    }
}
