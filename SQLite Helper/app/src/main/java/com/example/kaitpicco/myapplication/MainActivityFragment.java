package com.example.kaitpicco.myapplication;

import android.content.ContentValues;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {
    DBHelper db;
    EditText et,et1,et2;
    SQLiteDatabase sqldb;
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
        db=new DBHelper(getContext());

        et=(EditText)getActivity().findViewById(R.id.editText);
        et1=(EditText)getActivity().findViewById(R.id.editText2);
        et2=(EditText)getActivity().findViewById(R.id.editText3);
        Button b=(Button)getActivity().findViewById(R.id.button);
        b.setOnClickListener(this);
        Button b2=(Button)getActivity().findViewById(R.id.button2);
        b2.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.button:
                sqldb = db.getWritableDatabase();
                ContentValues contentValues = new ContentValues();
                contentValues.put(ContractClass.BaseEntry.ENTRY_ID, et.getText().toString());
                contentValues.put(ContractClass.BaseEntry.TITLE, et1.getText().toString());
                contentValues.put(ContractClass.BaseEntry.RATING, et2.getText().toString());
                long newRowId;
                newRowId = sqldb.insert(ContractClass.BaseEntry.TABLE_NAME, null, contentValues);

                Log.v("MAINACT", newRowId + "");
                break;
            case R.id.button2:
                Log.v("MainFrag","HI");
                String projection[]={ContractClass.BaseEntry.ENTRY_ID,ContractClass.BaseEntry.TITLE,ContractClass.BaseEntry.RATING};
                    sqldb=db.getReadableDatabase();
                    Cursor c = sqldb.query(
                    ContractClass.BaseEntry.TABLE_NAME,
                    projection,                               // The columns to return
                    null,                               // The columns for the WHERE clause
                    null,                            // The values for the WHERE clause
                    null,                                     // don't group the rows
                    null,                                     // don't filter by row groups
                    null   // The sort order

                    );
                if(c.moveToFirst())
                {
                    do {
                        Log.v("MainFrag",c.getString(0)+"\n"+c.getString(1)+"\n"+c.getString(2));
                    }while(c.moveToNext());
                }
                break;


        }
    }
}
