package com.example.kaitpicco.myapplication;

import android.provider.BaseColumns;

/**
 * Created by kaitpicco on 9/6/15.
 */
public class ContractClass {
    public void ContractClass(){

    }
    public abstract class BaseEntry implements BaseColumns{
        public final static String TABLE_NAME="Table_Prasanth";
        public final static String ENTRY_ID="ID";
        public final static String TITLE="Title";
        public final static String RATING="Rating";

    }
}
