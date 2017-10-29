package com.joketellerlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeTellerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_teller);
        ((TextView)findViewById(R.id.jokeTellerTextView)).setText(getIntent().getExtras().getString(Intent.EXTRA_REFERRER));
    }
}
