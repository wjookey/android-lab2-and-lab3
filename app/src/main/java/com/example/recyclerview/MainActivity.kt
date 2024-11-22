package com.example.recyclerview

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView : RecyclerView
    private lateinit var arr : ArrayList<Music>
    lateinit var coverId : Array<Int>
    lateinit var songName : Array<String>
    lateinit var singer : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        coverId = arrayOf(
            R.drawable.coldplay,
            R.drawable.cte,
            R.drawable.id,
            R.drawable.kraftklub,
            R.drawable.maneskin,
            R.drawable.nf,
            R.drawable.saybia,
            R.drawable.ss,
            R.drawable.tn
        )

        songName = arrayOf(
            "Paradise",
            "Come A Little Closer",
            "Follow you",
            "Fan von Dir",
            "Trastevere",
            "HAPPY",
            "Empty Stairs",
            "It Can't Come Quickly Enough",
            "Beach"
        )

        singer = arrayOf(
            "Coldplay",
            "Cage The Elephant",
            "Imagine Dragons",
            "Kraftklub",
            "Maneskin",
            "NF",
            "Saybia",
            "Scissor Sisters",
            "The Neighbourhood"
        )

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)

        arr = arrayListOf<Music>()
        getUserData()
    }

    private fun getUserData() {
        for (i in coverId.indices) {
            val music = Music(coverId[i], songName[i], singer[i])
            arr.add(music)
        }
        recyclerView.adapter = Adapter(arr)
    }
}