package com.eastsidegeek.marsscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final int RED_PLAYER = 1;
    public static final int BLUE_PLAYER = 2;
    public static final int GREEN_PLAYER = 3;
    public static final int YELLOW_PLAYER = 4;
    public static final int BLACK_PLAYER = 5;

    private Button buttonPlayerRed;
    private Button buttonPlayerBlue;
    private Button buttonPlayerGreen;
    private Button buttonPlayerYellow;
    private Button buttonPlayerBlack;

    private int intRedTR;
    private int intRedGreenery;
    private int intRedMilestone;
    private int intRedAward;
    private int intRedAdjacency;
    private int intRedCardPoints;
    private int intGreenTR;
    private int intGreenGreenery;
    private int intGreenMilestone;
    private int intGreenAward;
    private int intGreenAdjacency;
    private int intGreenCardPoints;
    private int intBlueTR;
    private int intBlueGreenery;
    private int intBlueMilestone;
    private int intBlueAward;
    private int intBlueAdjacency;
    private int intBlueCardPoints;
    private int intYellowTR;
    private int intYellowGreenery;
    private int intYellowMilestone;
    private int intYellowAward;
    private int intYellowAdjacency;
    private int intYellowCardPoints;
    private int intBlackTR;
    private int intBlackGreenery;
    private int intBlackMilestone;
    private int intBlackAward;
    private int intBlackAdjacency;
    private int intBlackCardPoints;

    private String stringTemp;
    private int intTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intRedTR = 20;
        intBlueTR = 20;
        intGreenTR = 20;
        intYellowTR = 20;
        intBlackTR = 20;

        buttonPlayerRed = (Button) findViewById(R.id.buttonRed);
        buttonPlayerBlue = (Button) findViewById(R.id.buttonBlue);
        buttonPlayerGreen = (Button) findViewById(R.id.buttonGreen);
        buttonPlayerYellow = (Button) findViewById(R.id.buttonYellow);
        buttonPlayerBlack = (Button) findViewById(R.id.buttonBlack);

        EditText editTextRedScore = (EditText) findViewById(R.id.editTextRedScore);
        EditText editTextBlueScore = (EditText) findViewById(R.id.editTextBlueScore);
        EditText editTextGreenScore = (EditText) findViewById(R.id.editTextGreenScore);
        EditText editTextYellowScore = (EditText) findViewById(R.id.editTextYellowScore);
        EditText editTextBlackScore = (EditText) findViewById(R.id.editTextBlackScore);

        editTextRedScore.setInputType(0);
        editTextBlueScore.setInputType(0);
        editTextGreenScore.setInputType(0);
        editTextYellowScore.setInputType(0);
        editTextBlackScore.setInputType(0);


        buttonPlayerRed.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            Intent intent = new Intent(MainActivity.this,calculateScore.class);
            Bundle b = new Bundle();
            b.putInt("Player",RED_PLAYER);
            b.putInt("TR",intRedTR);
            b.putInt("Greenery",intRedGreenery);
            b.putInt("Milestone",intRedMilestone);
            b.putInt("Award",intRedAward);
            b.putInt("Adjacency",intRedAdjacency);
            b.putInt("CardPoints",intRedCardPoints);
            intent.putExtras(b);
            MainActivity.this.startActivityForResult(intent,RED_PLAYER);

        } // end onClick
    }); // end new OnClickListener (buttonWizard)

        buttonPlayerBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,calculateScore.class);
                Bundle b = new Bundle();
                b.putInt("Player",BLUE_PLAYER);
                b.putInt("TR",intBlueTR);
                b.putInt("Greenery",intBlueGreenery);
                b.putInt("Milestone",intBlueMilestone);
                b.putInt("Award",intBlueAward);
                b.putInt("Adjacency",intBlueAdjacency);
                b.putInt("CardPoints",intBlueCardPoints);
                intent.putExtras(b);
                MainActivity.this.startActivityForResult(intent,BLUE_PLAYER);

            } // end onClick
        }); // end new OnClickListener (buttonWizard)

        buttonPlayerGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,calculateScore.class);
                Bundle b = new Bundle();
                b.putInt("Player",GREEN_PLAYER);
                b.putInt("TR",intGreenTR);
                b.putInt("Greenery",intGreenGreenery);
                b.putInt("Milestone",intGreenMilestone);
                b.putInt("Award",intGreenAward);
                b.putInt("Adjacency",intGreenAdjacency);
                b.putInt("CardPoints",intGreenCardPoints);
                intent.putExtras(b);
                MainActivity.this.startActivityForResult(intent,GREEN_PLAYER);

            } // end onClick
        }); // end new OnClickListener (buttonWizard)

        buttonPlayerYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,calculateScore.class);
                Bundle b = new Bundle();
                b.putInt("Player",YELLOW_PLAYER);
                b.putInt("TR",intYellowTR);
                b.putInt("Greenery",intYellowGreenery);
                b.putInt("Milestone",intYellowMilestone);
                b.putInt("Award",intYellowAward);
                b.putInt("Adjacency",intYellowAdjacency);
                b.putInt("CardPoints",intYellowCardPoints);
                intent.putExtras(b);
                MainActivity.this.startActivityForResult(intent,YELLOW_PLAYER);

            } // end onClick
        }); // end new OnClickListener (buttonWizard)

        buttonPlayerBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this,calculateScore.class);
                Bundle b = new Bundle();
                b.putInt("Player",BLACK_PLAYER);
                b.putInt("TR",intBlackTR);
                b.putInt("Greenery",intBlackGreenery);
                b.putInt("Milestone",intBlackMilestone);
                b.putInt("Award",intBlackAward);
                b.putInt("Adjacency",intBlackAdjacency);
                b.putInt("CardPoints",intBlackCardPoints);
                intent.putExtras(b);
                MainActivity.this.startActivityForResult(intent,BLACK_PLAYER);

            } // end onClick
        }); // end new OnClickListener (buttonWizard)
    } // end onCreate

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        EditText editTextRedScore = (EditText) findViewById(R.id.editTextRedScore);
        EditText editTextBlueScore = (EditText) findViewById(R.id.editTextBlueScore);
        EditText editTextGreenScore = (EditText) findViewById(R.id.editTextGreenScore);
        EditText editTextYellowScore = (EditText) findViewById(R.id.editTextYellowScore);
        EditText editTextBlackScore = (EditText) findViewById(R.id.editTextBlackScore);


        switch(requestCode) {
            case RED_PLAYER:
                if(resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    intTemp = (int) bundle.getInt("Score");
                    stringTemp = (String) Integer.toString(intTemp);
                    editTextRedScore.setText(stringTemp);

                    intRedTR = (int) bundle.getInt("TR");
                    intRedGreenery = (int) bundle.getInt("Greenery");
                    intRedMilestone = (int) bundle.getInt("Milestone");
                    intRedAward = (int) bundle.getInt("Award");
                    intRedAdjacency = (int) bundle.getInt("Adjacency");
                    intRedCardPoints = (int) bundle.getInt("CardPoints");
                }
                break;
            case BLUE_PLAYER:
                if(resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    intTemp = (int) bundle.getInt("Score");
                    stringTemp = (String) Integer.toString(intTemp);
                    editTextBlueScore.setText(stringTemp);

                    intBlueTR = (int) bundle.getInt("TR");
                    intBlueGreenery = (int) bundle.getInt("Greenery");
                    intBlueMilestone = (int) bundle.getInt("Milestone");
                    intBlueAward = (int) bundle.getInt("Award");
                    intBlueAdjacency = (int) bundle.getInt("Adjacency");
                    intBlueCardPoints = (int) bundle.getInt("CardPoints");
                }
                break;
            case GREEN_PLAYER:
                if(resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    intTemp = (int) bundle.getInt("Score");
                    stringTemp = (String) Integer.toString(intTemp);
                    editTextGreenScore.setText(stringTemp);

                    intGreenTR = (int) bundle.getInt("TR");
                    intGreenGreenery = (int) bundle.getInt("Greenery");
                    intGreenMilestone = (int) bundle.getInt("Milestone");
                    intGreenAward = (int) bundle.getInt("Award");
                    intGreenAdjacency = (int) bundle.getInt("Adjacency");
                    intGreenCardPoints = (int) bundle.getInt("CardPoints");
                }
                break;
            case YELLOW_PLAYER:
                if(resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    intTemp = (int) bundle.getInt("Score");
                    stringTemp = (String) Integer.toString(intTemp);
                    editTextYellowScore.setText(stringTemp);

                    intYellowTR = (int) bundle.getInt("TR");
                    intYellowGreenery = (int) bundle.getInt("Greenery");
                    intYellowMilestone = (int) bundle.getInt("Milestone");
                    intYellowAward = (int) bundle.getInt("Award");
                    intYellowAdjacency = (int) bundle.getInt("Adjacency");
                    intYellowCardPoints = (int) bundle.getInt("CardPoints");
                }
                break;
            case BLACK_PLAYER:
                if(resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    intTemp = (int) bundle.getInt("Score");
                    stringTemp = (String) Integer.toString(intTemp);
                    editTextBlackScore.setText(stringTemp);

                    intBlackTR = (int) bundle.getInt("TR");
                    intBlackGreenery = (int) bundle.getInt("Greenery");
                    intBlackMilestone = (int) bundle.getInt("Milestone");
                    intBlackAward = (int) bundle.getInt("Award");
                    intBlackAdjacency = (int) bundle.getInt("Adjacency");
                    intBlackCardPoints = (int) bundle.getInt("CardPoints");
                }
                break;
        } // end switch
    } // end onActivityResult
}
