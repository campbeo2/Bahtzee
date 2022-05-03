package com.example.bahtzeetest;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.bahtzeetest.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    public static final String DICE_SCORES = "diceScore";
    public static final String DICE_ONE = "dice1";
    public static final String DICE_TWO = "dice2";
    public static final String DICE_THREE = "dice3";
    public static final String DICE_FOUR = "dice4";
    public static final String DICE_FIVE = "dice5";

    public static final String SELECTED_SCORE = "selectedScore";
    public static final String SCORE_ONE = "one";
    public static final String SCORE_TWO = "two";
    public static final String SCORE_THREE = "three";
    public static final String SCORE_FOUR = "four";
    public static final String SCORE_FIVE = "fice";
    public static final String SCORE_SIX = "six";
    public static final String SCORE_3OK = "3OK";
    public static final String SCORE_4OK = "4OK";
    public static final String SCORE_FULL_HOUSE = "fullHouse";
    public static final String SCORE_YAHTZEE = "yahtzee";
    public static final String SCORE_CHANCE = "chance";
    public static final String SCORE_SM_STRT = "smStraight";
    public static final String SCORE_LRG_STRT = "lrgStraight";
    private int round_number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        editor.clear();
        editor.commit();
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }

    public void getScores(View view) {
        Button d1 = findViewById(R.id.but11);
        Button d2 = findViewById(R.id.but12);
        Button d3 = findViewById(R.id.but13);
        Button d4 = findViewById(R.id.but14);
        Button d5 = findViewById(R.id.but15);
        int dice1 = Integer.parseInt((String) d1.getText());
        int dice2 = Integer.parseInt((String) d2.getText());
        int dice3 = Integer.parseInt((String) d3.getText());
        int dice4 = Integer.parseInt((String) d4.getText());
        int dice5 = Integer.parseInt((String) d5.getText());

        SharedPreferences sharedPreferences = getSharedPreferences(DICE_SCORES, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.commit();

        editor.putInt(DICE_ONE, dice1);
        editor.putInt(DICE_TWO, dice2);
        editor.putInt(DICE_THREE, dice3);
        editor.putInt(DICE_FOUR, dice4);
        editor.putInt(DICE_FIVE, dice5);
        editor.commit();
    }

    @SuppressLint("SetTextI18n")
    public void rollDice(View v) {
        Random rand = new Random();
        int[] rand_array = new int[5];
        for (int i = 0; i < 5; i++) {
            int rand_number = rand.nextInt(6) + 1;
            rand_array[i] = rand_number;
        }
        Button but1 = findViewById(R.id.but1);
        if (but1.getText().equals("")) {
            but1.setText(Integer.toString(rand_array[0]));
            Button but2 = findViewById(R.id.but2);
            but2.setText(Integer.toString(rand_array[1]));
            Button but3 = findViewById(R.id.but3);
            but3.setText(Integer.toString(rand_array[2]));
            Button but4 = findViewById(R.id.but4);
            but4.setText(Integer.toString(rand_array[3]));
            Button but5 = findViewById(R.id.but5);
            but5.setText(Integer.toString(rand_array[4]));
        }
    }

    @SuppressLint("SetTextI18n")
    public void rollDiceTwo(View v) {
        Random rand = new Random();
        int[] rand_array = new int[5];
        for (int i = 0; i < 5; i++) {
            int rand_number = rand.nextInt(6) + 1;
            rand_array[i] = rand_number;
        }

        Button but1 = findViewById(R.id.but6);
        if (but1.getText().equals(""))
            but1.setText(Integer.toString(rand_array[0]));
        Button but2 = findViewById(R.id.but7);
        if (but2.getText().equals(""))
            but2.setText(Integer.toString(rand_array[1]));
        Button but3 = findViewById(R.id.but8);
        if (but3.getText().equals(""))
            but3.setText(Integer.toString(rand_array[2]));
        Button but4 = findViewById(R.id.but9);
        if (but4.getText().equals(""))
        but4.setText(Integer.toString(rand_array[3]));
        Button but5 = findViewById(R.id.but10);
        if (but5.getText().equals(""))
            but5.setText(Integer.toString(rand_array[4]));
        }

    @SuppressLint("SetTextI18n")
    public void rollDiceThree(View v) {
        Random rand = new Random();
        int[] rand_array = new int[5];
        for (int i = 0; i < 5; i++) {
            int rand_number = rand.nextInt(6) + 1;
            rand_array[i] = rand_number;
        }
        Button but1 = findViewById(R.id.but11);
        if (but1.getText().equals(""))
            but1.setText(Integer.toString(rand_array[0]));
        Button but2 = findViewById(R.id.but12);
        if (but2.getText().equals(""))
            but2.setText(Integer.toString(rand_array[1]));
        Button but3 = findViewById(R.id.but13);
        if (but3.getText().equals(""))
            but3.setText(Integer.toString(rand_array[2]));
        Button but4 = findViewById(R.id.but14);
        if (but4.getText().equals(""))
            but4.setText(Integer.toString(rand_array[3]));
        Button but5 = findViewById(R.id.but15);
        if (but5.getText().equals(""))
            but5.setText(Integer.toString(rand_array[4]));
    }

    public void lockDiceOne (View v) {
        Button but = findViewById(R.id.but1);
        String num = (String) but.getText();
        Button round2_but = findViewById(R.id.but6);
        round2_but.setText(num);
    }

    public void lockDiceTwo (View v) {
        Button but = findViewById(R.id.but2);
        String num = (String) but.getText();
        Button round2_but = findViewById(R.id.but7);
        round2_but.setText(num);
    }

    public void lockDiceThree (View v) {
        Button but = findViewById(R.id.but3);
        String num = (String) but.getText();
        Button round2_but = findViewById(R.id.but8);
        round2_but.setText(num);
    }

    public void lockDiceFour (View v) {
        Button but = findViewById(R.id.but4);
        String num = (String) but.getText();
        Button round2_but = findViewById(R.id.but9);
        round2_but.setText(num);
    }

    public void lockDiceFive (View v) {
        Button but = findViewById(R.id.but5);
        String num = (String) but.getText();
        Button round2_but = findViewById(R.id.but10);
        round2_but.setText(num);
    }

    public void lockDiceOneTwo (View v) {
        Button round2_but = findViewById(R.id.but6);
        String num = (String) round2_but.getText();
        round2_but.setText(num);
        Button round3_but = findViewById(R.id.but11);
        round3_but.setText(num);
    }
    public void lockDiceTwoTwo (View v) {
        Button round2_but = findViewById(R.id.but7);
        String num = (String) round2_but.getText();
        round2_but.setText(num);
        Button round3_but = findViewById(R.id.but12);
        round3_but.setText(num);
    }

    public void lockDiceThreeTwo (View v) {
        Button round2_but = findViewById(R.id.but8);
        String num = (String) round2_but.getText();
        round2_but.setText(num);
        Button round3_but = findViewById(R.id.but13);
        round3_but.setText(num);
    }

    public void lockDiceFourTwo (View v) {
        Button round2_but = findViewById(R.id.but9);
        String num = (String) round2_but.getText();
        round2_but.setText(num);
        Button round3_but = findViewById(R.id.but14);
        round3_but.setText(num);
    }

    public void lockDiceFiveTwo (View v) {
        Button round2_but = findViewById(R.id.but10);
        String num = (String) round2_but.getText();
        round2_but.setText(num);
        Button round3_but = findViewById(R.id.but15);
        round3_but.setText(num);
    }

    public void allocateTable (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        int score_one = setScore.getInt(SCORE_ONE, 0);
        int score_two = setScore.getInt(SCORE_TWO, 0);
        int score_three = setScore.getInt(SCORE_THREE, 0);
        int score_four = setScore.getInt(SCORE_FOUR, 0);
        int score_five = setScore.getInt(SCORE_FIVE, 0);
        int score_six = setScore.getInt(SCORE_SIX, 0);
        int score_3OK = setScore.getInt(SCORE_3OK, 0);
        int score_4OK = setScore.getInt(SCORE_4OK, 0);
        int score_full_house = setScore.getInt(SCORE_FULL_HOUSE, 0);
        int score_sm_straight = setScore.getInt(SCORE_SM_STRT, 0);
        int score_lrg_straight = setScore.getInt(SCORE_LRG_STRT, 0);
        int score_yahtzee = setScore.getInt(SCORE_YAHTZEE, 0);
        int score_chance = setScore.getInt(SCORE_CHANCE, 0);
        int score_upper = score_one + score_two + score_three + score_four + score_five + score_six;
        int score_lower = score_3OK + score_4OK + score_sm_straight + score_lrg_straight +
                score_chance + score_chance + score_full_house;
        int score_total = score_upper + score_lower;
        TextView one_score = findViewById(R.id.one_score);
        one_score.setText(Integer.toString(score_one));

        TextView two_score = findViewById(R.id.two_score);
        two_score.setText(Integer.toString(score_two));

        TextView three_score = findViewById(R.id.three_score);
        three_score.setText(Integer.toString(score_three));

        TextView four_score = findViewById(R.id.four_score);
        four_score.setText(Integer.toString(score_four));

        TextView five_score = findViewById(R.id.five_score);
        five_score.setText(Integer.toString(score_five));

        TextView six_score = findViewById(R.id.six_score);
        six_score.setText(Integer.toString(score_six));

        TextView three_of_kind_score = findViewById(R.id.three_of_kind_score);
        three_of_kind_score.setText(Integer.toString(score_3OK));

        TextView four_of_kind_score = findViewById(R.id.four_of_kind_score);
        four_of_kind_score.setText(Integer.toString(score_4OK));

        TextView full_house_score = findViewById(R.id.full_house_score);
        full_house_score.setText(Integer.toString(score_full_house));

        TextView sm_straight_score = findViewById(R.id.sm_straight_score);
        sm_straight_score.setText(Integer.toString(score_sm_straight));

        TextView lrg_straight_score = findViewById(R.id.lrg_straight_score);
        lrg_straight_score.setText(Integer.toString(score_lrg_straight));

        TextView chance_score = findViewById(R.id.chance_score);
        chance_score.setText(Integer.toString(score_chance));

        TextView yahtzee_score = findViewById(R.id.yahtzee_score);
        yahtzee_score.setText(Integer.toString(score_yahtzee));

        TextView yahtzee_bonus_score = findViewById(R.id.yahtzee_bonus_score);
        yahtzee_bonus_score.setText("");

        if (score_upper > 62) {
            TextView up_bonus_score = findViewById(R.id.up_bonus_score);
            up_bonus_score.setText(Integer.toString(35));

            TextView total_score = findViewById(R.id.total_score);
            total_score.setText(Integer.toString(score_total + 35));
        } else {
            TextView total_score = findViewById(R.id.total_score);
            total_score.setText(Integer.toString(score_total));
        }

        TextView up_score = findViewById(R.id.up_score);
        up_score.setText(Integer.toString(score_upper));

        TextView low_score = findViewById(R.id.low_score);
        low_score.setText(Integer.toString(score_lower));
    }

    public void showScore (View v) {
        SharedPreferences sharedPreferences = this.getSharedPreferences(DICE_SCORES, MODE_PRIVATE);
        int dice1 = sharedPreferences.getInt(DICE_ONE, 0);
        int dice2 = sharedPreferences.getInt(DICE_TWO, 0);
        int dice3 = sharedPreferences.getInt(DICE_THREE, 0);
        int dice4 = sharedPreferences.getInt(DICE_FOUR, 0);
        int dice5 = sharedPreferences.getInt(DICE_FIVE, 0);
        int[] arr = {dice1, dice2, dice3, dice4, dice5};
        oneScore(arr); twoScore(arr); threeScore(arr);
        fourScore(arr); fiveScore(arr); sixScore(arr);
        threeOfKindScore(arr); fourOfKindScore(arr); fullHouseScore(arr);
        smStrtScore(arr); lrgStrtScore(arr); chanceScore(arr); yahtzeeScore(arr);
    }

    public void oneScore(int[] arr) {
        int round_score = 0;
        for (int j : arr) {
            if (j == 1) {
                round_score++;
            }
        }
        TextView one_score = findViewById(R.id.one_score_table);
        one_score.setText(Integer.toString(round_score));
    }

    public void twoScore(int[] arr) {
        int round_score = 0;
        for (int j : arr) {
            if (j == 2) {
                round_score+=2;
            }
        }
        TextView score = findViewById(R.id.two_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void threeScore(int[] arr) {
        int round_score = 0;
        for (int j : arr) {
            if (j == 3) {
                round_score+=3;
            }
        }
        TextView score = findViewById(R.id.three_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void fourScore(int[] arr) {
        int round_score = 0;
        for (int j : arr) {
            if (j == 4) {
                round_score+=4;
            }
        }
        TextView score = findViewById(R.id.four_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void fiveScore(int[] arr) {
        int round_score = 0;
        for (int j : arr) {
            if (j == 5) {
                round_score+=5;
            }
        }
        TextView score = findViewById(R.id.five_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void sixScore(int[] arr) {
        int round_score = 0;
        for (int j : arr) {
            if (j == 6) {
                round_score+=6;
            }
        }
        TextView score = findViewById(R.id.six_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void threeOfKindScore(int[] arr) {
        int round_score = 0;
        int repeat1 = 0; int repeat2 = 0; int repeat3 = 0;
        int repeat4 = 0; int repeat5 = 0; int repeat6 = 0;
        for (int j : arr) {
            if (j == 1) {
                repeat1++;
            } else if (j == 2) {
                repeat2++;
            } else if (j == 3) {
                repeat3++;
            } else if (j == 4) {
                repeat4++;
            } else if (j == 5) {
                repeat5++;
            } else if (j == 6) {
                repeat6++;
            }
        }
        if (repeat1 >= 3 || repeat2 >= 3 || repeat3 >= 3 || repeat4 >= 3 ||
                repeat5 >= 3 || repeat6 >= 3 ) {
            round_score = (repeat1) + (repeat2 * 2) + (repeat3 * 3) + (repeat4 * 4)
                    + (repeat5 * 5) + (repeat6 * 6);
        }
        TextView score = findViewById(R.id.three_of_kind_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void fourOfKindScore(int[] arr) {
        int round_score = 0;
        int repeat1 = 0; int repeat2 = 0; int repeat3 = 0;
        int repeat4 = 0; int repeat5 = 0; int repeat6 = 0;
        for (int j : arr) {
            if (j == 1) {
                repeat1++;
            } else if (j == 2) {
                repeat2++;
            } else if (j == 3) {
                repeat3++;
            } else if (j == 4) {
                repeat4++;
            } else if (j == 5) {
                repeat5++;
            } else if (j == 6) {
                repeat6++;
            }
        }
        if (repeat1 >= 4 || repeat2 >= 4 || repeat3 >= 4 || repeat4 >= 4 ||
                repeat5 >= 4 || repeat6 >= 4 ) {
            round_score = (repeat1) + (repeat2 * 2) + (repeat3 * 3) + (repeat4 * 4)
                    + (repeat5 * 5) + (repeat6 * 6);
        }
        TextView score = findViewById(R.id.four_of_kind_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void fullHouseScore(int[] arr) {
        int round_score = 0;
        int repeat1 = 0; int repeat2 = 0; int repeat3 = 0;
        int repeat4 = 0; int repeat5 = 0; int repeat6 = 0;
        for (int j : arr) {
            if (j == 1) {
                repeat1++;
            } else if (j == 2) {
                repeat2++;
            } else if (j == 3) {
                repeat3++;
            } else if (j == 4) {
                repeat4++;
            } else if (j == 5) {
                repeat5++;
            } else if (j == 6) {
                repeat6++;
            }
        }
        if ((repeat1 == 3 || repeat2 == 3 || repeat3 == 3 || repeat4 == 3 ||
                repeat5 == 3 || repeat6 == 3) && (repeat1 == 2 || repeat2 == 2 ||
                repeat3 == 2 || repeat4 == 2 || repeat5 == 2 || repeat6 == 2)) {
            round_score = 25;
        }
        TextView score = findViewById(R.id.full_house_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void smStrtScore(int[] arr) {
        int round_score = 0;
        Arrays.sort(arr);
        if ((arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4) ||
                (arr[0] == 2 && arr[1] == 3 && arr[2] == 4 && arr[3] == 5) ||
                (arr[0] == 3 && arr[1] == 4 && arr[2] == 5 && arr[3] == 6)) {
            round_score = 30;
        }
        TextView score = findViewById(R.id.sm_straight_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void lrgStrtScore(int[] arr) {
        int round_score = 0;
        Arrays.sort(arr);
        if ((arr[0] == 1 && arr[1] == 2 && arr[2] == 3 && arr[3] == 4 && arr[4] == 5) ||
                (arr[0] == 2 && arr[1] == 3 && arr[2] == 4 && arr[3] == 5 && arr[4] == 6)) {
            round_score = 40;
        }
        TextView score = findViewById(R.id.lrg_straight_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void chanceScore(int[] arr) {
        int round_score = 0;
        for (int j : arr) {
            round_score += j;
        }
        TextView score = findViewById(R.id.chance_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void yahtzeeScore(int[] arr) {
        int round_score = 0;
        if (arr[0] == arr[1] && arr[0] == arr[2] && arr[0] == arr[3] && arr[0]== arr[4]) {
            round_score = 50;
        }
        TextView score = findViewById(R.id.yahtzee_score_table);
        score.setText(Integer.toString(round_score));
    }

    public void setScoreOne (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.one_score_table);
        editor.putInt(SCORE_ONE, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setScoreTwo (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.two_score_table);
        editor.putInt(SCORE_TWO, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setScoreThree (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.three_score_table);
        editor.putInt(SCORE_THREE, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setScoreFour (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.four_score_table);
        editor.putInt(SCORE_FOUR, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setScoreFive (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.five_score_table);
        editor.putInt(SCORE_FIVE, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setScoreSix (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.six_score_table);
        editor.putInt(SCORE_SIX, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setThreeOfKind (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.three_of_kind_score_table);
        editor.putInt(SCORE_3OK, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setFourOfKind (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.four_of_kind_score_table);
        editor.putInt(SCORE_4OK, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setFullHouse (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.full_house_score_table);
        editor.putInt(SCORE_FULL_HOUSE, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }


    public void setScoreSmStrt (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.sm_straight_score_table);
        editor.putInt(SCORE_SM_STRT, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setScoreLrgStrt (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.lrg_straight_score_table);
        editor.putInt(SCORE_LRG_STRT, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setScoreChance (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.chance_score_table);
        editor.putInt(SCORE_CHANCE, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    public void setScoreYahtzee (View v) {
        SharedPreferences setScore = getSharedPreferences(SELECTED_SCORE, MODE_PRIVATE);
        SharedPreferences.Editor editor = setScore.edit();
        TextView t1 = findViewById(R.id.yahtzee_score_table);
        editor.putInt(SCORE_YAHTZEE, Integer.parseInt(t1.getText().toString()));
        editor.commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
