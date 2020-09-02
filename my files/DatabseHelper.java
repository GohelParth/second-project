package com.example.parth.basicdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by parth on 7/21/2020.
 */

public class DatabseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "Database.db";

    private static final String TABLE_NAME = "UserTable";

    /*private static final String COL_ID = "id";
    private static final String COL_NAME = "name";
    private static final String COL_ADD = "add";*/

    //SQLiteDatabase database;

    public DatabseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME + "(id INTEGER PRIMARY KEY,name TEXT,add TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        //sqLiteDatabase.close();
        onCreate(sqLiteDatabase);
    }

    /*public boolean InsertData(String Name, String Add) {
        SQLiteDatabase db = this.getWritableDatabase();
    }
}
       ContentValues contentValues = new ContentValues();
        contentValues.put(COL_NAME, Name);
        contentValues.put(COL_ADD, Add);
        long result = db.insert(TABLE_NAME,null,contentValues);
        db.close();

        if (result == -1){

                return false;
        }
        else {
            return true;
        }
    }*/
}
