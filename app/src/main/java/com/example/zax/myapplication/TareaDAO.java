package com.example.zax.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Zax on 13/09/2015.
 */
public class TareaDAO {
    public static final String _tabla = "tareas";
    public static final String c_id = "_id";
    public static final String c_titulo = "tar_titulo";
    public static final String c_desc = "tar_desc";
    public static final String c_estado = "tar_estado";
    public static final String c_created = "tar_created";
    public static final String c_alerta = "tar_alerta";
    public static final String c_repeticion = "tar_repeticion";
    public static final String c_modified = "tar_modified";
    public static final String c_finished = "tar_finished";
    public static final String c_prioridad = "tar_prioridad";
    private Context contexto;
    private TareaDB tareaDB;
    private SQLiteDatabase DB;
    private String Columnas[] = new String[]{c_id,c_titulo,c_desc,c_alerta,c_created,c_estado,c_finished,c_modified,c_prioridad,c_repeticion};



}
