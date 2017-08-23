package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class klondike extends AppCompatActivity {

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
    TextView tv12;
    TextView tv13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klondike);

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
        tv10 = (TextView)findViewById(R.id.bidding);
        tv11 = (TextView)findViewById(R.id.biddingcontent);
        tv12 = (TextView)findViewById(R.id.keepingscore);
        tv13 = (TextView)findViewById(R.id.keepingscorecontent);

        loadText();
    }

    private void loadText() {

        String s1 = "What is Needed";

        tv1.setText(s1);

        String s = "1) Two standard decks of playing cards (52 cards)" + "\n"
                + "2) Two players" + "\n"
                + "3) Bright spirit ready to have fun";

        tv.setText(s);

        String s2 = "Object of the Game";

        tv2.setText(s2);

        String s3 = "Be the first player to get rid of all your cards.";

        tv3.setText(s3);

        String s4 = "Rank of Cards";

        tv4.setText(s4);

        String s5 = "A (highest) down to 2 (lowest).";

        tv5.setText(s5);

        String s6 = "Layout";

        tv6.setText(s6);

        String s7 = "Each player has his own deck and begins by placing the top four cards from his deck face up in front of him in a row. There should be lots of empty space in the middle of the table between the two players. (In fact it is best to play on the floor, since cards often go flying once play starts.) Players hold the remainder of their deck in one of their hands during play." + "\n";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "There are no turns taken in this game, everyone plays at the same time. When both players are ready, one of them says \"spit\" and immediately each player takes the top card from his deck and plays it to the center of the table. These first cards should be far away from each other, forming two play piles between the players."
                + "\n" + "\n" +
                "Players immediately begin playing their cards from their layout onto the center piles. A card can be played only if it is one higher or one lower than the card on the top of the pile. The card's suit does not matter, and an ace can be played high or low."
                + "\n" + "\n" +
                "Example: One could play the 9 from the layout on the 10 pile since it is one lower in sequence."
                + "\n" + "\n" +
                "A player may only use one hand to move a card and may only play one card at a time. Many times both players can play a card on the same pile. In that case the player who gets there first gets the play and the other player must take back his card. This race to play out the cards can get very exciting!"
                + "\n" + "\n" +
                "Cards played from the layout row may immediately be replaced by a new card from the top of the deck. Players cannot exceed four cards in their layout rows."
                + "\n" + "\n" +
                "The players continue to rapidly play cards to the center and replace cards in their rows until all players get \"stuck\" and cannot make a play. Often several dozen cards can be played before all players get stuck. When all players are stuck, they say \"ready, spit,\" and again deal new starter cards to the top of each pile in the center. Play then continues as before." + "\n";

        tv9.setText(s9);

        String s10 = "How to Keep Score";

        tv10.setText(s10);

        String s11 = "When a player has played all the cards in his deck, he must continue play using only the cards left in his layout (even though he will not have a card to \"spit\" with if all players get stuck). When that player \"goes out\" by playing the last card from his layout row, he wins. If both players have run out their decks and get stuck before going out, the player with the fewest cards left wins." + "\n";

        tv11.setText(s11);

        /*

        String s12 = "How to Keep Score";

        tv12.setText(s12);

        String s13 = "Teams scores one point for each trick taken if it makes at least its contract, but loses six points if it fails to make its contract, regardless of the value of the contract." + "\n" + "\n"
                + "A team can have a negative score. An exception to this is the \"big pepper\" bid. With this contract, if all the tricks are taken the contracting side wins 12 points. However, if the contracting side fails to take all six tricks, they are set back 12 points. The opposing side always scores one point for each trick taken." + "\n" + "\n"
                + "The first team to score 30 or more points wins. If both sides reach 30 or more points on the same hand, the side with the higher score wins. If their scores are equal, the game is a tie.";

        tv13.setText(s13);

        */
    }
}
