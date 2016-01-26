package com.udacity.myappportfolio.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.udacity.myappportfolio.R;
import com.udacity.myappportfolio.utils.Utilities;

public class MainActivity extends AppCompatActivity {

    Button spotify, scores, library, buildItBigger, reader, capstone;
    private String message = "This button will launch ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        spotify.setOnClickListener(v -> Utilities.toast(this, message + "spotify app"));
        scores.setOnClickListener(v -> Utilities.toast(this, message + "scores app"));
        library.setOnClickListener(v -> Utilities.toast(this, message + "library app"));
        buildItBigger.setOnClickListener(v -> Utilities.toast(this, message + "build it bigger app"));
        reader.setOnClickListener(v -> Utilities.toast(this, message + "reader app"));
        capstone.setOnClickListener(v -> Utilities.toast(this, message + "my capstone app"));


    }

    private void init() {

        spotify = (Button) findViewById(R.id.button1);
        scores = (Button) findViewById(R.id.button2);
        library = (Button) findViewById(R.id.button3);
        buildItBigger = (Button) findViewById(R.id.button4);
        reader = (Button) findViewById(R.id.button5);
        capstone = (Button) findViewById(R.id.button6);
    }
}
