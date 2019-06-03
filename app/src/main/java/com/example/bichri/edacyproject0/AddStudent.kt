package com.example.bichri.edacyproject0

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_classe.*
import kotlinx.android.synthetic.main.activity_add_student.*
import java.lang.Exception

class AddStudent : AppCompatActivity() {

    internal var db = Database(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_student)

        addStudent()
    }
    //fonction pour ajouter un éléve
    fun addStudent(){
        btnAddEleve.setOnClickListener {
            try {
                db.addNewStudent(nomEleve.text.toString(),prenomEleve.text.toString(),classeEleve.text.toString())
                nomEleve.setText("")
                prenomEleve.setText("")
                Toast.makeText(this@AddStudent,"Enrigistrement effectué", Toast.LENGTH_LONG).show()
            }catch (e:Exception){

                Toast.makeText(this@AddStudent,"Enrigistrement non effectué", Toast.LENGTH_LONG).show()
            }
        }
    }
}
