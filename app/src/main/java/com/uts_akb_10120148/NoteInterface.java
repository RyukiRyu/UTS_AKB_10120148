package com.uts_akb_10120148;

import android.database.Cursor;

import com.uts_akb_10120148.model.Note;

public interface NoteInterface {

    public Cursor read();
    public boolean create(Note note);
    public boolean update(Note note);
    public boolean delete(String id);
}


// 10120148_AriyandiJulianPratama

