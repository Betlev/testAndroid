package com.example.zax.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
/**
 * Created by Zax on 13/09/2015.
 */
public class TareaDB extends SQLiteOpenHelper {
    public TareaDB(Context contexto, String nombre, CursorFactory factory, int version){
        super(contexto,nombre,factory,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL("CREATE TABLE tareas (_id INTEGER PRIMARY KEY,tar_titulo TEXT,tar_desc TEXT,"
                +"tar_estado INTEGER,tar_created TEXT,tar_alerta TEXT, tar_repeticion integer, tar_modified TEXT, tar_finished TEXT,"
                + "tar_prioridad INTEGER);");
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer){

    }
}
