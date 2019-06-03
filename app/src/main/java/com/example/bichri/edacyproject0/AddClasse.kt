package com.example.bichri.edacyproject0

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_add_classe.*

class AddClasse : AppCompatActivity() {

        internal var db = Database(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_classe)

        addNewClass()
    }
    //fonction pour ajouter une classe

    fun addNewClass(){

        btnAddClass.setOnClickListener {
            try {
                db.insertData(numeroClasse.text.toString(),nomClasse.text.toString())
                numeroClasse.setText("")
                nomClasse.setText("")
                Toast.makeText(this@AddClasse,"Enrigistrement effectué",Toast.LENGTH_LONG).show()

            }catch (e:Exception){
                Toast.makeText(this@AddClasse,"Erreur lors de l'enrigistrement",Toast.LENGTH_LONG).show()
            }
        }
    }
}
