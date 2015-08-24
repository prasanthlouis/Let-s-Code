package com.psiuol21.prasanth.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Prasanth on 8/24/2015.
 */
public class Fragment_A extends Fragment implements View.OnClickListener{
    int counter=0;
    Communicator comm;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
      return  inflater.inflate(R.layout.fragment_a,container,true);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        comm=(Communicator)this.getActivity();
        Button b=(Button)getActivity().findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public void onClick(View v) {
        counter+=1;
        comm.sendData(counter);

    }


}
