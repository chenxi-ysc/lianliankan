package top.ysccx.myfirstapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author: chasen
 * @date: 2018/12/20
 */
public class DataBaseHelper extends SQLiteOpenHelper {
    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table users (id integer primary key,name varchar(50),time varchar(50),date varchar(50))");
        ContentValues cv = new ContentValues();
        cv.put("name","chasen");
        cv.put("time","1");
        cv.put("date","9012/11/11");
        db.insert("users",null,cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
