package com.example.bahtzeetest;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

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
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private HashMap<String, Integer> map = new HashMap<String, Integer>(){{
        put("one", 0); put("two", 0); put("three", 0);
        put("four", 0); put("five", 0); put("six", 0);
        put("three_of_Kind", 0); put("four_of_Kind", 0); put("full_house", 0);
        put("sm_straight", 0); put("lrg_straight", 0); put("chance", 0);
        put("yahtzee", 0); put("yahtzee_bonus", 0); put("upper_bonus", 0);
        put("upper_total", 0); put("lower_total", 0); put("grand_total", 0);
    }};

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

    public void rollDice(View v) {
        Random rand = new Random();
        int[] rand_array = new int[5];
        for (int i = 0; i < 5; i++) {
            int rand_number = rand.nextInt(6) + 1;
            rand_array[i] = rand_number;
        }

        Button but1 = (Button) findViewById(R.id.but1);
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

    public void rollDiceTwo(View v) {
        Random rand = new Random();
        int[] rand_array = new int[5];
        for (int i = 0; i < 5; i++) {
            int rand_number = rand.nextInt(6) + 1;
            rand_array[i] = rand_number;
        }

        Button but1 = (Button) findViewById(R.id.but6);
        but1.setText(Integer.toString(rand_array[0]));
        Button but2 = (Button) findViewById(R.id.but7);
        but2.setText(Integer.toString(rand_array[1]));
        Button but3 = (Button) findViewById(R.id.but8);
        but3.setText(Integer.toString(rand_array[2]));
        Button but4 = (Button) findViewById(R.id.but9);
        but4.setText(Integer.toString(rand_array[3]));
        Button but5 = (Button) findViewById(R.id.but10);
        but5.setText(Integer.toString(rand_array[4]));
        }

    public void rollDiceThree(View v) {
        Random rand = new Random();
        int[] rand_array = new int[5];
        for (int i = 0; i < 5; i++) {
            int rand_number = rand.nextInt(6) + 1;
            rand_array[i] = rand_number;
        }

        Button but1 = (Button) findViewById(R.id.but11);
        but1.setText(Integer.toString(rand_array[0]));
        Button but2 = (Button) findViewById(R.id.but12);
        but2.setText(Integer.toString(rand_array[1]));
        Button but3 = (Button) findViewById(R.id.but13);
        but3.setText(Integer.toString(rand_array[2]));
        Button but4 = (Button) findViewById(R.id.but14);
        but4.setText(Integer.toString(rand_array[3]));
        Button but5 = (Button) findViewById(R.id.but15);
        but5.setText(Integer.toString(rand_array[4]));
    }

    public void allocateTable (View v) {
        TableLayout table1 = (TableLayout) findViewById(R.id.tableLayout);
        TableRow row1 = (TableRow) findViewById(R.id.dataRow);
        TextView t1 = new TextView(this);
        t1.setText(map.get("one"));
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