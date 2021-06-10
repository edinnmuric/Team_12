package com.team12.myopensecret

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class AddTagActivity: AppCompatActivity() {

    companion object {
        lateinit var dataBase: DataBaseHelper
    }
    private lateinit var chipsGroup: ChipGroup


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_new_tag)
        setTitle(R.string.new_tag)

        dataBase =  DataBaseHelper(this)
        supportActionBar?.setHomeButtonEnabled(true)

        val chip = Chip(this)
        chip.isClickable = true
        chip.isCheckable = true
        chip.isFocusable = true
        chip.isCloseIconVisible = true
        chipsGroup = findViewById(R.id.chips_view)

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

        if(item.itemId == R.id.add_tag_button) {
            val name = findViewById<EditText>(R.id.new_tag_name)
            val tagName = name.getText().toString()
            var color = "#FF0000"
            val chips: Chip? = findViewById(chipsGroup.checkedChipId)
            if(chips?.text == "blue") {
                color = "#008080"
            }
            if(chips?.text == "green") {
                color = "#607D3B"
            }
            if(chips?.text == "red") {
                color = "#FF0000"
            }
            if(chips?.text == "yellow") {
                color = "#FFF200"
            }
            if(chips?.text == "purple") {
                color = "#AF77D5"
            }
            if(chips?.text == "grey") {
                color = "#555555"
            }if(chips?.text == "teal") {
                color = "#007788"
            }
            if(chips?.text == "black") {
                color = "#000000"
            }


            dataBase.addLabelEntry(LabelData(tagName,color, -1))
            val intent = Intent(this, VIewTagActivity::class.java)
            startActivityForResult(intent, 20)
        }

        return super.onOptionsItemSelected(item)
    }


}