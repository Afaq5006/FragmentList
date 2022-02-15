package com.example.fragmentlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class First_Fragment extends Fragment {
    View fragment1View;
    ListView listView;

    String[] AndroidVersion = new String[]{"CupCake", "Donut", "Eclair", "Froyo", "Honeycomb", "Ice Cream Sandwitch", "Jellibean", "Kitkat", "Lollipop", "Marshmallo" ,"Nougat" };
    //int[] imgAdroid = new int[]{R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.honeycomb,R.drawable.jellibean,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marshmallo,R.drawable.nougat};


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragment1View= inflater.inflate(R.layout.fragment_first_, container, false);
        listView = fragment1View.findViewById(R.id.lv_item);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_list_item_1, AndroidVersion);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Second_Fragment second = (Second_Fragment) getFragmentManager().findFragmentById(R.id.fragment2);
                second.pvmethod("AndroidVersion"+ AndroidVersion[i]);
            }
        });

        return fragment1View;
    }
}