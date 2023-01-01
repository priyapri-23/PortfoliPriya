package com.example.Portfolio_Priya

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.next_activity)


    }

    fun linked(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/priya-priya-14980122b/"))
        startActivity(intent)
    }

}