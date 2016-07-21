package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int foulTeamA = 0;
    int timeoutTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamB = 0;
    int timeoutTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Increase the score for Team A by 3 point.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 points.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addOneFoulTeamA(View v) {
        foulTeamA = foulTeamA + 1;
        displayFoulTeamA(foulTeamA);
    }

    public void addTwoFoulTeamA(View v) {
        foulTeamA = foulTeamA + 2;
        displayFoulTeamA(foulTeamA);
    }

    public void addOneTimeOutTeamA(View v) {
        timeoutTeamA = timeoutTeamA + 1;
        displayTimeOutTeamA(timeoutTeamA);
    }

    /**
     * Increase the score for Team B by 3 point.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 point.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void addOneFoulTeamB(View v) {
        foulTeamB = foulTeamB + 1;
        displayFoulTeamB(foulTeamB);
    }

    public void addTwoFoulTeamB(View v) {
        foulTeamB = foulTeamB + 2;
        displayFoulTeamB(foulTeamB);
    }

    public void addOneTimeOutTeamB(View v) {
        timeoutTeamB = timeoutTeamB + 1;
        displayTimeOutTeamB(timeoutTeamB);
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        foulTeamA = 0;
        timeoutTeamA = 0;
        scoreTeamB = 0;
        foulTeamB = 0;
        timeoutTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayFoulTeamA(foulTeamA);
        displayTimeOutTeamA(timeoutTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulTeamB(foulTeamB);
        displayTimeOutTeamB(timeoutTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeamA(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(foul));
    }

    public void displayTimeOutTeamA(int timeout) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_timeout);
        scoreView.setText(String.valueOf(timeout));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeamB(int foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(foul));
    }

    public void displayTimeOutTeamB(int timeout) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_timeout);
        scoreView.setText(String.valueOf(timeout));
    }
}