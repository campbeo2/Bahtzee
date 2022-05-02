package com.example.bahtzeetest;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.bahtzeetest.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button score, cancel;

    private PopupWindow scoreTable;
    private LayoutInflater layoutInflater;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private HashMap<String, Integer> map = new HashMap<String, Integer>(){{
        put("one", 0); put("two", 0); put("three", 0);
        put("four", 0); put("five", 0); put("six", 0);
        put("three_of_kind", 0); put("four_of_kind", 0); put("full_house", 0);
        put("sm_straight", 0); put("lrg_straight", 0); put("chance", 0);
        put("yahtzee", 0); put("yahtzee_bonus", 0); put("upper_bonus", 0);
        put("upper_total", 0); put("lower_total", 0); put("grand_total", 0);
    }};
    private int round_number = 0;
    static ArrayList<Integer> scores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }

    public void getScores(View view) {
        TextView d1 = (TextView) findViewById(R.id.low_score);
        Button d2 = (Button) findViewById(R.id.but12);
        Button d3 = (Button) findViewById(R.id.but13);
        Button d4 = (Button) findViewById(R.id.but14);
        Button d5 = (Button) findViewById(R.id.but15);
        int dice1 = Integer.parseInt((String)d1.getText());
        int dice2 = Integer.parseInt((String) d2.getText());
        int dice3 = Integer.parseInt((String) d3.getText());
        int dice4 = Integer.parseInt((String) d4.getText());
        int dice5 = Integer.parseInt((String) d5.getText());
        scores.clear();
        scores.add(dice1); scores.add(dice2); scores.add(dice3);
        scores.add(dice4); scores.add(dice5);
    }


    @SuppressLint("SetTextI18n")
    public void rollDice(View v) {
        Random rand = new Random();
        int[] rand_array = new int[5];
        for (int i = 0; i < 5; i++) {
            int rand_number = rand.nextInt(6) + 1;
            rand_array[i] = rand_number;
        }
        Button but1 = (Button) findViewById(R.id.but1);
        if (but1.getText().equals("0")) {
            but1.setText(Integer.toString(rand_array[0]));
            Button but2 = (Button) findViewById(R.id.but2);
            but2.setText(Integer.toString(rand_array[1]));
            Button but3 = (Button) findViewById(R.id.but3);
            but3.setText(Integer.toString(rand_array[2]));
            Button but4 = (Button) findViewById(R.id.but4);
            but4.setText(Integer.toString(rand_array[3]));
            Button but5 = (Button) findViewById(R.id.but5);
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

        Button but1 = (Button) findViewById(R.id.but6);
        if (but1.getText().equals("0"))
            but1.setText(Integer.toString(rand_array[0]));
        Button but2 = (Button) findViewById(R.id.but7);
        if (but2.getText().equals("0"))
            but2.setText(Integer.toString(rand_array[1]));
        Button but3 = (Button) findViewById(R.id.but8);
        if (but3.getText().equals("0"))
            but3.setText(Integer.toString(rand_array[2]));
        Button but4 = (Button) findViewById(R.id.but9);
        if (but4.getText().equals("0"))
        but4.setText(Integer.toString(rand_array[3]));
        Button but5 = (Button) findViewById(R.id.but10);
        if (but5.getText().equals("0"))
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
        Button but1 = (Button) findViewById(R.id.but11);
        if (but1.getText().equals("0"))
            but1.setText(Integer.toString(rand_array[0]));
        Button but2 = (Button) findViewById(R.id.but12);
        if (but2.getText().equals("0"))
            but2.setText(Integer.toString(rand_array[1]));
        Button but3 = (Button) findViewById(R.id.but13);
        if (but3.getText().equals("0"))
            but3.setText(Integer.toString(rand_array[2]));
        Button but4 = (Button) findViewById(R.id.but14);
        if (but4.getText().equals("0"))
            but4.setText(Integer.toString(rand_array[3]));
        Button but5 = (Button) findViewById(R.id.but15);
        if (but5.getText().equals("0"))
            but5.setText(Integer.toString(rand_array[4]));
    }

    public void lockDiceOne (View v) {
        Button but = (Button) findViewById(R.id.but1);
        String num = (String) but.getText();
        Button round2_but = (Button) findViewById(R.id.but6);
        round2_but.setText(num);
    }

    public void lockDiceTwo (View v) {
        Button but = (Button) findViewById(R.id.but2);
        String num = (String) but.getText();
        Button round2_but = (Button) findViewById(R.id.but7);
        round2_but.setText(num);
    }

    public void lockDiceThree (View v) {
        Button but = (Button) findViewById(R.id.but3);
        String num = (String) but.getText();
        Button round2_but = (Button) findViewById(R.id.but8);
        round2_but.setText(num);
    }

    public void lockDiceFour (View v) {
        Button but = (Button) findViewById(R.id.but4);
        String num = (String) but.getText();
        Button round2_but = (Button) findViewById(R.id.but9);
        round2_but.setText(num);
    }

    public void lockDiceFive (View v) {
        Button but = (Button) findViewById(R.id.but5);
        String num = (String) but.getText();
        Button round2_but = (Button) findViewById(R.id.but10);
        round2_but.setText(num);
    }

    public void lockDiceOneTwo (View v) {
        Button round2_but = (Button) findViewById(R.id.but6);
        String num = (String) round2_but.getText();
        round2_but.setText(num);
        Button round3_but = (Button) findViewById(R.id.but11);
        round3_but.setText(num);
    }
    public void lockDiceTwoTwo (View v) {
        Button round2_but = (Button) findViewById(R.id.but7);
        String num = (String) round2_but.getText();
        round2_but.setText(num);
        Button round3_but = (Button) findViewById(R.id.but12);
        round3_but.setText(num);
    }

    public void lockDiceThreeTwo (View v) {
        Button round2_but = (Button) findViewById(R.id.but8);
        String num = (String) round2_but.getText();
        round2_but.setText(num);
        Button round3_but = (Button) findViewById(R.id.but13);
        round3_but.setText(num);
    }

    public void lockDiceFourTwo (View v) {
        Button round2_but = (Button) findViewById(R.id.but9);
        String num = (String) round2_but.getText();
        round2_but.setText(num);
        Button round3_but = (Button) findViewById(R.id.but14);
        round3_but.setText(num);
    }

    public void lockDiceFiveTwo (View v) {
        Button round2_but = (Button) findViewById(R.id.but10);
        String num = (String) round2_but.getText();
        round2_but.setText(num);
        Button round3_but = (Button) findViewById(R.id.but15);
        round3_but.setText(num);
    }

    public void allocateTable (View v) {
        TextView one_score = (TextView) findViewById(R.id.one_score);
        one_score.setText(Integer.toString(map.get("one")));

        TextView two_score = (TextView) findViewById(R.id.two_score);
        two_score.setText(Integer.toString(map.get("two")));

        TextView three_score = (TextView) findViewById(R.id.three_score);
        three_score.setText(Integer.toString(map.get("three")));

        TextView four_score = (TextView) findViewById(R.id.four_score);
        four_score.setText(Integer.toString(map.get("four")));

        TextView five_score = (TextView) findViewById(R.id.five_score);
        five_score.setText(Integer.toString(map.get("five")));

        TextView six_score = (TextView) findViewById(R.id.six_score);
        six_score.setText(Integer.toString(map.get("six")));

        TextView three_of_kind_score = (TextView) findViewById(R.id.three_of_kind_score);
        three_of_kind_score.setText(Integer.toString(map.get("three_of_kind")));

        TextView four_of_kind_score = (TextView) findViewById(R.id.four_of_kind_score);
        four_of_kind_score.setText(Integer.toString(map.get("four_of_kind")));

        TextView full_house_score = (TextView) findViewById(R.id.full_house_score);
        full_house_score.setText(Integer.toString(map.get("full_house")));

        TextView sm_straight_score = (TextView) findViewById(R.id.sm_straight_score);
        sm_straight_score.setText(Integer.toString(map.get("sm_straight")));

        TextView lrg_straight_score = (TextView) findViewById(R.id.lrg_straight_score);
        lrg_straight_score.setText(Integer.toString(map.get("lrg_straight")));

        TextView chance_score = (TextView) findViewById(R.id.chance_score);
        chance_score.setText(Integer.toString(map.get("chance")));

        TextView yahtzee_score = (TextView) findViewById(R.id.yahtzee_score);
        yahtzee_score.setText(Integer.toString(map.get("yahtzee")));

        TextView yahtzee_bonus_score = (TextView) findViewById(R.id.yahtzee_bonus_score);
        yahtzee_bonus_score.setText(Integer.toString(map.get("yahtzee_bonus")));

        TextView up_bonus_score = (TextView) findViewById(R.id.up_bonus_score);
        up_bonus_score.setText(Integer.toString(map.get("upper_bonus")));

        TextView up_score = (TextView) findViewById(R.id.up_score);
        up_score.setText(Integer.toString(map.get("upper_total")));

        TextView low_score = (TextView) findViewById(R.id.low_score);
        low_score.setText(Integer.toString(map.get("lower_total")));

        TextView total_score = (TextView) findViewById(R.id.total_score);
        total_score.setText(Integer.toString(map.get("grand_total")));
    }


    public void showScore (View v) {
        int round_score = 0;
        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) == 1) {
                round_score++;
            }
        }
        TextView one_score = (TextView) findViewById(R.id.one_score_table);
        one_score.setText(Integer.toString(round_score));
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