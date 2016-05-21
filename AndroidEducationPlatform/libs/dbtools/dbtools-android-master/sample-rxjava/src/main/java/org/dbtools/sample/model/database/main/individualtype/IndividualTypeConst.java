/*
 * IndividualType.java
 *
 * GENERATED FILE - DO NOT EDIT
 * CHECKSTYLE:OFF
 * 
 */



package org.dbtools.sample.model.database.main.individualtype;

import android.database.Cursor;


@SuppressWarnings("all")
public class IndividualTypeConst {

    public static final String DATABASE = "main";
    public static final String TABLE = "INDIVIDUAL_TYPE";
    public static final String FULL_TABLE = "main.INDIVIDUAL_TYPE";
    public static final String PRIMARY_KEY_COLUMN = "_id";
    public static final String C_ID = "_id";
    public static final String FULL_C_ID = "INDIVIDUAL_TYPE._id";
    public static final String C_NAME = "NAME";
    public static final String FULL_C_NAME = "INDIVIDUAL_TYPE.NAME";
    public static final String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS INDIVIDUAL_TYPE (" + 
        "_id INTEGER PRIMARY KEY  AUTOINCREMENT," + 
        "NAME TEXT NOT NULL," + 
        "UNIQUE(NAME)" + 
        ");" + 
        "" + 
        "" + 
        "INSERT INTO INDIVIDUAL_TYPE (_id, NAME) VALUES (0, 'Head');" + 
        "INSERT INTO INDIVIDUAL_TYPE (_id, NAME) VALUES (1, 'Spouse');" + 
        "INSERT INTO INDIVIDUAL_TYPE (_id, NAME) VALUES (2, 'Child');" + 
        "" + 
        "";
    public static final String DROP_TABLE = "DROP TABLE IF EXISTS INDIVIDUAL_TYPE;";
    public static final String INSERT_STATEMENT = "INSERT INTO INDIVIDUAL_TYPE (NAME) VALUES (?)";
    public static final String UPDATE_STATEMENT = "UPDATE INDIVIDUAL_TYPE SET NAME=? WHERE _id = ?";

    public IndividualTypeConst() {
    }

    public static long getId(Cursor cursor) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(C_ID));
    }

    public static String getName(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow(C_NAME));
    }


}