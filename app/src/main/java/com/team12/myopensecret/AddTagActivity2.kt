package com.team12.myopensecret


import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity


class AddTagActivity2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_new_tag)
        setTitle(R.string.new_tag)
        }

        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.add_tag_action_bar, menu)
            return super.onCreateOptionsMenu(menu)
        }

    }