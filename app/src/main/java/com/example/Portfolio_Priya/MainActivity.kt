package com.example.Portfolio_Priya

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun switchActivity(view: View) {
        val intent= Intent(this@MainActivity, NextActivity::class.java )
        startActivity(intent)
    }



    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.About -> {
                val intent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://www.linkedin.com/in/priya-priya-14980122b/")
                )
                startActivity(intent)
            }
            R.id.Resume -> {
                val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("val intent = Intent(Intent.ACTION_VIEW, Uri.parse(\"https://developer.android.com/develop/ui/views/components/menus\"))\n" +
                        "                startActivity(intent)")
            )
            startActivity(intent)
        }
            R.id.Exit -> {
//                val intent= Intent(this@MainActivity, NextActivity::class.java )
//                startActivity(intent)
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }

}