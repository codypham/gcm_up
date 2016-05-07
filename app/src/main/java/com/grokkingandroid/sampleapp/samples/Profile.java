package com.grokkingandroid.sampleapp.samples;

import android.os.Bundle;
import android.app.Activity;

import com.grokkingandroid.sampleapp.samples.gcm.R;

public class Profile extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

}
