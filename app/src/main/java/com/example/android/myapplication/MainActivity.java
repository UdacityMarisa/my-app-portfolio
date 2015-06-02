package com.example.android.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    //1 Spotify Streamer Clicked
    public void spotifyStreamerClicked(View view){
        //show toast message because it was clicked
        Toast toast = Toast.makeText(getApplicationContext(),
                "This button will launch my spotify streamer app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    //2 Super Duo Clicked
    public void scoresAppClicked(View view){
        //show toast message because it was clicked
        Toast toast = Toast.makeText(getApplicationContext(),
                "This button will launch my scores app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    //3 Library App Clicked
    public void libraryAppClicked(View view){
        //show toast message because it was clicked
        Toast toast = Toast.makeText(getApplicationContext(),
                "This button will launch my library app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    //4 Build It Bigger Clicked
    public void buildItBiggerClicked(View view){
        //show toast message because it was clicked
        Toast toast = Toast.makeText(getApplicationContext(),
                "This button will launch my build it bigger app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    //5 XYZ Reader Clicked
    public void xyzReaderClicked(View view){
        //show toast message because it was clicked
        Toast toast = Toast.makeText(getApplicationContext(),
                "This button will launch my xyz reader app!", Toast.LENGTH_SHORT);
        toast.show();
    }

    //6 Capstone Clicked
    public void capstoneClicked(View view){
        //show toast message because it was clicked
        Toast toast = Toast.makeText(getApplicationContext(),
                "This button will launch my capstone app!", Toast.LENGTH_SHORT);
        toast.show();
    }

}
