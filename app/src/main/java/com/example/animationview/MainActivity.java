package com.example.animationview;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void rotate(View view)
    {
        TextView txt = (TextView) findViewById(R.id.animtext);
        txt.animate().rotationYBy(45).rotationXBy(45).setDuration(2000);
    }

    public void scale(View view)
    {
        TextView txt = (TextView) findViewById(R.id.animtext);
        txt.animate().scaleXBy(0.5f).scaleYBy(0.5f).setDuration(2000);
    }

    public void disappear(View view)
    {
        TextView txt = (TextView) findViewById(R.id.animtext);
        txt.animate().alpha(0.20f).setDuration(2000);
    }

    public void translate(View view)
    {
        TextView txt = (TextView) findViewById(R.id.animtext);
        txt.animate().translationXBy(50).translationYBy(50).setDuration(2000);
    }
}