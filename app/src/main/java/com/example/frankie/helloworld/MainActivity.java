package com.example.frankie.helloworld;

// THIS FILE IS TO LOG THE SCREEN LIFECYCLE AND SCREEN ORIENTATION

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);  //Telling the code that the xml data is in that file.  activity_main
        Log.d("TEST1", "onCreate was called");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TEST1", "onResume was called");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TEST1", "onStart was called");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TEST1", "onStop was called");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TEST1", "onPause was called");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TEST1", "onRestart was called");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TEST1", "onDestroy was called");
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) { //////////// Configuration.ORIENTATION_LANDSCAPE IS INTEGERS SO JUST PRINT USING IF COMING
        super.onConfigurationChanged(newConfig);
        Log.d("TEST1", "orientation changed");// after enabling in the manifest.  This will write the orientation in the log.
        Log.d("TEST1",""+ newConfig.orientation);// printing orientation , 1 or 2

        if(newConfig.orientation==Configuration.ORIENTATION_LANDSCAPE)
        {
            Log.d("TEST1", "Welcome to Landscape Mode");
        }else if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT)// dont forget to use the else if, if another if.
        {
            Log.d("TEST1", "Welcome to Portrait Mode");
        }
    }
}
