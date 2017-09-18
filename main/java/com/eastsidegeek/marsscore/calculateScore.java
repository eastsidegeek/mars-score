package com.eastsidegeek.marsscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;



/**
 * Created by staffd2 on 8/21/2017.
 */

public class calculateScore extends AppCompatActivity {

    public static final int RED_PLAYER = 1;
    public static final int BLUE_PLAYER = 2;
    public static final int GREEN_PLAYER = 3;
    public static final int YELLOW_PLAYER = 4;
    public static final int BLACK_PLAYER = 5;

    private Button buttonTRDec;
    private Button buttonTRInc;
    private Button buttonGreeneryDec;
    private Button buttonGreeneryInc;
    private Button buttonMilestoneDec;
    private Button buttonMilestoneInc;
    private Button buttonAwardDec;
    private Button buttonAwardInc;
    private Button buttonAwardDec2;
    private Button buttonAwardInc2;
    private Button buttonAdjacencyDec;
    private Button buttonAdjacencyInc;
    private Button buttonCardPointsDec;
    private Button buttonCardPointsInc;
    private Button buttonCalculate;
    private EditText editTextTR;
    private EditText editTextGreenery;
    private EditText editTextMilestone;
    private EditText editTextAward;
    private EditText editTextAdjacency;
    private EditText editTextCardPoints;
    private TextView textViewPlayer;

    private String stringTemp;
    private int intTemp;

    private int intScore;


    private int intPlayer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculate);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            intPlayer = extras.getInt("Player");
        } // end extra check

        buttonTRDec = (Button) findViewById(R.id.buttonTRDec);
        buttonTRInc = (Button) findViewById(R.id.buttonTRInc);
        buttonGreeneryDec = (Button) findViewById(R.id.buttonGreeneryDec);
        buttonGreeneryInc = (Button) findViewById(R.id.buttonGreeneryInc);
        buttonMilestoneDec = (Button) findViewById(R.id.buttonMilestoneDec);
        buttonMilestoneInc = (Button) findViewById(R.id.buttonMilestoneInc);
        buttonAwardDec = (Button) findViewById(R.id.buttonAwardDec);
        buttonAwardInc = (Button) findViewById(R.id.buttonAwardInc);
        buttonAwardDec2 = (Button) findViewById(R.id.buttonAwardDec2);
        buttonAwardInc2 = (Button) findViewById(R.id.buttonAwardInc2);
        buttonAdjacencyDec = (Button) findViewById(R.id.buttonAdjacencyDec);
        buttonAdjacencyInc = (Button) findViewById(R.id.buttonAdjacencyInc);
        buttonCardPointsDec = (Button) findViewById(R.id.buttonCardPointsDec);
        buttonCardPointsInc = (Button) findViewById(R.id.buttonCardPointsInc);

        buttonCalculate = (Button) findViewById(R.id.buttonCalculate);

        editTextTR = (EditText) findViewById(R.id.editTextTR);
        editTextGreenery = (EditText) findViewById(R.id.editTextGreenery);
        editTextMilestone = (EditText) findViewById(R.id.editTextMilestone);
        editTextAward = (EditText) findViewById(R.id.editTextAward);
        editTextAdjacency = (EditText) findViewById(R.id.editTextAdjacency);
        editTextCardPoints = (EditText) findViewById(R.id.editTextCardPoints);

        textViewPlayer = (TextView) findViewById(R.id.textViewPlayer);

        editTextTR.setInputType(0);
        editTextGreenery.setInputType(0);
        editTextMilestone.setInputType(0);
        editTextAward.setInputType(0);
        editTextAdjacency.setInputType(0);
        editTextCardPoints.setInputType(0);

        intTemp = extras.getInt("TR");
        stringTemp = Integer.toString(intTemp);
        editTextTR.setText(stringTemp);

        intTemp = extras.getInt("Greenery");
        stringTemp = Integer.toString(intTemp);
        editTextGreenery.setText(stringTemp);

        intTemp = extras.getInt("Milestone");
        stringTemp = Integer.toString(intTemp);
        editTextMilestone.setText(stringTemp);

        intTemp = extras.getInt("Award");
        stringTemp = Integer.toString(intTemp);
        editTextAward.setText(stringTemp);

        intTemp = extras.getInt("Adjacency");
        stringTemp = Integer.toString(intTemp);
        editTextAdjacency.setText(stringTemp);

        intTemp = extras.getInt("CardPoints");
        stringTemp = Integer.toString(intTemp);
        editTextCardPoints.setText(stringTemp);

        switch(intPlayer) {
            case RED_PLAYER:
                textViewPlayer.setText(R.string.redplayer);
                textViewPlayer.setTextColor(0xFFFF0000);

                break;
            case GREEN_PLAYER:
                textViewPlayer.setText(R.string.greenplayer);
                textViewPlayer.setTextColor(0xFF00FF00);
                break;
            case BLUE_PLAYER:
                textViewPlayer.setText(R.string.blueplayer);
                textViewPlayer.setTextColor(0xFF0000FF);
                break;
            case YELLOW_PLAYER:
                textViewPlayer.setText(R.string.yellowplayer);
                textViewPlayer.setTextColor(0xFFDDDD00);
                break;
            case BLACK_PLAYER:
                textViewPlayer.setText(R.string.blackplayer);
                textViewPlayer.setTextColor(0xFF000000);
                break;
        } // end switch

        stringTemp = "";
        intTemp = 0;

        buttonTRDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextTR.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                if (intTemp == 0) {
                    return;
                } else {
                    intTemp--;
                    stringTemp = Integer.toString(intTemp);
                    editTextTR.setText(stringTemp);
                }
            } // end onClick
        }); // end new OnClickListener

        buttonTRInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextTR.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                intTemp++;
                stringTemp = Integer.toString(intTemp);
                editTextTR.setText(stringTemp);

            } // end onClick
        }); // end new OnClickListener

        buttonGreeneryDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextGreenery.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                if (intTemp == 0) {
                    return;
                } else {
                    intTemp--;
                    stringTemp = Integer.toString(intTemp);
                    editTextGreenery.setText(stringTemp);
                }
            } // end onClick
        }); // end new OnClickListener

        buttonGreeneryInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextGreenery.getText().toString();
                intTemp = Integer.parseInt(stringTemp);

                intTemp++;
                stringTemp = Integer.toString(intTemp);
                editTextGreenery.setText(stringTemp);

            } // end onClick
        }); // end new OnClickListener

        buttonMilestoneDec.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            stringTemp = editTextMilestone.getText().toString();
            intTemp = Integer.parseInt(stringTemp);
            if (intTemp == 0) {
                return;
            } else {
                intTemp-=5;
                stringTemp = Integer.toString(intTemp);
                editTextMilestone.setText(stringTemp);
            }
        } // end onClick
    }); // end new OnClickListener

        buttonMilestoneInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextMilestone.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                if(intTemp > 14) {
                    return;
                } else {
                    intTemp += 5;
                    stringTemp = Integer.toString(intTemp);
                    editTextMilestone.setText(stringTemp);
                }
            } // end onClick
        }); // end new OnClickListener

        buttonAwardDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextAward.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                if (intTemp < 5) {
                    stringTemp="0";
                    editTextAward.setText(stringTemp);

                } else {
                    intTemp-=5;
                    stringTemp = Integer.toString(intTemp);
                    editTextAward.setText(stringTemp);
                }
            } // end onClick
        }); // end new OnClickListener

        buttonAwardInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextAward.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                if(intTemp > 15) {
                    return;
                } else {
                    intTemp += 5;
                    stringTemp = Integer.toString(intTemp);
                    editTextAward.setText(stringTemp);
                }

            } // end onClick
        }); // end new OnClickListener

        buttonAwardDec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextAward.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                if (intTemp < 3) {
                    stringTemp="0";
                    editTextAward.setText(stringTemp);

                } else {
                    intTemp-=2;
                    stringTemp = Integer.toString(intTemp);
                    editTextAward.setText(stringTemp);
                }
            } // end onClick
        }); // end new OnClickListener

        buttonAwardInc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextAward.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                if(intTemp > 11) {
                    return;
                } else {
                    intTemp += 2;
                    stringTemp = Integer.toString(intTemp);
                    editTextAward.setText(stringTemp);
                }

            } // end onClick
        }); // end new OnClickListener

        buttonAdjacencyDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextAdjacency.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                if (intTemp == 0) {
                    return;
                } else {
                    intTemp--;
                    stringTemp = Integer.toString(intTemp);
                    editTextAdjacency.setText(stringTemp);
                }
            } // end onClick
        }); // end new OnClickListener


        buttonAdjacencyInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextAdjacency.getText().toString();
                intTemp = Integer.parseInt(stringTemp);

                intTemp++;
                stringTemp = Integer.toString(intTemp);
                editTextAdjacency.setText(stringTemp);

            } // end onClick
        }); // end new OnClickListener

        buttonCardPointsInc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextCardPoints.getText().toString();
                intTemp = Integer.parseInt(stringTemp);

                intTemp++;
                stringTemp = Integer.toString(intTemp);
                editTextCardPoints.setText(stringTemp);

            } // end onClick
        }); // end new OnClickListener

        buttonCardPointsDec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                stringTemp = editTextCardPoints.getText().toString();
                intTemp = Integer.parseInt(stringTemp);

                intTemp--;
                stringTemp = Integer.toString(intTemp);
                editTextCardPoints.setText(stringTemp);

            } // end onClick
        }); // end new OnClickListener

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Bundle b = new Bundle();
                Intent intent = new Intent();
                // do some calculations
                intScore = 0;
                stringTemp = editTextTR.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                b.putInt("TR",intTemp);
                intScore += intTemp;

                stringTemp = editTextGreenery.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                b.putInt("Greenery",intTemp);
                intScore += intTemp;

                stringTemp = editTextMilestone.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                b.putInt("Milestone",intTemp);
                intScore += intTemp;

                stringTemp = editTextAward.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                b.putInt("Award",intTemp);
                intScore += intTemp;

                stringTemp = editTextAdjacency.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                b.putInt("Adjacency",intTemp);
                intScore += intTemp;

                stringTemp = editTextCardPoints.getText().toString();
                intTemp = Integer.parseInt(stringTemp);
                b.putInt("CardPoints",intTemp);
                intScore += intTemp;

                b.putInt("Score",intScore);
                intent.putExtras(b);

                setResult(RESULT_OK,intent);

                finish();
            } // end onClick
        });

    } // end onCreate


} // end class definition for calculateScore
