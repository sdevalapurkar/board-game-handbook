package com.shreyasdevalapurkar.www.theboardgamehandbook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class bridge extends AppCompatActivity {

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
    TextView tv14;
    TextView tv15;
    TextView tv16;
    TextView tv17;
    TextView tv18;
    TextView tv19;
    TextView tv20;
    TextView tv21;
    TextView tv22;
    TextView tv23;
    TextView tv24;
    TextView tv25;
    TextView tv26;
    TextView tv27;
    TextView tv28;
    TextView tv29;
    TextView tv30;
    TextView tv31;
    TextView tv32;
    TextView tv33;
    TextView tv34;
    TextView tv35;
    TextView tv36;
    TextView tv37;
    TextView tv38;
    TextView tv39;
    TextView tv40;
    TextView tv41;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridge);

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
        tv14 = (TextView)findViewById(R.id.doubling);
        tv15 = (TextView)findViewById(R.id.doublingcontent);
        tv16 = (TextView)findViewById(R.id.finalbid);
        tv17 = (TextView)findViewById(R.id.finalbidcontent);
        tv18 = (TextView)findViewById(R.id.theplay);
        tv19 = (TextView)findViewById(R.id.theplaycontent);
        tv20 = (TextView)findViewById(R.id.facingthedummyhand);
        tv21 = (TextView)findViewById(R.id.facingthedummyhandcontent);
        tv22 = (TextView)findViewById(R.id.winningoftricks);
        tv23 = (TextView)findViewById(R.id.winningoftrickscontent);
        tv24 = (TextView)findViewById(R.id.declarersplay);
        tv25 = (TextView)findViewById(R.id.declarersplaycontent);
        tv26 = (TextView)findViewById(R.id.playedcard);
        tv27 = (TextView)findViewById(R.id.playedcardcontent);
        tv28 = (TextView)findViewById(R.id.takingintrickswon);
        tv29 = (TextView)findViewById(R.id.takingintrickswoncontent);
        tv30 = (TextView)findViewById(R.id.howtokeepscore);
        tv31 = (TextView)findViewById(R.id.howtokeepscorecontent);
        tv32 = (TextView)findViewById(R.id.trickscore);
        tv33 = (TextView)findViewById(R.id.trickscorecontent);
        tv34 = (TextView)findViewById(R.id.overtricks);
        tv35 = (TextView)findViewById(R.id.overtrickscontent);
        tv36 = (TextView)findViewById(R.id.thegame);
        tv37 = (TextView)findViewById(R.id.thegamecontent);
        tv38 = (TextView)findViewById(R.id.vulnerable);
        tv39 = (TextView)findViewById(R.id.vulnerablecontent);
        tv40 = (TextView)findViewById(R.id.honours);
        tv41 = (TextView)findViewById(R.id.honourscontent);

        loadText();
    }

    private void loadText() {

        String s1 = "What is Needed";

        tv1.setText(s1);

        String s = "1) A standard deck of playing cards (52 cards)" + "\n"
                + "2) Four players" + "\n"
                + "3) Bright spirit ready to have fun";

        tv.setText(s);

        String s2 = "Object of the Game";

        tv2.setText(s2);

        String s3 = "Each partnership attempts to score points by making its bid, or by defeating the opposing partnership's bid. At the end of play, the side with the most points wins.";

        tv3.setText(s3);

        String s4 = "Rank of Cards";

        tv4.setText(s4);

        String s5 = "Spades (High), hearts, diamonds, clubs." + "\n" + "\n" + "Rank of Cards: A (High), K, Q, J, 10, 9, 8, 7, 6, 5, 4, 3, 2.";

        tv5.setText(s5);

        String s6 = "The Deal";

        tv6.setText(s6);

        String s7 = "The dealer distributes 13 cards to each player, one card at a time, face down, beginning with the player on his left." + "\n";

        tv7.setText(s7);

        String s8 = "The Bidding";

        tv8.setText(s8);

        String s9 = "Calls - Once the cards are dealt, each player picks up his hand and, beginning with the dealer, makes a call (pass, bid, double or redouble).";

        tv9.setText(s9);

        String s10 = "Passing";

        tv10.setText(s10);

        String s11 = "When a player does not wish to bid, double, or redouble, he says, \"Pass.\" If all four players pass in the first round, the deal is \"passed out,\" and the next dealer in turn deals a new hand." + "\n";

        tv11.setText(s11);

        String s12 = "Bidding a Suit";

        //tv12.setText(s11);

        String s13 = "Bid a number of tricks greater than six that the bidder expects to win, and a suit which will become the trump suit." + "\n" + "\n"
                + "Ex. = \"One Spade\" is a bid to win seven tricks (6+1) with spades as trumps." + "\n" + "\n" +
                "A bid may be made in \"No-trump\", meaning that there will be no trump suit. The lowest possible bid is one, and the highest possible bid is seven.\n" +
                "\n" + "\n"
                + "Each bid must name a greater number of odd tricks than the last bid, or an equal number but in a higher denomination. No-trump is the highest denomination, outranking spades. Ex. = \"Two No-trump\" will overcall a bid of \"Two Hearts\", and a bid of \"Four Clubs\" is required to overcall a bid of \"Three No-trump\".";

        //tv13.setText(s13);

        String s14 = "Doubling and Redoubling";

        //tv14.setText(s14);

        }
    }
