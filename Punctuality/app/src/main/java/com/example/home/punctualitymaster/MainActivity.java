package com.example.home.punctualitymaster;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;


import static com.example.home.punctualitymaster.DummyData.endArray;
import static com.example.home.punctualitymaster.DummyData.nameArray;
import static com.example.home.punctualitymaster.DummyData.startArray;

public class MainActivity extends Activity {

    private TextView scheduleTV;
    //List<String> schedList;
    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        EventListAdapter whatever = new EventListAdapter(this, nameArray, endArray, startArray);
        listView = (ListView) findViewById(R.id.editor_list_view);
        listView.setAdapter(whatever);

        TextView tx = (TextView)findViewById(R.id.textView);
        //Typeface custom_font = ResourcesCompat.getFont(this, R.font.conthrax);
        //Typeface custom_font = getResources().getFont(R.id.conthrax);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "res/font/cubic.ttf");
        tx.setTypeface(custom_font);


       /* ListView listView = (ListView)findViewById(R.id.editor_list_view);

        scheduleTV = (TextView)findViewById(R.id.listTV);

        schedList = new ArrayList<String>(Arrays.asList(DummyData.schedule));




        final ArrayAdapter<RelativeLayout> listAdapter = new ArrayAdapter<RelativeLayout>(this, R.layout.event_object_layout, R.id.eventLayout, schedList);

        listView.setAdapter(listAdapter);
*/

    }



}
