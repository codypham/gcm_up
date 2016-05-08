package com.grokkingandroid.sampleapp.samples;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

import com.grokkingandroid.sampleapp.samples.gcm.R;

public class AddFriend extends Activity {

    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_add_friend);

        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Regular.otf");

        TextView title = (TextView) findViewById(R.id.id_label);
        EditText userId = (EditText) findViewById(R.id.txt_user_account);
        Button add = (Button) findViewById(R.id.add_id);
        Button map = (Button) findViewById(R.id.view_map);

        if(title != null) title.setTypeface(font);
        if(userId != null) userId.setTypeface(font);
        if(add != null) add.setTypeface(font);
        if(map != null) map.setTypeface(font);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getBaseContext(), "Test", Toast.LENGTH_LONG).show();
                //id = userId.getText().toString();
                Intent i = new Intent(AddFriend.this, HomePage.class);
                startActivity(i);
            }
        });

        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Test", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public void onBackPressed() {}
}
