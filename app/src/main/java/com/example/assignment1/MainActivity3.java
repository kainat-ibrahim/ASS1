package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeTest(context this,"OnCreate()",Toast.LENGTH_SHORT).show():


    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(context this, text "onStart()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(context this, text "onResume()", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(context this, text"onPause()",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(context this, text"onStop()",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(context this, text"onDestroy()",Toast.LENGTH_SHORT).show();
    }
}