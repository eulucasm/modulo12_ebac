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

        val navHost =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHost.navController

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {

            val action =FirstFragmentDirections.actionFirstFragmentToSecondFragment("Lucão",33)
            navController.navigate(action)
        }

    }
}