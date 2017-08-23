package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pepper extends AppCompatActivity {

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
        setContentView(R.layout.activity_pepper);

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

        String s = "1) 24 cards containing each 9, 10, J, Q, K, and A in each suit" + "\n"
                + "2) Two, three, or four players" + "\n"
                + "3) Bright spirit ready to have fun";

        tv.setText(s);

        String s2 = "Object of the Game";

        tv2.setText(s2);

        String s3 = "Be the first team to score 30 or more points.";

        tv3.setText(s3);

        String s4 = "Rank of Cards";

        tv4.setText(s4);

        String s5 = "J (of trump suit, or the \"Right Bower\"; high), J (of the other suit of the same color as the trump suit, or \"the Left Bower\"), A, K, Q, 10, 9.";

        tv5.setText(s5);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "Cards are dealt one at a time to each player, starting with the player to the dealer's left. Each player receives six cards." + "\n";

        tv7.setText(s7);

        String s8 = "Gameplay";

        tv8.setText(s8);

        String s9 = "The highest bidder then makes the opening lead, and may lead any card. The other players each play a card (playing clockwise) and must follow suit if possible. If a player cannot follow suit, they may play any card. The trick goes to the highest trump or, if there are no trump cards, to the highest card of the suit led. The winner of a trick leads to the next trick."
                + "\n";

        tv9.setText(s9);

        String s10 = "Bidding";

        tv10.setText(s10);

        String s11 = "Starting with the player to the dealer's left, each player can bid or pass. A bid indicates the number of tricks that a player (with the help of their partner) will contract to win if allowed to choose either the trump suit or no trump." + "\n" + "\n"
                + "The possible bids are the numbers from one to five; above five is 'little pepper,' which is a bid to take six tricks, and the highest bid of all is 'big pepper,' which is also a bid to take six tricks, but the stakes for that hand are effectively doubled."
                + "\n" + "\n" + "Each player in turn must either bid higher than the previous bid or pass. The auction continues for as many rounds as necessary, until a bid is passed by all of the other three players. The highest bidder then either names a trump suit or chooses 'no trump'. This fixes the trump suit, if any, for that hand." + "\n";

        tv11.setText(s11);

        String s12 = "How to Keep Score";

        tv12.setText(s12);

        String s13 = "Teams scores one point for each trick taken if it makes at least its contract, but loses six points if it fails to make its contract, regardless of the value of the contract." + "\n" + "\n"
                + "A team can have a negative score. An exception to this is the \"big pepper\" bid. With this contract, if all the tricks are taken the contracting side wins 12 points. However, if the contracting side fails to take all six tricks, they are set back 12 points. The opposing side always scores one point for each trick taken." + "\n" + "\n"
                + "The first team to score 30 or more points wins. If both sides reach 30 or more points on the same hand, the side with the higher score wins. If their scores are equal, the game is a tie.";

        tv13.setText(s13);
    }
}
