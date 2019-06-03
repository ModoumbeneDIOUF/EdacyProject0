package com.example.bichri.edacyproject0

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_delete_classe.*
import java.lang.Exception

class DeleteClasse : AppCompatActivity() {
    internal var db = Database(this)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_classe)

        deleteClasse()
    }
    //fonction pour supprimer une classe

    fun deleteClasse(){

            btnSuppClasse.setOnClickListener {
               try {
                   db.deleteData(nomClassSup.text.toString())
                   nomClassSup.setText("")
                   Toast.makeText(this@DeleteClasse,"Suppression bien effectué", Toast.LENGTH_LONG).show()

               } catch (e:Exception){
                   Toast.makeText(this@DeleteClasse,"Erreur lors de la suppression", Toast.LENGTH_LONG).show()

               }
            }

    }
}
