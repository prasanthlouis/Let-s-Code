package com.example.kaitpicco.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by kaitpicco on 9/6/15.
 */
public class DBHelper extends SQLiteOpenHelper {

    public static final String database_name="DATABASES_AWESOME";
    public static final int database_version=1;

    public final String CREATE_TABLE="CREATE TABLE IF NOT EXISTS "+ContractClass.BaseEntry.TABLE_NAME+
            " (" +
            ContractClass.BaseEntry._ID + " INTEGER PRIMARY KEY," +
            ContractClass.BaseEntry.ENTRY_ID + " VARCHAR" + "," +
            ContractClass.BaseEntry.TITLE + " VARCHAR" + "," +
            ContractClass.BaseEntry.RATING + " VARCHAR"+
            " );";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + ContractClass.BaseEntry.TABLE_NAME;

    public DBHelper(Context context) {
        super(context, database_name, null, database_version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);

    }
}
