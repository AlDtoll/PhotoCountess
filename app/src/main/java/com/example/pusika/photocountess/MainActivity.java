package com.example.pusika.photocountess;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    SharedPreferences prefs = null;
    TextView great;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        prefs = getPreferences(MODE_PRIVATE);

        if (prefs.getBoolean("firstrun", true)) {
            // Do first run stuff here then set 'firstrun' as false
            // using the following line to edit/commit prefs
            prefs.edit().putBoolean("firstrun", false).commit();
            setContentView(R.layout.activity_main);

            ViewPager pager = findViewById(R.id.pager);
            pager.setAdapter(new MyAdapter(getSupportFragmentManager()));
        } else {
            setContentView(R.layout.activity_main2);
            great = findViewById(R.id.great);
            final Context context = getApplicationContext();
            great.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, SecondActivity.class);
                    startActivity(intent);
                }
            });
        }
    }
}
