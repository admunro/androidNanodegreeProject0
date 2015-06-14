package com.example.android.project0myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void showToast(String message)
    {
        CharSequence text = "This button will launch: " + message;

        Toast.makeText(this.getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }

    public void onSpotifyStreamerButtonClicked(View view)
    {
        this.showToast("Spotify Streamer");
    }

    public void onScoresAppButtonClicked(View view)
    {
        this.showToast("Scores");
    }

    public void onLibraryAppButtonClicked(View view)
    {
        this.showToast("Library");
    }

    public void onBuildItBiggerButtonClicked(View view)
    {
        this.showToast("Build It Bigger");
    }

    public void onXYZReaderButtonClicked(View view)
    {
        this.showToast("XYZ Reader Streamer");
    }

    public void onCapstoneMyOwnAppButtonClicked(View view)
    {
        this.showToast("Capstone: My Own App");
    }


}
