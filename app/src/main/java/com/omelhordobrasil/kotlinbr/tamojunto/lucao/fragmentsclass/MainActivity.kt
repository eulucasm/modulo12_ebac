package com.omelhordobrasil.kotlinbr.tamojunto.lucao.fragmentsclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val secondFragment = SecondFragment()
            val fragmentsTransaction = supportFragmentManager.beginTransaction()
            fragmentsTransaction.replace(R.id.fragmentContainerView2, secondFragment)
            fragmentsTransaction.commit()
        }

        val firstFragment = FirstFragment.newInstance("Lucao", "Marques")
        val fragmentsTransaction = supportFragmentManager.beginTransaction()
        fragmentsTransaction.add(R.id.fragmentContainerView2, firstFragment)
        fragmentsTransaction.commit()
    }
}