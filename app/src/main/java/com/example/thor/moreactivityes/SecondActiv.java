package com.example.thor.moreactivityes;

import android.app.Activity;
import android.os.Bundle;
import android.text.AndroidCharacter;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;


public class SecondActiv extends Activity {

    private static final String LOGTAG = "SecondAct";
    LinearLayout view;
    int butNr = 0;


    private void makeBut ()
    {
        Button button = new Button(this);
        button.setText("But "+ butNr++ );
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                makeBut();
            }
        });


        view.addView(button);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        view = (LinearLayout) findViewById(R.id.topLin);
        makeBut();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.second, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == android.R.id.home)
            finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(LOGTAG, "On Destroy");
    }

    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(LOGTAG, "On Start");
    }

    @Override
    protected void onStop()
    {
        super.onStop();
        Log.d(LOGTAG, "On Stop");
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(LOGTAG, "On Restart");
    }

    @Override
    protected void onResume()
    {
        Log.d(LOGTAG, "On Resume");
        super.onResume();
    }
}
