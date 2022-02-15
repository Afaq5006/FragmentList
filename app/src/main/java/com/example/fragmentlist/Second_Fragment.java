package com.example.fragmentlist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Second_Fragment extends Fragment {
    //ImageView imageView;
    TextView textView;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second_, container, false);


        textView = (TextView) view.findViewById(R.id.tv_second);

        return view;
    }




    public void pvmethod(String s) {

        textView.setText(s);
    }
}