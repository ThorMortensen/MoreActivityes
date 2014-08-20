package com.example.thor.moreactivityes;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainAct extends Activity {

    private static final String LOGTAG = "MainAct";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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
        return super.onOptionsItemSelected(item);
    }


    public void secondAct(View view)
    {
        Intent intent = new Intent(this,SecondActiv.class);
        startActivity(intent);
    }



    public void click(View view)
    {
        Intent implIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.jetbrains.com/idea/webhelp/viewing-method-parameter-information.html"));
        startActivity(implIntent);

        Button but3 = new Button(this);
        LinearLayout layout = (LinearLayout) findViewById(R.id.mainLay);

        but3.setText("Try me");
        layout.addView(but3);

        but3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                nextClick();
            }
        });
    }

    private void nextClick()
    {
        Intent nextImpInt = new Intent(Intent.ACTION_SEND);
        nextImpInt.putExtra(Intent.EXTRA_TEXT,"blabvlaba");
        nextImpInt.setType("text/plain");
        startActivity(nextImpInt);
    }


}
