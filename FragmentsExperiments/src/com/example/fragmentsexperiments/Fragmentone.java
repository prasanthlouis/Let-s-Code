package com.example.fragmentsexperiments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragmentone extends Fragment {
@Override
public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	View v=inflater.inflate(R.layout.fragmentonelayout,container,false);
	return v;
//	return super.onCreateView(inflater, container, savedInstanceState);
}
}
