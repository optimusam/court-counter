package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int scoreA=0,scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
//   Display Score for Team A
    public void displayScoreA(int scoreA) {
        TextView scoreViewA = (TextView) findViewById(R.id.team_A_view);
        scoreViewA.setText(String.valueOf(scoreA));
    }
//    Display score for Team B
    public void displayScoreB(int scoreB) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_B_view);
        scoreViewB.setText(String.valueOf(scoreB));
    }
//    Update Scores for A
    public void plusThreeForA(View view) {
        scoreA+=3;
        displayScoreA(scoreA);
    }

    public void plusTwoForA(View view) {
        scoreA+=2;
        displayScoreA(scoreA);
    }

    public void plusOneForA(View view) {
        scoreA+=1;
        displayScoreA(scoreA);
    }
//  Update scores for B
    public void plusThreeForB(View view) {
        scoreB+=3;
        displayScoreB(scoreB);
    }

    public void plusTwoForB(View view) {
        scoreB+=2;
        displayScoreB(scoreB);
    }

    public void plusOneForB(View view) {
        scoreB+=1;
        displayScoreB(scoreB);
    }
//    Reset Score
    public void reset(View view) {
        displayScoreA(0);
        displayScoreB(0);
    }
}
