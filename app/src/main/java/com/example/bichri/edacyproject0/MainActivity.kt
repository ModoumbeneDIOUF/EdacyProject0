package com.example.bichri.edacyproject0

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ajouter.setOnClickListener {

            val intent = Intent(this,AddClasse::class.java)
            startActivity(intent)
        }

        modifier.setOnClickListener {

            val intent = Intent(this,UpdateClass::class.java)
            startActivity(intent)
        }

        supprimer.setOnClickListener {

            val intent = Intent(this,DeleteClasse::class.java)
            startActivity(intent)
        }

        ajout_eleve.setOnClickListener {

            val intent = Intent(this,AddStudent::class.java)
            startActivity(intent)
        }



    }
}
