package com.example.marsscore;

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


    private String stringTemp;
    private int intTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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


        buttonPlayerRed.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            Intent intent = new Intent(MainActivity.this,calculateScore.class);
            Bundle b = new Bundle();
            b.putInt("Player",RED_PLAYER);
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
                }
                break;
            case BLUE_PLAYER:
                if(resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    intTemp = (int) bundle.getInt("Score");
                    stringTemp = (String) Integer.toString(intTemp);
                    editTextBlueScore.setText(stringTemp);
                }
                break;
            case GREEN_PLAYER:
                if(resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    intTemp = (int) bundle.getInt("Score");
                    stringTemp = (String) Integer.toString(intTemp);
                    editTextGreenScore.setText(stringTemp);
                }
                break;
            case YELLOW_PLAYER:
                if(resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    intTemp = (int) bundle.getInt("Score");
                    stringTemp = (String) Integer.toString(intTemp);
                    editTextYellowScore.setText(stringTemp);
                }
                break;
            case BLACK_PLAYER:
                if(resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    intTemp = (int) bundle.getInt("Score");
                    stringTemp = (String) Integer.toString(intTemp);
                    editTextBlackScore.setText(stringTemp);
                }
                break;
        } // end switch
    } // end onActivityResult
}
