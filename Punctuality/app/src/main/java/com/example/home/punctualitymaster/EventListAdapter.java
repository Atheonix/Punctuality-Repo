package com.example.home.punctualitymaster;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class EventListAdapter extends ArrayAdapter {

    private final Activity context;
    private final String[] startArray;
    private final String[] nameArray;
    private final String[] endArray;


    public EventListAdapter(Activity context, String[] nameArrayParam, String[] endArrayParam, String[] startArrayParam) {

        super(context, R.layout.event_object_layout, nameArrayParam);

        this.context = context;
        this.startArray = startArrayParam;
        this.nameArray = nameArrayParam;
        this.endArray = endArrayParam;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.event_object_layout, null, true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.nameID);
        TextView endTextField = (TextView) rowView.findViewById(R.id.end);
        TextView startTextView = (TextView) rowView.findViewById(R.id.begin);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        endTextField.setText(endArray[position]);
        startTextView.setText(startArray[position]);

        return rowView;

    };





}

