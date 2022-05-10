package com.example.bahtzeetest;

import static org.junit.Assert.*;

import android.widget.*;
import android.view.*;

import org.junit.Test;

/**
 * Testing Bahtzee
 */
public class BahtzeeTests {
    MainActivity main = new MainActivity();

    @Test
    public void getScoresTest(){

    }

    @Test
    public void rollDiceTest(){

    }

    @Test
    public void rollDiceTwoTest(){

    }

    @Test
    public void rollDiceThreeTest(){

    }

    @Test
    public void lockDiceOneTest(){

    }

    @Test
    public void lockDiceTwoTest(){

    }

    @Test
    public void lockDiceThreeTest(){

    }

    @Test
    public void lockDiceFourTest(){

    }

    @Test
    public void lockDiceFiveTest(){

    }

    @Test
    public void lockDiceOneTwoTest(){

    }

    @Test
    public void lockDiceTwoTwoTest(){

    }

    @Test
    public void lockDiceThreeTwoTest(){

    }

    @Test
    public void lockDiceFourTwoTest(){

    }

    @Test
    public void lockDiceFiveTwoTest(){

    }

    @Test
    public void oneScoreTest(){
        int[] allOnes={1, 1, 1, 1, 1};
        main.oneScore(allOnes);
        TextView score = findViewById(R.id.one_score_table);
        assertEquals(5, Integer.valueOf((String) score.getText()));
    }

    @Test
    public void twoScoreTest(){

    }

    @Test
    public void threeScoreTest(){

    }

    @Test
    public void fourScoreTest(){

    }

    @Test
    public void fiveScoreTest(){

    }

    @Test
    public void sixScoreTest(){

    }

    @Test
    public void threeOfKindScoreTest(){

    }

    @Test
    public void fourOfKindScoreTest(){

    }

    @Test
    public void fullHouseTest(){

    }

    @Test
    public void smStraightScoreTest(){

    }

    @Test
    public void lrgStraightScoreTest(){

    }

    @Test
    public void chanceScoreTest(){

    }

    @Test
    public void yahtzeeScoreTest(){

    }

    @Test
    public void setScoreOneTest(){

    }

    @Test
    public void setScoreTwoTest(){

    }

    @Test
    public void setScoreThreeTest(){

    }

    @Test
    public void setScoreFourTest(){

    }

    @Test
    public void setScoreFiveTest(){

    }

    @Test
    public void setScoreSixTest(){

    }

    @Test
    public void setThreeOfKindTest(){

    }

    @Test
    public void setFourOfKindTest(){

    }

    @Test
    public void setFullHouseTest(){

    }

    @Test
    public void setScoreSmStrtTest(){

    }

    @Test
    public void setScoreChanceTest(){

    }

    @Test
    public void setScoreYahtzeeTest(){

    }

    @Test
    public void allocateTableTest(){

    }
}
