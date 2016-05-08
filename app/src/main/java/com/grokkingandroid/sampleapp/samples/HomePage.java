package com.grokkingandroid.sampleapp.samples;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.grokkingandroid.sampleapp.samples.gcm.R;

public class HomePage extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        getSupportActionBar().show();
        getSupportActionBar().setTitle("CoupleTones");

        Button map = (Button) findViewById(R.id.map);

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Test", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.profile) {
            Intent i = new Intent(HomePage.this, Profile.class);
            startActivity(i);
            return true;
        }

        if(id == R.id.add_location)
        {
            Intent i = new Intent(HomePage.this, MapsActivity.class);
            startActivity(i);
            return true;
        }

        if(id == R.id.search){
            Toast.makeText(getBaseContext(), "Search", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_basesampleactivity, menu);
        return true;
    }
}
