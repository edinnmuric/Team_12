package com.team12.myopensecret

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AddTagActivity: AppCompatActivity() {

    companion object {
        lateinit var dataBase: DataBaseHelper
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_new_tag)
        setTitle(R.string.new_tag)

        dataBase =  DataBaseHelper(this)
        supportActionBar?.setHomeButtonEnabled(true)

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.add_tag_action_bar, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.cancel_tag_button) {
            val intent = Intent(this, VIewTagActivity::class.java)
            startActivityForResult(intent, 20)
        }