package com.example.sprawdzeniekompatybilnosciide

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {



        //szablon: BottomNavigationActivity
        //najstarszy kompatybilny system: Android 4.4 Kitkat
        //telefon na którym testowałem u siebie: Pixel 4 API 24 z obrazem systemu Nougat 7.0


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications))
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        Toast.makeText(this, "Aplikacja działa", Toast.LENGTH_SHORT).show()
        var textView :TextView = this.findViewById(R.id.textView)
        textView.setText("Wszystko działa")

    }
}