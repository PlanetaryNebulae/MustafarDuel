package com.example.android.mustafarduel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int anakinScore = 100;
    int obiwanScore = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Anakin.
     */
    public void anakinScore(int score) {
        TextView anakinScore = (TextView) findViewById(R.id.anakinScore);
        anakinScore.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Obi Wan.
     */
    public void obiwanScore(int score) {
        TextView obiwanScore = (TextView) findViewById(R.id.obiwanScore);
        obiwanScore.setText(String.valueOf(score));
    }

    /**
     * Takes 10 points from Obi Wan's score.
     */
    public void anakinClash(View v) {
        obiwanScore = obiwanScore - 10;
        obiwanScore(obiwanScore);
    }

    /**
     * Takes 10 points from Anakin's score.
     */
    public void obiwanClash(View v) {
        anakinScore = anakinScore - 10;
        anakinScore(anakinScore);
    }

    /**
     * Takes 30 points from Obi Wan's score.
     */
    public void forceChoke(View v) {
        obiwanScore = obiwanScore - 30;
        obiwanScore(obiwanScore);
    }

    /**
     * Takes 30 points from Anakin's score.
     */
    public void amputation(View v) {
        anakinScore = anakinScore - 30;
        anakinScore(anakinScore);
    }

    /**
     * Makes Obi Wan's score equal to Anakin's score.
     */
    public void younglingSlaughter(View v) {
        obiwanScore = anakinScore;
        obiwanScore(obiwanScore);
    }

    /**
     * Brings Anakin's score down to one point.
     */
    public void highGround(View v) {
        anakinScore = anakinScore = 1;
        anakinScore(anakinScore);
    }

    /**
     * Resets scores back to 100.
     */
    public void rematch(View v) {
        anakinScore = 100;
        obiwanScore = 100;
        anakinScore(anakinScore);
        obiwanScore(obiwanScore);
    }
}
