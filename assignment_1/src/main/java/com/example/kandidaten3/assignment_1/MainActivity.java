package com.example.kandidaten3.assignment_1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    //Random rand = new Random();
    int quoteNumber = 0;

    public void buttonOnClick(View v) {
        Log.i("MyApp", "Button Pressed");
        TextView t1 = (TextView) findViewById(R.id.textOut);

        t1.setText(null);

        String[] quotes = getResources().getStringArray(R.array.quotes);
        quoteNumber = quoteNumber + 1;
        if (quoteNumber == 4){
            quoteNumber = 1;
        }
        t1.setText(quotes[quoteNumber]);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("onCreate", "started");
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
}
