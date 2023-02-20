package com.example.activitylifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //First time initialized
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.i("RoutineDealingWithExist", "onCreate => ");
    }

    //After Stopped
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
        Log.i("Routine", "onRestart => ");
    }

    //Visible
    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
        Log.w("RoutineDealingWithVis", "onStart => ");
    }

    //Got focus
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
        Log.e("RoutineDealingWithFocus", "onResume => ");
    }

    //Lost focus
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
        Log.i("RoutineDealingWithFocus", "onPause => ");
        //Code for saving data
    }

    //Not visible
    @Override
    protected void onStop() {
        super.onStop();
        Log.i("RoutineDealingWithVis", "onStop => ");
        //Code for saving data
    }

    //Destroyed, memory freed
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("RoutineDealingWithExist", "onDestroy => ");
    }

    public void onBtnOpenUrlClick(View view) {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
        startActivity(i);
    }
}