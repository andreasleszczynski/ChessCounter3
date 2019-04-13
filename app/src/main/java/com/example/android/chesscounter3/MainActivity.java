package com.example.android.chesscounter3;

/**
 * Copyright 2018 Andreas Leszczynski
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Declare variable to count figures taken
    private int counterQueenWhite;
    private int counterTowerWhite;
    private int counterRunnerWhite;
    private int counterKnightWhite;
    private int counterPawnWhite;
    private int counterQueenBlack;
    private int counterTowerBlack;
    private int counterRunnerBlack;
    private int counterKnightBlack;
    private int counterPawnBlack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // recovering the instance state
        if (savedInstanceState != null) {
            counterQueenWhite = savedInstanceState.getInt("SCORE_QUEENWHITE");
            counterTowerWhite = savedInstanceState.getInt("SCORE_TOWERWHITE");
            counterRunnerWhite = savedInstanceState.getInt("SCORE_RUNNERWHITE");
            counterKnightWhite = savedInstanceState.getInt("SCORE_KNIGHTWHITE");
            counterPawnWhite = savedInstanceState.getInt("SCORE_PAWNWHITE");
            counterQueenBlack = savedInstanceState.getInt("SCORE_QUEENBLACK");
            counterTowerBlack = savedInstanceState.getInt("SCORE_TOWERBLACK");
            counterRunnerBlack = savedInstanceState.getInt("SCORE_RUNNERBLACK");
            counterKnightBlack = savedInstanceState.getInt("SCORE_KNIGHTBLACK");
            counterPawnBlack = savedInstanceState.getInt("SCORE_PAWNBLACK");
        } else {
            counterQueenWhite = 0;
            counterTowerWhite = 0;
            counterRunnerWhite = 0;
            counterKnightWhite = 0;
            counterPawnWhite = 0;
            counterQueenBlack = 0;
            counterTowerBlack = 0;
            counterRunnerBlack = 0;
            counterKnightBlack = 0;
            counterPawnBlack = 0;
        }

        // assign values to textViews
        displayQueenWhite(counterQueenWhite);
        displayQueenBlack(counterQueenBlack);
        displayTowerWhite(counterTowerWhite);
        displayTowerBlack(counterTowerBlack);
        displayKnightWhite(counterKnightWhite);
        displayKnightBlack(counterKnightBlack);
        displayRunnerWhite(counterRunnerWhite);
        displayRunnerBlack(counterRunnerBlack);
        displayPawnWhite(counterPawnWhite);
        displayPawnBlack(counterPawnBlack);
    }

    /**
     * This method is called when the configuration of the Activity changes.
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        // call superclass to save any view hierarchy
        super.onSaveInstanceState(outState);

        outState.putInt("SCORE_QUEENWHITE", counterQueenWhite);
        outState.putInt("SCORE_QUEENBLACK", counterQueenBlack);
        outState.putInt("SCORE_TOWERWHITE", counterTowerWhite);
        outState.putInt("SCORE_TOWERBLACK", counterTowerBlack);
        outState.putInt("SCORE_RUNNERWHITE", counterRunnerWhite);
        outState.putInt("SCORE_RUNNERBLACK", counterRunnerBlack);
        outState.putInt("SCORE_KNIGHTWHITE", counterKnightWhite);
        outState.putInt("SCORE_KNIGHTBLACK", counterKnightBlack);
        outState.putInt("SCORE_PAWNWHITE", counterPawnWhite);
        outState.putInt("SCORE_PAWNBLACK", counterPawnBlack);
    }

    public void incrementQueenWhite(View v) {
        if (counterQueenWhite == 1) {
            return;
        }
        counterQueenWhite += 1;
        displayQueenWhite(counterQueenWhite);
    }

    public void decrementQueenWhite(View v) {
        if (counterQueenWhite == 0) {
            return;
        }
        counterQueenWhite -= 1;
        displayQueenWhite(counterQueenWhite);
    }

    public void incrementQueenBlack(View v) {
        if (counterQueenBlack == 1) {
            return;
        }
        counterQueenBlack += 1;
        displayQueenBlack(counterQueenBlack);
    }

    public void decrementQueenBlack(View v) {
        if (counterQueenBlack == 0) {
            return;
        }
        counterQueenBlack -= 1;
        displayQueenBlack(counterQueenBlack);
    }

    public void incrementTowerWhite(View v) {
        if (counterTowerWhite == 2) {
            return;
        }
        counterTowerWhite += 1;
        displayTowerWhite(counterTowerWhite);
    }

    public void decrementTowerWhite(View v) {
        if (counterTowerWhite == 0) {
            return;
        }
        counterTowerWhite -= 1;
        displayTowerWhite(counterTowerWhite);
    }

    public void incrementTowerBlack(View v) {
        if (counterTowerBlack == 2) {
            return;
        }
        counterTowerBlack += 1;
        displayTowerBlack(counterTowerBlack);
    }

    public void decrementTowerBlack(View v) {
        if (counterTowerBlack == 0) {
            return;
        }
        counterTowerBlack -= 1;
        displayTowerBlack(counterTowerBlack);
    }

    public void incrementRunnerWhite(View v) {
        if (counterRunnerWhite == 2) {
            return;
        }
        counterRunnerWhite += 1;
        displayRunnerWhite(counterRunnerWhite);
    }

    public void decrementRunnerWhite(View v) {
        if (counterRunnerWhite == 0) {
            return;
        }
        counterRunnerWhite -= 1;
        displayRunnerWhite(counterRunnerWhite);
    }

    public void incrementRunnerBlack(View v) {
        if (counterRunnerBlack == 2) {
            return;
        }
        counterRunnerBlack += 1;
        displayRunnerBlack(counterRunnerBlack);
    }

    public void decrementRunnerBlack(View v) {
        if (counterRunnerBlack == 0) {
            return;
        }
        counterRunnerBlack -= 1;
        displayRunnerBlack(counterRunnerBlack);
    }

    public void incrementKnightWhite(View v) {
        if (counterKnightWhite == 2) {
            return;
        }
        counterKnightWhite += 1;
        displayKnightWhite(counterKnightWhite);
    }

    public void decrementKnightWhite(View v) {
        if (counterKnightWhite == 0) {
            return;
        }
        counterKnightWhite -= 1;
        displayKnightWhite(counterKnightWhite);
    }

    public void incrementKnightBlack(View v) {
        if (counterKnightBlack == 2) {
            return;
        }
        counterKnightBlack += 1;
        displayKnightBlack(counterKnightBlack);
    }

    public void decrementKnightBlack(View v) {
        if (counterKnightBlack == 0) {
            return;
        }
        counterKnightBlack -= 1;
        displayKnightBlack(counterKnightBlack);
    }

    public void incrementPawnWhite(View v) {
        if (counterPawnWhite == 8) {
            return;
        }
        counterPawnWhite += 1;
        displayPawnWhite(counterPawnWhite);
    }

    public void decrementPawnWhite(View v) {
        if (counterPawnWhite == 0) {
            return;
        }
        counterPawnWhite -= 1;
        displayPawnWhite(counterPawnWhite);
    }

    public void incrementPawnBlack(View v) {
        if (counterPawnBlack == 8) {
            return;
        }
        counterPawnBlack += 1;
        displayPawnBlack(counterPawnBlack);
    }

    public void decrementPawnBlack(View v) {
        if (counterPawnBlack == 0) {
            return;
        }
        counterPawnBlack -= 1;
        displayPawnBlack(counterPawnBlack);
    }

    private void displayQueenWhite(int score) {
        TextView scoreView = findViewById(R.id.textview_queenwhite);
        scoreView.setText(String.valueOf(score));
    }

    private void displayQueenBlack(int score) {
        TextView scoreView = findViewById(R.id.textview_queenblack);
        scoreView.setText(String.valueOf(score));
    }

    private void displayTowerWhite(int score) {
        TextView scoreView = findViewById(R.id.textview_towerwhite);
        scoreView.setText(String.valueOf(score));
    }

    private void displayTowerBlack(int score) {
        TextView scoreView = findViewById(R.id.textview_towerblack);
        scoreView.setText(String.valueOf(score));
    }

    private void displayRunnerWhite(int score) {
        TextView scoreView = findViewById(R.id.textview_runnerwhite);
        scoreView.setText(String.valueOf(score));
    }

    private void displayRunnerBlack(int score) {
        TextView scoreView = findViewById(R.id.textview_runnerblack);
        scoreView.setText(String.valueOf(score));
    }

    private void displayKnightWhite(int score) {
        TextView scoreView = findViewById(R.id.textview_knightwhite);
        scoreView.setText(String.valueOf(score));
    }

    private void displayKnightBlack(int score) {
        TextView scoreView = findViewById(R.id.textview_knightblack);
        scoreView.setText(String.valueOf(score));
    }

    private void displayPawnWhite(int score) {
        TextView scoreView = findViewById(R.id.textview_pawnwhite);
        scoreView.setText(String.valueOf(score));
    }

    private void displayPawnBlack(int score) {
        TextView scoreView = findViewById(R.id.textview_pawnblack);
        scoreView.setText(String.valueOf(score));
    }

    public void resetCounter(View v) {
        counterQueenWhite = 0;
        counterQueenBlack = 0;
        counterTowerWhite = 0;
        counterTowerBlack = 0;
        counterRunnerWhite = 0;
        counterRunnerBlack = 0;
        counterKnightWhite = 0;
        counterKnightBlack = 0;
        counterPawnWhite = 0;
        counterPawnBlack = 0;
        displayQueenWhite(counterQueenWhite);
        displayQueenBlack(counterQueenBlack);
        displayTowerWhite(counterTowerWhite);
        displayTowerBlack(counterTowerBlack);
        displayRunnerWhite(counterRunnerWhite);
        displayRunnerBlack(counterRunnerBlack);
        displayKnightWhite(counterKnightWhite);
        displayKnightBlack(counterKnightBlack);
        displayPawnWhite(counterPawnWhite);
        displayPawnBlack(counterPawnBlack);
    }
}
