package com.grokkingandroid.sampleapp.samples;

import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.grokkingandroid.sampleapp.samples.gcm.R;

public class Profile extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        getSupportActionBar().show();
        getSupportActionBar().setTitle("Profile");

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Regular.otf");

        TextView name = (TextView) findViewById(R.id.name);
        Button partner = (Button) findViewById(R.id.add_partner);
        Button favorites = (Button) findViewById(R.id.log_out_button);
        Button log_out = (Button) findViewById(R.id.view_favorites);

        if(name != null) name.setTypeface(font);
        if(favorites != null) favorites.setTypeface(font);
        if(log_out != null) log_out.setTypeface(font);
        if(partner != null) partner.setTypeface(font);
    }

}
