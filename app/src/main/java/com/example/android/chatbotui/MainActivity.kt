package com.example.android.chatbotui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.cb_toolbar
import kotlinx.android.synthetic.main.cb_toolbar_layout.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<androidx.appcompat.widget.Toolbar>(R.id.cb_toolbar)
        toolbar.title = "Rohan"
        toolbar.subtitle = "Active Now"
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
        toolbar.setLogo(R.drawable.image1)
        toolbar.inflateMenu(R.menu.cb_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.cb_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_help -> {
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
