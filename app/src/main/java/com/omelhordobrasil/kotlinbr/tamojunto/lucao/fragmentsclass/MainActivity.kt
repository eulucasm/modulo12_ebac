package com.omelhordobrasil.kotlinbr.tamojunto.lucao.fragmentsclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment
import com.omelhordobrasil.kotlinbr.tamojunto.lucao.fragmentsclass.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHost.navController

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
//            val secondFragment = SecondFragment()
//            val fragmentsTransaction = supportFragmentManager.beginTransaction()
//            fragmentsTransaction.replace(R.id.fragmentContainerView2, secondFragment)
//            fragmentsTransaction.commit()

            navController.navigate(R.id.action_firstFragment_to_secondFragment)
        }

    }
}