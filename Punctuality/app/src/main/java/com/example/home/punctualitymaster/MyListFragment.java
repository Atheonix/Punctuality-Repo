package com.example.home.punctualitymaster;
/*
import android.app.Activity;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MyListFragment extends Fragment {
  private OnItemSelectedListener listener;
  List<String> optionListing;
  List<String> optionDetails;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        optionListing = new ArrayList<String>(Arrays.asList(DummyData.options));
        optionDetails = new ArrayList<String>(Arrays.asList(DummyData.option_data));

        final ArrayAdapter<String> mOptionAdapter = new ArrayAdapter<String>(getActivity(), R.layout.option_item, R.id.option_tv, optionListing);

        View rootView = inflater.inflate(R.layout.option_item, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.options);
        listView.setAdapter(mOptionAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String optionIndexString = mOptionAdapter.getItem(position);
                String info = optionIndexString + "\n\n\n" + optionDetails.get(position);
                updateDetail(info);
            }
        });
        return rootView;
    }

    public interface OnItemSelectedListener{
        public void onOptionItemSelected(String link);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        if(activity instanceof OnItemSelectedListener){
            listener = (OnItemSelectedListener) activity;}
            else {
            throw new ClassCastException(activity.toString() + " must implement " + " MyListFragment.OnItemSelectedListener");
        }
    }

    public void updateDetail(String info){
        listener.onOptionItemSelected(info);
    }
}
*/