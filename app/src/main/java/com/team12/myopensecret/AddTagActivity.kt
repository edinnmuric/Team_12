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
    private lateinit var chipsGroup: ChipGroup


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_new_tag)
        setTitle(R.string.new_tag)


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


            dataBase.addLabelEntry(LabelData(tagName,"#0000ff", -1))
            val intent = Intent(this, VIewTagActivity::class.java)
            startActivityForResult(intent, 20)
        }

        return super.onOptionsItemSelected(item)
    }


}