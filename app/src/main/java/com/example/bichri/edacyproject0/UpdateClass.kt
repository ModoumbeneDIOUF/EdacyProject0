package com.example.bichri.edacyproject0

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_update_class.*

class UpdateClass : AppCompatActivity() {
    internal var db = Database(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_update_class)

        upDateData()
    }
    //fonction pour mettre  à jour une  classe

    fun upDateData(){

        btnModifClasse.setOnClickListener {

            try {
                db.updateData(ancienNom.text.toString(),nouveauNomClasse.text.toString())
                ancienNom.setText("")
                nouveauNomClasse.setText("")
                Toast.makeText(this@UpdateClass," modifiacation reussi", Toast.LENGTH_LONG).show()

            }catch (e:Exception){
                Toast.makeText(this@UpdateClass,"Erreur lors de la modifiacation", Toast.LENGTH_LONG).show()

            }
        }
    }
}
