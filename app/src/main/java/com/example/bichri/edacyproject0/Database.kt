package com.example.bichri.edacyproject0

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class Database (context:Context):

        SQLiteOpenHelper(context,"database",null,1){


    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE classe (id INTEGER PRIMARY KEY" +
                "AUTOINCREMENT,numeroClasse, nomClasse TEXT,),CREATE TABLE eleve(idEleve INTEGER AUTOINCREMENT,nomEleve TEXT,prenomEleve TEXT,classe TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS classe")
        onCreate(db)
    }

    fun insertData(numeroClasse:String,nomClasse:String){
        val  db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put("numeroClasse",numeroClasse)
        contentValues.put("nomClasse",nomClasse)
        db.insert("classe",null,contentValues)
    }

    fun updateData(ancienNom:String,nomClasse:String):Boolean{
        val  db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put("nomClasse",nomClasse)
        db.update("classe",contentValues,"ancienNom = ?", arrayOf(ancienNom))
        return true
    }

    fun deleteData(nomClassSup:String):Int{
        val db = this.writableDatabase
        return db.delete("classe","nomClassSup = ?", arrayOf(nomClassSup))
    }

    val getOne : Cursor
        get() {
            val  db = this.writableDatabase
            val res = db.rawQuery("SELECT * FROM classe",null)
            return res
        }

    fun addNewStudent(nomEleve:String,prenomEleve:String,classe:String){
        val  db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put("nomEleve",nomEleve)
        contentValues.put("prenomEleve",prenomEleve)
        contentValues.put("classe",classe)
        db.insert("eleve",null,contentValues)

    }
}
