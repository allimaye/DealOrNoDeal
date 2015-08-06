package com.allimaye.dealornodeal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.*;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    private static final String msg = "myMessage";
    private static Case[] cases;
    private static int[][] caseMappings;
    private static ImageButton topleft, topRight, bottomLeft, bottomRight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        topleft = (ImageButton)findViewById(R.id.topLeftButton);
        topRight = (ImageButton)findViewById(R.id.topRightButton);
        bottomLeft = (ImageButton)findViewById(R.id.bottomLeftButton);
        bottomRight = (ImageButton)findViewById(R.id.bottomRightButton);

        cases = new Case[26];
        mapCases();

        SeekBar progress = (SeekBar)findViewById(R.id.seekBar);
        progress.setMax(100);
        progress.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser)
            {
                if (fromUser)
                {
                    int page = (int)(progress/(100.0/7.0));
                    //topLeft.setImage
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    private void mapCases()
    {
        caseMappings = new int[26][2];
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(5);
        values.add(10);
        values.add(15);
        values.add(25);
        values.add(50);
        values.add(75);
        values.add(100);
        values.add(200);
        values.add(300);
        values.add(400);
        values.add(500);
        values.add(750);
        values.add(1000);
        values.add(5000);
        values.add(10000);
        values.add(25000);
        values.add(50000);
        values.add(75000);
        values.add(100000);
        values.add(200000);
        values.add(300000);
        values.add(400000);
        values.add(500000);
        values.add(750000);
        values.add(1000000);

        int random = 0;
        for(int i = 0; i < 26; i++)
        {
            random = (int)(Math.random()*(25 - i))+1;
            caseMappings[i][0] = i;
            caseMappings[i][1] = values.get(random - 1);
            values.remove(random - 1);

            cases[i] = new Case(i,caseMappings[i][1],this);
        }

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
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
