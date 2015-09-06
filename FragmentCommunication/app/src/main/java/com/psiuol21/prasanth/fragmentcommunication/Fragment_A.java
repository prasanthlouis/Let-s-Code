package com.psiuol21.prasanth.fragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Prasanth on 8/23/2015.
 */
public class Fragment_A extends Fragment implements View.OnClickListener {
    Communicator comm;
    int counter=0;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Button b=(Button)getActivity().findViewById(R.id.button);
        b.setOnClickListener(this);
        comm=(Communicator)getActivity();

    }

    @Override
    public void onClick(View v) {
        counter+=1;
        comm.communicate(counter+"");
    }
}
