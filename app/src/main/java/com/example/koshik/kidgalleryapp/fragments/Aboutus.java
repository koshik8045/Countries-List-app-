package com.example.koshik.kidgalleryapp.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.koshik.kidgalleryapp.R;
import com.example.koshik.kidgalleryapp.activities.MainActivity;

/**
 * Created by koshik on 04-12-2016.
 */

public class Aboutus extends Fragment {

    public static Aboutus getInstance() {
        return new Aboutus();
    }


    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.about_us_fragmnet, container, false);
        TextView emailLink = (TextView) view.findViewById(R.id.myEmail);
        return view;
    }

}
