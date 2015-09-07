package com.example.kaitpicco.listviewexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.LineNumberInputStream;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener,AdapterView.OnItemClickListener {
    private String s;
    private EditText et;
    private ArrayAdapter<String> arrayAdapter;
    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ListView lv=(ListView)getActivity().findViewById(R.id.listView);
        arrayAdapter=new ArrayAdapter<String>(getContext(),R.layout.aalayout,R.id.textView);
        lv.setAdapter(arrayAdapter);
        Button b=(Button)getActivity().findViewById(R.id.button);
        et=(EditText)getActivity().findViewById(R.id.editText);
        b.setOnClickListener(this);
        lv.setOnItemClickListener(this);

    }

    @Override
    public void onClick(View v) {
        s=et.getText().toString();
        et.setText("");
        arrayAdapter.add(s);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String s=arrayAdapter.getItem(position);
        arrayAdapter.remove(arrayAdapter.getItem(position));
        arrayAdapter.notifyDataSetChanged();
        Toast.makeText(getActivity(),"You removed->"+s,Toast.LENGTH_SHORT).show();
    }
}
