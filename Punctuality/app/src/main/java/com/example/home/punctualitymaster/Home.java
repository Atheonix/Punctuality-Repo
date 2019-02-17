package com.example.home.punctualitymaster;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);



        TextView tx = (TextView)findViewById(R.id.title);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "font/");
        tx.setTypeface(custom_font);
    }


   // @Override
    //public void onOptionItemSelected(String link){

    //}
}
