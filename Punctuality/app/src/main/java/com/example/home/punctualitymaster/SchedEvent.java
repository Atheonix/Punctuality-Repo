package com.example.home.punctualitymaster;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchedEvent {

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState) {

        SchedEvent[] eventData = WhitneyNormalBellSchedule.schedule;
        List<SchedEvent> schedEvents = new ArrayList<SchedEvent>(Arrays.asList(eventData));

        ArrayAdapter<SchedEvent> schedEventArrayAdapter = new ArrayAdapter<SchedEvent>(getActivity(), R.layout.event_view, R.id.eVLinLayout, schedEvents);

        View rootView = inflater.inflate(R.layout.schedule_list, container, false);

        ListView listView = (ListView)rootView.findViewById(R.id.options) ;
        listView.setAdapter(schedEventArrayAdapter);

        return rootView;

    }

    private String Name;
    private String Begin;
    private String End;

    public SchedEvent(String name, String begin, String  end){
        Name=name;
        Begin=begin;
        End=end;
    }




}
