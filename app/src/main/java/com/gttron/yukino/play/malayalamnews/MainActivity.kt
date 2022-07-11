package com.gttron.yukino.play.malayalamnews

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val anet = findViewById<ImageButton>(R.id.anet)
        val man = findViewById<ImageButton>(R.id.man)
        val mat = findViewById<ImageButton>(R.id.mat)
try {


    anet.setOnClickListener {
        val intent =
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=PNR06O9sSio"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.setPackage("com.google.android.youtube")
        startActivity(intent)
    }
    man.setOnClickListener {
        val intent =
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=JtLBF_Gjeiw"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.setPackage("com.google.android.youtube")
        startActivity(intent)
    }

    mat.setOnClickListener {
        val intent =
            Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=YGEgelAiUf0"))
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.setPackage("com.google.android.youtube")
        startActivity(intent)
    }

}
catch (e : Exception){
    Toast.makeText(applicationContext,"Please Install Youtube",Toast.LENGTH_LONG).show()
}

    }
}

