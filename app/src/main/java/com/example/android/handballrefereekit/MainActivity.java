package com.example.android.handballrefereekit;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Team A Statistics
    int teamA_Score = 0;
    int teamA_Foul = 0;
    int teamA_YellowCard = 0;
    int teamA_RedCard = 0;

    // Team B Statistics
    int teamB_Score = 0;
    int teamB_Foul = 0;
    int teamB_YellowCard = 0;
    int teamB_RedCard = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Display Score for Team A
     **/
    public void DisplayTeamA_Score(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display Fouls for Team A
     **/
    public void DisplayTeamA_Fouls(int foul) {
        TextView foulView = findViewById(R.id.team_a_fouls);
        foulView.setText(String.valueOf(foul));
    }

    /**
     * Display Yellow Cards of Team A
     **/
    public void DisplayTeamA_YellowCards(int yellowCard) {
        TextView YellowCardView = findViewById(R.id.team_a_ycard);
        YellowCardView.setText(String.valueOf(yellowCard));
    }

    /**
     * Display Red Cards of Team A
     **/
    public void DisplayTeamA_RedCards(int redCard) {
        TextView RedCardView = findViewById(R.id.team_a_rcard);
        RedCardView.setText(String.valueOf(redCard));
    }

    /**
     * Increase Score points by 1+ for Team A
     **/
    public void teamA_AddScorePoint(View v) {
        teamA_Score = teamA_Score + 1;
        DisplayTeamA_Score(teamA_Score);
    }

    /**
     * Increase Fouls by 1+ for Team A
     **/
    public void TeamA_AddFoul(View v) {
        teamA_Foul = teamA_Foul + 1;
        DisplayTeamA_Fouls(teamA_Foul);
    }

    /**
     * Increase Yellow Cards by 1+ of Team A
     **/
    public void TeamA_AddYellowCard(View v) {
        teamA_YellowCard = teamA_YellowCard + 1;
        DisplayTeamA_YellowCards(teamA_YellowCard);
    }

    /**
     * Increase Red Cards by 1+ of Team A
     **/
    public void TeamA_AddRedCard(View v) {
        teamA_RedCard = teamA_RedCard + 1;
        DisplayTeamA_RedCards(teamA_RedCard);
    }


    /**
     * Display Score for Team B
     **/
    public void DisplayTeamB_Score(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display Fouls for Team B
     **/
    public void DisplayTeamB_Fouls(int foul) {
        TextView FoulView = findViewById(R.id.team_b_fouls);
        FoulView.setText(String.valueOf(foul));
    }

    /**
     * Display Yellow Cards of Team B
     **/
    public void DisplayTeamB_YellowCards(int yellowCard) {
        TextView yellowCardView = findViewById(R.id.team_b_ycard);
        yellowCardView.setText(String.valueOf(yellowCard));
    }

    /**
     * Display Red Cards of Team B
     **/
    public void DisplayTeamB_RedCards(int redCard) {
        TextView redCardView = findViewById(R.id.team_b_rcard);
        redCardView.setText(String.valueOf(redCard));
    }

    /**
     * Increase Score points by 1+ for Team B
     **/
    public void teamB_AddScorePoint(View v) {
        teamB_Score = teamB_Score + 1;
        DisplayTeamB_Score(teamB_Score);
    }

    /**
     * Increase Fouls by 1+ for Team B
     **/
    public void teamB_AddFoul(View v) {
        teamB_Foul = teamB_Foul + 1;
        DisplayTeamB_Fouls(teamB_Foul);
    }


    /**
     * Increase Yellow Cards by 1+ of Team B
     **/
    public void teamB_addYellowCard(View v) {
        teamB_YellowCard = teamB_YellowCard + 1;
        DisplayTeamB_YellowCards(teamB_YellowCard);
    }


    /**
     * Increase Red Cards by 1+ of Team B
     **/
    public void teamB_addRedCard(View v) {
        teamB_RedCard = teamB_RedCard + 1;
        DisplayTeamB_RedCards(teamB_RedCard);
    }


    /**
     * Reset Counters of Team A & Team B to 0
     **/
    public void resetAll(View v) {
        teamA_Score = 0;
        teamA_Foul = 0;
        teamA_YellowCard = 0;
        teamA_RedCard = 0;
        teamB_Score = 0;
        teamB_Foul = 0;
        teamB_YellowCard = 0;
        teamB_RedCard = 0;

        DisplayTeamA_Score(teamA_Score);
        DisplayTeamA_Fouls(teamA_Foul);
        DisplayTeamA_YellowCards(teamA_YellowCard);
        DisplayTeamA_RedCards(teamA_RedCard);
        DisplayTeamB_Score(teamB_Score);
        DisplayTeamB_Fouls(teamB_Foul);
        DisplayTeamB_YellowCards(teamB_YellowCard);
        DisplayTeamB_RedCards(teamB_RedCard);
    }
}
